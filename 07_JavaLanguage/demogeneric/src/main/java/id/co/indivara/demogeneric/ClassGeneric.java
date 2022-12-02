package id.co.indivara.demogeneric;

public class ClassGeneric <A,B> {
    A FieldSatu;
    B FieldDua;

    ClassGeneric (A FieldSatu ,B FieldDua){
        this.FieldSatu=FieldSatu;
        this.FieldDua=FieldDua;
    }

    public void cetakField(){
        System.out.println("FIELD SATU " + FieldSatu);
        System.out.println("FIELD DUA  " + FieldDua);
    }

    public A getFieldSatu(){
        return FieldSatu;
    }
    public B getFieldDua(){
        return FieldDua;
    }
}