package consumingswapi.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class People {
	
	@ApiModelProperty (notes = "Total count of characters")
	private int count;
	
	@ApiModelProperty (notes = "Uri for the next page of results")
	private String next;
	
	@ApiModelProperty (notes = "Uri for the previous page of results")
	private String previous;
	
	private List <Result> results = new ArrayList<>();
	
}