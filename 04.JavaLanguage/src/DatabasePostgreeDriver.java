// interface yang dibuat oleh vendor db (PostGree SQL)
public class DatabasePostgreeDriver implements Database {
    public void konek(){
        System.out.println("Database Postgree SQL Konek..");
    }
    public void diskonek(){
        System.out.println("Database Postgree SQL Diskonek..");
    }
}