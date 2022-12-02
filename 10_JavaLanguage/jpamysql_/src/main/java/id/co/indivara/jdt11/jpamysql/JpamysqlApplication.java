package id.co.indivara.jdt11.jpamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Scanner;

@SpringBootApplication
public class JpamysqlApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpamysqlApplication.class, args);
	}
	
	public void run (String...args)
	{
		Scanner s =  new Scanner (System.in);
		while(true){
			System.out.println("=================MENU================");
			System.out.println("1. Entry Data");
			System.out.println("2. Update Data")	;
			System.out.println("3. Cari Data");
			System.out.println("4. Delete Data");
			System.out.println("5. Tampilkan Semua Data");
			System.out.print("Masukan Pilihan Anda	: ");
			String pilihan = s.nextLine();
			if(pilihan.equals("1")){
				System.out.println("============Entry Data=============");
				System.out.print("Nama	: ");
				String nama = s.nextLine();
				System.out.print("Email	: ");
				String email = s.nextLine();

				User c = new User(nama, email);
				repository.save(c);

			}else if(pilihan.equals("2")){
				System.out.println("============Update Data=============");
				System.out.print("ID	: ");
				String id = s.nextLine();

				User c =(User)repository.findById(Integer.parseInt(id)).get();
				System.out.print("Nama	: ");
				String nama = s.nextLine();
				if(!nama.isEmpty()){
					c.setName(nama);
				}

				System.out.print("Email	: ");
				String email = s.nextLine();
				if(!email.isEmpty()){
					c.setEmail(email);
				}

				repository.save(c);

			}else if(pilihan.equals("3")){
				System.out.println("============Search Data=============");
				System.out.print("ID	: ");
				String id = s.nextLine();

				User c =(User)repository.findById(Integer.parseInt(id)).get();
				System.out.println("Nama	: " + c.getName());
				System.out.println("Email	: " + c.getEmail());
				System.out.println("=========================");

			}else if(pilihan.equals("4")){
				System.out.println("============Delete Data=============");

				System.out.print("ID	: ");
				String id = s.nextLine();
				repository.deleteById(Integer.parseInt(id));

			}else if(pilihan.equals("5")){
				System.out.println("============Tampilkan Semua Data=============");

				for(User c: repository.findAll()){
					System.out.println("Nama	: " + c.getName());
					System.out.println("Email	: " + c.getEmail());
					System.out.println("=========================");
				}
			}

			System.out.print("LAGI (Y/T) 	: ");
			String jawaban = s.nextLine();
			if (!jawaban.toUpperCase().equals("Y")){
				break;
			}
		}
	}

}
