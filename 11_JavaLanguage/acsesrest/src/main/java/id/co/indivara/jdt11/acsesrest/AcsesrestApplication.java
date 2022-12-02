package id.co.indivara.jdt11.acsesrest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AcsesrestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AcsesrestApplication.class, args);
	}

	public void run(String...args){
		RestTemplateBuilder builder = new RestTemplateBuilder();
		RestTemplate template = builder.build();
		Quote quote = template.getForObject("http://belajaroracle.com/temp/sukses.json",Quote.class);

		Value value = quote.getValue();
		System.out.println("ID					: " + value.getId());
		System.out.println("Kata Mutiara		: " + value.getQuote());
	}

}
