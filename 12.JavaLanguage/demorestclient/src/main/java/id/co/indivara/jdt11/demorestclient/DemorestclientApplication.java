package id.co.indivara.jdt11.demorestclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemorestclientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemorestclientApplication.class).web(WebApplicationType.NONE).run(args);
    }

    @Override
    public void run(String... args) throws Exception{
        RestTemplateBuilder builder=new RestTemplateBuilder();
        RestTemplate template=builder.build();

        // TAMBAHAN KODE AGAR KETIKA MAMANGGIL METHOD PATCH
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        template.setRequestFactory(requestFactory);

        ContohRestData input= new ContohRestData();
        input.setNama("Badru");
        input.setAlamat("Kota Bogor");

        //CONTOH MEMANGGIL REST API DENGAN METHOD POST
        ContohRestData outputPost=template.postForObject("http://localhost:8080/contohpost",input,ContohRestData.class);
        System.out.println(outputPost.getKeterangan());

        //CONTOH MEMANGGIL REST API DENGAN METHOD PATCH
        ContohRestData outputPatch=template.patchForObject("http://localhost:8080/contohpatch",input,ContohRestData.class);
        System.out.println(outputPatch.getKeterangan());
    }

}