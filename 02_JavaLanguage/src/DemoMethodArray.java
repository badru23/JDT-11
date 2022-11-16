public class DemoMethodArray {
    static String [] getNamaKota(){
        String [] kota ={"Jakarta" , "Bogor " , "Tanggerang"};
        return kota;
    }
    
    static void cetakArray(String [] x) {
        for(int i= 0 ; i < x.length; i++){
            System.out.println(x[i]);
        }
    }

    public static void main(String[]args) {
        // Cara 1
        String [] hasil = getNamaKota();
        cetakArray(hasil);
        System.out.println("===========================");

        //Cara 2
        cetakArray(getNamaKota());
        System.out.println("===========================");

        //cara 3
        if(args.length > 0){
            cetakArray(args);
        }

        //Membuat Array
        String [] nama = {"Badru", "Kamal", "Dude"};
        cetakArray(nama);
    }
}