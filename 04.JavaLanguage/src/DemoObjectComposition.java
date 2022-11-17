class Window {
    void bukaKaca(){
        System.out.println("Buka Kaca Jendela..");
    }
    void tutupKaca(){
        System.out.println("Tutup Kaca Jendela..");
    }
}

class door {
    Window jendela;
    door(Window jendela){
        this.jendela = jendela ;
    }
    void bukaPintu(){
        System.out.println("Buka pintu..");
    }
    void tutupPintu(){
        System.out.println("Tutup pintu..");
    }
}

class  roda {
    void menggelinding(){
        System.out.println("Maju...");
    }
}

class ac {
    void gerah (){
        System.out.println("Buka Ac..");
    }
}

class audio {
    void playMusik (){
        System.out.println("Play musik cuy..");
    }
}

class car {
    door pintu;
    roda ban;
    ac angin;
    audio musik;
    car(door pintu , roda ban , ac angin , audio musik){
    this.pintu = pintu;
    this.ban= ban;
    this.angin = angin;
    this.musik = musik;
    }
void keluarMobil() {
    pintu.bukaPintu();
}
void kegerahan() {
    pintu.jendela.bukaKaca();
}
void berjalan() {
    ban.menggelinding();
}
void bukaAc() {
    angin.gerah();
}
void lagu() {
    musik.playMusik();
}
}
public class DemoObjectComposition{
    public static void main(String[]args){
        Window jendelaku = new Window();
        door pintuku = new door(jendelaku);
        roda rodaku = new roda();
        ac acku = new ac();
        audio audioku = new audio();

        car mobilku = new car(pintuku,rodaku,acku, audioku);
        
        System.out.print("Saya Ingin keluar mobil        : " );
        mobilku.keluarMobil();
        System.out.print("Saya Kegerahan                 : " );
        mobilku.kegerahan();
        System.out.print("Saya akan mengendarai mobil    : " );
        mobilku.berjalan();
        System.out.print("Mobil Saya Panas               : " );
        mobilku.bukaAc();
        System.out.print("Saya Ingin mendengarkan musik  : " );
        mobilku.lagu();

    }
}