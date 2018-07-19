package com.in28minutes.springboot.basics.springbootintensteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootInTenStepsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringbootInTenStepsApplication.class, args);
		
		/*for (String bean : appContext.getBeanDefinitionNames()) {
			System.out.println(bean);
		}*/
	}
}
