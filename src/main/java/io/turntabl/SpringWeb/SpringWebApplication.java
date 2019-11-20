package io.turntabl.SpringWeb;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turntabl.SpringWeb.controllers.Maths;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

	@Bean
	public Maths maths(){
		return new Maths();
	}
}
