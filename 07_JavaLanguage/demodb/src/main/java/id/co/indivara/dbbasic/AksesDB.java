package id.co.indivara.dbbasic;
import java.sql.*;

public class AksesDB {
    public static void main(String[]args){
        try {
            //1. Load Driver MYSQL ke memori
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //2. Buat koneksi ke mysql server
            String url = "jdbc:mysql://localhost:3306/hr";
            String user = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,user,password);

            //3. Siapkan Statemen objek
            Statement stm = conn.createStatement();

            //4. Siapkan Perintah SQL
            String sql = "SELECT * FROM regions";

            //5. Jalankan perintah SQL
            ResultSet hasil = stm.executeQuery(sql);

            //6. Olah Hasil
            while (hasil.next()){
                System.out.println("KODE REGION : " + hasil.getString("REGION_ID"));
                System.out.println("NAMA REGION : " + hasil.getString("REGION_NAME"));
                System.out.println("===================================");
            }
            // 7 . tutup koneksi
            // conn.close();    
        }catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
}