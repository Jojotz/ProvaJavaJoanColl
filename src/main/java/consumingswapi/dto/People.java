package consumingswapi.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

/*import lombok.Getter;
import lombok.Setter;
import lombok.ToString;*/

//@Getter
//@Setter
//@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class People {
	
	@ApiModelProperty (notes = "Total count of characters")
	private int count;
	
	@ApiModelProperty (notes = "Uri for the next page of results")
	private String next;
	
	@ApiModelProperty (notes = "Uri for the previous page of results")
	private String previous;
	
	private List <Result> results = new ArrayList<>();
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
}