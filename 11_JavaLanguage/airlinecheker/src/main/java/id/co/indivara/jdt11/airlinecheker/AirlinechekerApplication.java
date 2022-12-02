package id.co.indivara.jdt11.airlinecheker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@SpringBootApplication
public class AirlinechekerApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(AirlinechekerApplication.class, args);
	}

	public void run(String...args) throws  Exception{
		Scanner s = new Scanner(System.in);
		while (true){
			RestTemplateBuilder builder = new RestTemplateBuilder();
			RestTemplate template = builder.build();

			System.out.println("==================CEK HARGA TIKER===================");
			System.out.println("1.	Lion Air ");
			System.out.println("2.	Batik Air ");
			System.out.println("3.	Garuda Indonesia ");
			System.out.print("Pilihan Anda	: ");
			String pilihan = s.nextLine();
			if(pilihan.equals("1")){
				Lion l = template.getForObject("http://belajaroracle.com/temp/lion.json",Lion.class);
				System.out.println("Nama Maskapai	: " + l.getMaskapai());
				System.out.println("Harga Tiker		: " + l.getHargaTiket());
			}else if(pilihan.equals("2")){
				Batik b = template.getForObject("http://belajaroracle.com/temp/batik.json",Batik.class);
				System.out.println("Nama Maskapai	: " + b.getNamaMaskapai());
				System.out.println("Harga Tiker		: " + b.getTiket());

			}else if(pilihan.equals("3")){
				Garuda g = template.getForObject("http://belajaroracle.com/temp/garuda.json",Garuda.class);
				System.out.println("Nama Maskapai	: " + g.getAirLineName());
				System.out.println("Harga Tiker		: " + g.getTicketPrice());

			}
				System.out.print("Mau Lagi (Y/T) ? : ");
			String jawaban = s.nextLine();
			if (!jawaban.toLowerCase().equals("y")){
				break;
			}
//				System.exit(0);
		}
	}

}
