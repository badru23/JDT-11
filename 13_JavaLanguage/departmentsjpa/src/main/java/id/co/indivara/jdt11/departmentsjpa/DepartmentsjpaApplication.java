package id.co.indivara.jdt11.departmentsjpa;

import id.co.indivara.jdt11.departmentsjpa.entity.Department;
import id.co.indivara.jdt11.departmentsjpa.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DepartmentsjpaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentsjpaApplication.class, args);
	}

	@Profile("startpertama")
	@Bean
	CommandLineRunner isiDataPertama(DepartmentRepository departmentRepository){
		return args -> {
			departmentRepository.save(new Department(new Long(1),"IT", "Jln. Ayam", "D01"));
			departmentRepository.save(new Department(new Long(2),"FINANCE", "Jln. Bebek", "D02"));
			departmentRepository.save(new Department(new Long(3),"HR", "Jln. Burung", "D03"));
		};
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(DepartmentsjpaApplication.class);
	}

}
