package id.co.indivara.jdt11.prosesjson01;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JavaObjectToJson {
    public static  void test(){
        Student s = new  Student();
        try {
            s.setName("Amir");
            s.setAge(50);
            ObjectMapper mapper =  new ObjectMapper();
            mapper.writeValue(new File("Student.json"),s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
