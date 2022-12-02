package id.co.indivara.jdt11.starterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.Scanner;


@SpringBootApplication
public class StarterappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("======Jalan Pertama");
		SpringApplication.run(StarterappApplication.class, args);
		System.out.println("======Jalan Kelima");
	}

	// // Method Run Akan jalan pertama kali setelah menjalankan Spring
	// public void run(String...args){
	// 	Scanner keyboard = new Scanner (System.in);
		
	// 	System.out.println("======Jalan Kedua");
	// 	// System.out.print("Nama Anda		: ");
	// 	// String nama = keyboard.nextLine();
	// 	// System.out.println("Hallo bos "+ nama + " , Nypring ni...");

	// }

	@Bean
	public CommandLineRunner pastiJalan(){
		return(args)-> {
			System.out.println("======Jalan Ketiga");
			// System.out.println("========Method pastiJalan()"); //=> harus import annotation @Bean
		};
	}

	@Bean
	public CommandLineRunner IniJugaJalan(){
		return(args)-> {
			System.out.println("======Jalan Keempat");
			// System.out.println("========Method pastiIniJalan()"); //=> harus import annotation @Bean
		};
	}

	
	public CommandLineRunner IniTidakJalan(){
		return(args)-> {
			
			// System.out.println("========Method IniTidakJalan)"); //=> tidak jalan karena tidak ada annotation @Bean
		};
	}

		// Method Run Akan jalan pertama kali setelah menjalankan Spring
	public void run(String...args){
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("======Jalan Kedua");
		// System.out.print("Nama Anda		: ");
		// String nama = keyboard.nextLine();
		// System.out.println("Hallo bos "+ nama + " , Nypring ni...");

	}


}
