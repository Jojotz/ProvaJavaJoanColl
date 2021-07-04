package consumingswapi.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;*/

//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}
	public String getEye_color() {
		return eye_color;
	}
	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHair_color() {
		return hair_color;
	}
	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMass() {
		return mass;
	}
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getSkin_color() {
		return skin_color;
	}
	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}
	public String getHomeworld() {
		return homeworld;
	}
	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}
	public List<String> getFilms() {
		return films;
	}
	public void setFilms(List<String> films) {
		this.films = films;
	}
	public List<String> getSpecies() {
		return species;
	}
	public void setSpecies(List<String> species) {
		this.species = species;
	}
	public List<String> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}
	public List<String> getStarships() {
		return starships;
	}
	public void setStarships(List<String> starships) {
		this.starships = starships;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getEdited() {
		return edited;
	}
	public void setEdited(LocalDateTime edited) {
		this.edited = edited;
	}
	
	@Override
	public String toString() {
		return "Result [name=" + name + ", birth_year=" + birth_year + ", eye_color=" + eye_color + ", gender=" + gender
				+ ", hair_color=" + hair_color + ", height=" + height + ", mass=" + mass + ", skin_color=" + skin_color
				+ ", homeworld=" + homeworld + ", films=" + films + ", species=" + species + ", vehicles=" + vehicles
				+ ", starships=" + starships + ", url=" + url + ", created=" + created + ", edited=" + edited + "]";
	} 	
	
	
}