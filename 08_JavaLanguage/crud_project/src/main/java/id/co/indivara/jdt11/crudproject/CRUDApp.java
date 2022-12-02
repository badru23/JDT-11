package id.co.indivara.jdt11.crudproject;
import java.util.*;

public class CRUDApp
{
	public static void main(String [] args)
	{
		Scanner keyboard=new Scanner(System.in);
		Database db=null;
		
		try{
			db=new Database();
			System.out.println("Selamat Datang Di CRUDApp");
			System.out.println("Menu");
			System.out.println("1. Melihat Semua Data Employee");
			System.out.println("2. Mencari Employee Bedasarkan NIP");
			System.out.println("3. Input data Employee Baru");
			System.out.println("4. Update data Employee");
			System.out.println("5. Hapus data Employee");
			System.out.println("Pilihan Anda [1,2,3,4,5]");
			String pilihan=keyboard.nextLine();
			if(pilihan.equals("1")){
				EmployeeDAO dao=new EmployeeDAO(db);
				ArrayList <Employee> semuaKaryawan = dao.getAllEmployees();
				for(int a=0;a<semuaKaryawan.size();a++){
					Employee e=semuaKaryawan.get(a);
					System.out.println("NIP : "+e.getId());
					System.out.println("Nama : "+e.getName());
					System.out.println("Email : "+e.getEmail());
					System.out.println("Jabatan : "+e.getDesignation());
					System.out.println("Pembuatan : "+e.getCreated());
					System.out.println("===========================");
				}
			}else if(pilihan.equals("2")){
				System.out.println("Nip yang anda cari : ");
				String nip=keyboard.nextLine();
				EmployeeDAO dao=new EmployeeDAO(db);
				Employee e=dao.findEmployee(nip);
				if(e !=null){
					System.out.println("NIP : "+e.getId());
					System.out.println("Nama : "+e.getName());
					System.out.println("Email : "+e.getEmail());
					System.out.println("Jabatan : "+e.getDesignation());
					System.out.println("Pembuatan : "+e.getCreated());
					System.out.println("===========================");
				}else{
					System.out.println("Employee dengan nip "+nip+"bukan manusia");
				}
			}else if (pilihan.equals("3")){
				System.out.println("NIP :");
				String nip=keyboard.nextLine();
			
				System.out.println("NAMA :");
				String nama=keyboard.nextLine();
				
				System.out.println("EMAIL :");
				String email=keyboard.nextLine();
			
				System.out.println("JABATAN :");
				String jabatan=keyboard.nextLine();
				
				System.out.println("TANGGAL ENTRY :");
				String tanggal=keyboard.nextLine();
				
				Employee e=new Employee();
				e.setId(nip);
				e.setName(nama);
				e.setEmail(email);
				e.setDesignation(jabatan);
				e.setCreated(tanggal);
				
				EmployeeDAO dao=new EmployeeDAO(db);
				if(dao.createEmployee(e)){
					System.out.print("ENTRY SUKSES");
				}else{
					System.out.print("ENTRY GAGAL");
				}
			}else if(pilihan.equals("4")) {
				System.out.println("NIP YANG AKAN DI UPDATE	: ");
				String nip = keyboard.nextLine();
				EmployeeDAO dao = new EmployeeDAO(db);
				Employee e= dao.findEmployee(nip);

				if(e != null){
					System.out.print("Nama Baru ["+ e.getName() + "] : ");
					String nama  = keyboard.nextLine();
					if (!nama.isEmpty()){
						e.setName(nama);
					}
					System.out.print("Email Baru ["+ e.getEmail() + "] : ");
					String email  = keyboard.nextLine();
					if (!email.isEmpty()){
						e.setEmail(email);
					}
					System.out.print("Jabatan Baru ["+ e.getDesignation() + "] : ");
					String designation  = keyboard.nextLine();
					if (!designation.isEmpty()){
						e.setDesignation(designation);
					}

					if(dao.updateEmployee(e)) {
						System.out.println("UPDATE SUKSES");
					}else {
						System.out.println("UPDATE GAGAL");
					}
					
				}else{
					System.out.println("UPDATE GAGAL");
				}
			}else if (pilihan.equals("5")){
				System.out.println("NIP YANG AKAN DI DELETE	: ");
				String nip = keyboard.nextLine();
				EmployeeDAO dao = new EmployeeDAO(db);
				Employee e= dao.findEmployee(nip);
				if (dao.deleteEmployee(nip)){
					System.out.println("DELETE SUKSES");
				}else{
					System.out.println("DELETE GAGAL");
				}
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}