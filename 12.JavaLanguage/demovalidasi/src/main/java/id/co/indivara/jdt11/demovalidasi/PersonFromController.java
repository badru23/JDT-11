package id.co.indivara.jdt11.demovalidasi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonFromController {

    @PostMapping("/contohpost")
    public personform contohPost(@RequestBody @Valid  personform dataInput){
        personform dataOutput = dataInput;
        dataOutput.setKeterangan("Data Anda Valid");
        return  dataOutput;
    }
}
