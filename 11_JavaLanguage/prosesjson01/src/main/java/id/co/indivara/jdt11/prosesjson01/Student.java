package id.co.indivara.jdt11.prosesjson01;

public class Student {
    private String name;
    private int age;
    public Student(){}

    //Set & Get
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public String toString(){
        String x = "Nama    : " + this.name+"\n";
        x +=       "Age     : " + this.age;
        return x;
    }
}
