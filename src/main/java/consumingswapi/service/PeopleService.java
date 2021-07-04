package consumingswapi.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import consumingswapi.dto.People;
import consumingswapi.dto.Result;

@Service
public class PeopleService {

	private final RestTemplate restTemplate;
	
	@Autowired
	public PeopleService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public People consumeSwapi () {
		
		People people = restTemplate.getForObject ("https://swapi.dev/api/people/", People.class);
		List<Result> results = people.getResults();
		int n = 2;
		
		do {
			String endpoint = "https://swapi.dev/api/people/?page="+n;
			people = restTemplate.getForObject (endpoint, People.class);
			results = Stream.concat(results.stream(), people.getResults().stream())
                    .collect(Collectors.toList()); 
			n += 1;
		} while (people.getNext() != null);
		
		List<Result> sortedResults = results.stream()
				.sorted(Comparator.comparing(Result::getCreated).reversed())
				.collect(Collectors.toList());
		
		for(Result sortedResult : sortedResults) {
            System.out.println(sortedResult.toString());
        }
				
		return people;

	}
}
