class TV {
    void powerOn() {
        System.out.println("Power On");
    }
}

class tVSamsung extends TV {
    void volumeUp() {
        System.out.println("Volume Up");
    }
}


class tVLg extends TV {
    void volumeDown() {
        System.out.println("Volume Down");
    }
}

class Bomba {
    void VolumeMute() {
        System.out.println("Volume Mute");
    }
}

public class DemoTv{
    public static void main (String [] args){
        TV samsung =new  tVSamsung();
        samsung.powerOn();
        ((tVSamsung)samsung).volumeUp();

        TV lg =  new tVLg();
        ((tVLg)lg).volumeDown();

        Bomba tvbomba =  new Bomba();
        // ((tVLg)Bomba).volumeDown(); => Error
}
}

