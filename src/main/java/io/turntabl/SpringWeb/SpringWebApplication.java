package io.turntabl.SpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.NonNullApi;

//@Api
//@EnableSwagger2
@SpringBootApplication
public class SpringWebApplication {

	//@ApiOperation("Addition and Subtraction")
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

}
