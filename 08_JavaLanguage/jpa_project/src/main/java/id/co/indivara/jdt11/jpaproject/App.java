package id.co.indivara.jdt11.jpaproject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;


public class App {
    public static void main(String[]args){
        //1. buat konfigurasi
        Configuration configuration = new Configuration();
        configuration.configure ("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

        //2. buat session factory 
        SessionFactory sessionFactory = configuration.buildSessionFactory();
    
        Scanner keyboard = new Scanner (System.in);
        while (true){
            System.out.print("JUDUL        : ");
            String judul =  keyboard.nextLine();
            System.out.print("PENYANYI     : ");
            String penyanyi = keyboard.nextLine();

            Song lagu = new Song();
            lagu.setSongName(judul);
            lagu.setSinger(penyanyi);

            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(lagu);
            session.getTransaction().commit();

            System.out.print("ENTRY LAGU LAGI   ? (Y/T) ");
            String jawaban = keyboard.nextLine();
            if(! jawaban.toUpperCase().equals("Y")){
                break;
            }
        }
    }
}