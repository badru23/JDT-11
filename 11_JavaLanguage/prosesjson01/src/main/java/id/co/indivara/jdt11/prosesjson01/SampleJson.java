package id.co.indivara.jdt11.prosesjson01;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleJson {
    public static void test() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"nip\" : \"3271012307030004\" , \"name\" : \"Muhamad Badru Kamal\" , \"email\" : \"badru@badru\" ,\"designation\" : \"boss\", \"created\" : \"2022-11=28\"}";
        System.out.println(jsonString);


        try {
            Employee object = mapper.readValue(jsonString,Employee.class);
//            System.out.println(student);
            System.out.println("==========DATA JSON SUDAH TERMAPPING KE JAVA OBJECT==========");
            System.out.println("NIP             : " + object.getNip());
            System.out.println("NAMA            : " + object.getName());
            System.out.println("EMAIL           : " + object.getEmail());
            System.out.println("DESIGNATIN      : " + object.getDesignation());
            System.out.println("CREATED         : " + object.getCreated());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}