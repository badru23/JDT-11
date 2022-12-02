package id.co.indivara.jdt11.demorest;

public class Salam {
    private  long id;
    private  String ucapan;


    public Salam(long id , String ucapan){
        this.id =id;
        this.ucapan = ucapan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUcapan() {
        return ucapan;
    }

    public void setUcapan(String ucapan) {
        this.ucapan = ucapan;
    }
}
