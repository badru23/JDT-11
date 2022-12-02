package id.co.indivara.dbbasic;
import java.sql.*;
import java.util.*;

public class AksesDB {
    public static void main(String[]args){
        Connection conn = null;
        Scanner objek = new Scanner (System.in);

        System.out.print("KODE REGION : ");
        String kode = objek.nextLine();

        System.out.print("NAMA REGION : ");
        String nama = objek.nextLine();
        try {
            //1. Load Driver MYSQL ke memori
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //2. Buat koneksi ke mysql server
            String url = "jdbc:mysql://localhost:3306/hr";
            String user = "root";
            String password = "";
            conn= DriverManager.getConnection(url,user,password);

            //3. Siapkan Statemen objek
            Statement stm = conn.createStatement();

            //4. Siapkan Perintah SQL
            String sql = "INSERT INTO regions  VALUES('"+ kode +"','"+nama+"')";
            //5. Eksekusi Hasil
            int hasil =  stm.executeUpdate(sql);
            System.out.println(hasil+ " -Baris Terinsert...");
  
        }catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
}