// Driver kelas parent & Child (Inherintance)

public class DriverSepeda {
    public static void main(String [] args){

         System.out.println("=====================================Sepeda");
        Sepeda onthel = new Sepeda(); // => OBJEK DARI KELAS Sepeda
        onthel.berjalan();
        onthel.berhenti();
        // onthel.ngebut(); => EROR KARENA METHOD NGEBUT BUKAN DARI KELAS PARENT (Sepeda)

        

        SepedaBalap polygon = new SepedaBalap(); // => OBJEK DARI KELAS Sepeda
        polygon.berjalan();
        System.out.println("=====================================Sepeda Balap");
        polygon.berhenti();
        polygon.ngebut();

    }
}