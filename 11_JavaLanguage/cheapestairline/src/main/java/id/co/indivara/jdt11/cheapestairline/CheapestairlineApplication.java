package id.co.indivara.jdt11.cheapestairline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CheapestairlineApplication implements CommandLineRunner {

	public static void main(String[] args) {

//		SpringApplication.run(CheapestairlineApplication.class, args);
		new SpringApplicationBuilder(CheapestairlineApplication.class).web(WebApplicationType.NONE).run(args);
	}

	public void run(String...args) throws  Exception {
		RestTemplateBuilder builder = new RestTemplateBuilder();
		RestTemplate template = builder.build();

		Lion l = template.getForObject("http://belajaroracle.com/temp/lion.json", Lion.class);
		Garuda g = template.getForObject("http://belajaroracle.com/temp/garuda.json", Garuda.class);
		Batik b = template.getForObject("http://belajaroracle.com/temp/batik.json", Batik.class);

			try {
				if (l.getHargaTiket() < g.getTicketPrice() && l.getHargaTiket() < b.getTiket()) {
					System.out.println("===============================================");
					System.out.println("Nama Maskapai	: " + l.getMaskapai());
					System.out.println("Harga Tiker		: " + l.getHargaTiket());

				} else if (g.getTicketPrice() < b.getTiket() && g.getTicketPrice() < l.getHargaTiket()) {
					System.out.println("===============================================");
					System.out.println("Nama Maskapai	: " + g.getAirLineName());
					System.out.println("Harga Tiker		: " + g.getTicketPrice());
				} else {
					System.out.println("===============================================");
					System.out.println("Nama Maskapai	: " + b.getNamaMaskapai());
					System.out.println("Harga Tiker		: " + b.getTiket());
				}
			} catch (Exception e) {
				System.out.println("Eror");

		}
	}

}
