class TV {
    void powerOn() {
        System.out.println("Power On");
    }
}

class TVSamsung extends TV {
    void volumeUp() {
        System.out.println("Volume Up");
    }
}

class TVLg extends TV {
    void volumeDown() {
        System.out.println("Volume Down");
    }
}


public class DemoTvLagi {
    public static void main(String [] args){
        TV [] banyak = new TV[5];
        banyak[0] = new TVSamsung();
        banyak[1] = new TVLg();
        banyak[2] = new TVSamsung();
        banyak[3] = new TVLg();
        banyak[4] = new TVSamsung();

        for(int i = 0 ; i < banyak.length; i++){
            banyak[i].powerOn();
            if (banyak[i] instanceof TVSamsung){
                ((TVSamsung)banyak[i]).volumeUp();
            }else if (banyak[i] instanceof TVLg){
                ((TVLg)banyak[i]).volumeDown();
            }
        }

        TV lg = new TVLg();
        // ((TVSamsung)lg).volumeUp(); => EROR
    }
}