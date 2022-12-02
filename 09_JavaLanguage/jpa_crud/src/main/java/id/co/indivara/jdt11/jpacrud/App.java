package id.co.indivara.jdt11.jpacrud;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import java.util.*;

public class App {
    public static void main(String[]args){
        SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
        Scanner keyboard = new Scanner (System.in);
        Session session = null ;
        while (true) {
            session = sessionFactory.openSession();
            session.beginTransaction();

            System.out.println("================MENU===============");
            System.out.println("1. Input Data Employee ");
            System.out.println("2. Update Data Employee ");
            System.out.println("3. Delete Data Employee ");
            System.out.println("4. Tampilkan Semua Data Employee ");
            System.out.println("5. Cari Data Employee Berdasarkan NIP ");
            System.out.print("PILIHAN ANDA  [1] | [2] | [3] | [4] | [5] : ");
            String pilihan = keyboard.nextLine();

            if(pilihan.equals("1")){
                System.out.println("================INPUT DATA EMPLOYE===============");
                System.out.print("NIP              : ");
                String nip = keyboard.nextLine();

                System.out.print("NAMA             : ");
                String nama = keyboard.nextLine();

                System.out.print("EMAIL            : ");
                String email = keyboard.nextLine();
                
                System.out.print("JABATAN          : ");
                String jabatan = keyboard.nextLine();

                System.out.print("TANGGAL          : ");
                String tanggal = keyboard.nextLine();

                Employee e  = new Employee();
                e.setId (Integer.parseInt(nip));
                e.setName (nama);
                e.setEmail (email);
                e.setDesignation (jabatan);
                e.setCreated (tanggal);

                Integer hasil = (Integer)session.save(e);
                if (hasil == Integer.parseInt(nip)){
                    System.out.println("INSERT SUKSES");
                }else{
                    System.out.println("INSERT GAGAL");
                }

            }else if(pilihan.equals("2")){
                System.out.println("================UPDATE DATA EMPLOYE===============");
                System.out.print("NIP YANG AKAN DI UPDATE	    : ");
				String nip = keyboard.nextLine();
                Employee eUpdate =(Employee)session.load(Employee.class,Integer.parseInt(nip));
                
                if(eUpdate != null){
					System.out.print("Nama Baru ["+ eUpdate.getName() + "] : ");
					String nama  = keyboard.nextLine();
					if (!nama.isEmpty()){
						eUpdate.setName(nama);
					}
					System.out.print("Email Baru ["+ eUpdate.getEmail() + "] : ");
					String email  = keyboard.nextLine();
					if (!email.isEmpty()){
						eUpdate.setEmail(email);
					}
					System.out.print("Jabatan Baru ["+ eUpdate.getDesignation() + "] : ");
					String designation  = keyboard.nextLine();
					if (!designation.isEmpty()){
						eUpdate.setDesignation(designation);
					}

                    session.update(eUpdate);
                }
                


                
            }else if(pilihan.equals("3")){
                System.out.println("================DELETE DATA EMPLOYE===============");
                System.out.print("MASUKAN NIP              : ");
                String nip = keyboard.nextLine();

                Employee e =(Employee)session.load(Employee.class,Integer.parseInt(nip));
                session.delete(e);

            }else if(pilihan.equals("4")){  
                System.out.println("================MENAMPILKAN DATA EMPLOYE===============");
                List<Employee> employees =  session.createQuery("FROM Employee", Employee.class).list();
                for(Employee e: employees){
                    System.out.println("NIP         : " + e.getId());
                    System.out.println("NAMA        : " + e.getName());
                    System.out.println("EMAIL       : " + e.getEmail());
                    System.out.println("JABATAN     : " + e.getDesignation());
                    System.out.println("TANGGAL     : " + e.getCreated());  
                }

            }else if(pilihan.equals("5")){
                System.out.println("================CARI DATA EMPLOYE (NIP)===============");
                System.out.print("MASUKAN NIP              : ");
                String nip = keyboard.nextLine();
                System.out.println("======================================================");
                try {
                Employee e =(Employee)session.load(Employee.class,Integer.parseInt(nip));
                    System.out.println("NIP         : " + e.getId());
                    System.out.println("NAMA        : " + e.getName());
                    System.out.println("EMAIL       : " + e.getEmail());
                    System.out.println("JABATAN     : " + e.getDesignation());
                    System.out.println("TANGGAL     : " + e.getCreated());
                }catch(org.hibernate.ObjectNotFoundException e){
                    System.out.println("NIP         : " + nip + " , Tidak Ditemukan ");
                }
                
            }
            session.getTransaction().commit();

            System.out.print("Lagi [Y/T] ? : ");
            String jawaban = keyboard.nextLine();
            if (!jawaban.toUpperCase().equals("Y")){
                break;
            }
        }
        sessionFactory.close();
    }
}