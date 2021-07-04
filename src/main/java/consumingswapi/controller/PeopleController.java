package consumingswapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import consumingswapi.dto.People;
import consumingswapi.service.PeopleService;

@RestController
public class PeopleController {
	
	private final PeopleService service;
	
	@Autowired
	public PeopleController(PeopleService service) {
		this.service = service;
	}

	@GetMapping("/")
	public ResponseEntity<People> getData() {
		return new ResponseEntity<>(service.consumeSwapi(), HttpStatus.OK);		 
	}

}
