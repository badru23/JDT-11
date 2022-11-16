public class DemoArrayMultidimensi {
    public static void main(String [] args) {
        int baris = 3 ;
        int kolom = 2 ;
        String [][] profinsiDanKota = new String[baris][kolom];
        profinsiDanKota[0][0]="Bandung";
        profinsiDanKota[0][1]="Bogor";
        profinsiDanKota[1][0]="Jakarta";
        profinsiDanKota[1][1]="Yogyakarta";
        profinsiDanKota[1][2]="Surabaya";
        profinsiDanKota[2][1]="Cianjur";
        profinsiDanKota[2][2]="Garut";

        for (int i = 0 ; i < profinsiDanKota.length ; i++ ){
            System.out.println("Kota    : " + profinsiDanKota[i]);
        }
    }
}