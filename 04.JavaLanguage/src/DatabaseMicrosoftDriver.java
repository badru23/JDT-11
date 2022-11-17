// interface yang dibuat oleh vendor db (microsoft)
public class DatabaseMicrosoftDriver implements Database {
    public void konek(){
        System.out.println("Database Microsoft Konek..");
    }
    public void diskonek(){
        System.out.println("Database Microsoft Diskonek..");
    }
}