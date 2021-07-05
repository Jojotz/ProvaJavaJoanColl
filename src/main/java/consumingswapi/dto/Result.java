package consumingswapi.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	
	private String name;
	private String birth_year; 
	private String eye_color;
	private String gender;
	private String hair_color;
	private String height;
	private String mass ;
	private String skin_color;
	private String homeworld;
	private List<String> films = new ArrayList<>();
	private List<String> species = new ArrayList<>();
	private List<String> vehicles = new ArrayList<>();
	private List<String> starships = new ArrayList<>();
	private String url;
	private LocalDateTime created;
	private LocalDateTime edited;
	
}