package id.co.indivara.jdt11.demorest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SalamController {
    private static String templateSalam = "Hallo %s , Selamat datang di Rest API";

    private AtomicLong counter = new AtomicLong();

    @GetMapping("/contohget")
    public Salam ucapkanSalam(@RequestParam(value="name", defaultValue = "Anonymous")String name){
        Salam objek = new Salam(counter.incrementAndGet(),String.format(templateSalam,name));
        return objek;
    }
}
