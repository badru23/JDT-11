package id.co.indivara.jdt11.employeesjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmployeesjpaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesjpaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(EmployeesjpaApplication.class);
	}


}
