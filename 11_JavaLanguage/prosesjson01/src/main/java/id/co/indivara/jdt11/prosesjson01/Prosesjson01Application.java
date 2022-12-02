package id.co.indivara.jdt11.prosesjson01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prosesjson01Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Prosesjson01Application.class, args);
	}

	public void run(String...args){
		id.co.indivara.jdt11.prosesjson01.JsonToJavaObject.test();
		id.co.indivara.jdt11.prosesjson01.SampleJson.test();
		id.co.indivara.jdt11.prosesjson01.JavaObjectToJson.test();

	}

}
