public class DemoDatabase {
    static void aksesDb(Database driverdb){
        driverdb.konek();
        driverdb.diskonek();
    }

    public static void main(String[]args){
        //Database db = new DatabaseMicrosoftDriver();
        // Database db = new DatabasePostgreeDriver();
        // db.konek();
        // db.diskonek();

        aksesDb(new DatabaseMicrosoftDriver());
        // aksesDb(new DatabasePostgreeDriver());
    }
}