package consumingswapi;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;

@EnableSwagger2
@Configuration
public class AppConfig {
	
	@Bean
	public RestTemplate restTemplate () {
		
		return new RestTemplate ();
	}
	
	@Bean
	public Docket productApi () {
		return new Docket (DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("consumingswapi"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
		
	}

	private ApiInfo apiInfo() {
		
		ApiInfo apiInfo = new ApiInfo ("Prova Tècnica Joan Coll - Consuming RESTful Web service",
				"Consuming JSON from swapi.com and printing it through the console sorted", 
				"1.0",
				"Terms of Service", 
				new Contact("Joan Coll", "https://github.com/Jojotz", "jcoll1@gmail.com"), 
			      "License of API", "API license URL", Collections.emptyList());
				
		return apiInfo;
	}
	
}
