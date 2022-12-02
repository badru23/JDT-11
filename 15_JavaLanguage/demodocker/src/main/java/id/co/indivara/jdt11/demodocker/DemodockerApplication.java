package id.co.indivara.jdt11.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemodockerApplication {

	@GetMapping("/welcome")
	public String selamatDatang(){
		return "Selamat Datang Di Dunia Develops";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemodockerApplication.class, args);
	}

}
