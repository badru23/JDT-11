package id.co.indivara.jdt11.prosesjson01;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaObject {
    public static void test() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\": \"Wawan\" , \"age\": 25}";
        System.out.println("==========DATA JSON ASLI==========");
        System.out.println(jsonString);

        try {
            Student student = mapper.readValue(jsonString,Student.class);
//            System.out.println(student);
            System.out.println("==========DATA JSON SUDAH TERMAPPING KE JAVA OBJECT==========");
            System.out.println("NAMA STUDENT    : " + student.getName());
            System.out.println("UMUR STUDENT    : " + student.getAge());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
