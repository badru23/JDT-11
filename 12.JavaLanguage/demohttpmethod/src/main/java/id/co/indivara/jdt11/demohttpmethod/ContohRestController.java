package id.co.indivara.jdt11.demohttpmethod;

import org.springframework.web.bind.annotation.*;

@RestController
public class ContohRestController {

    @GetMapping("/contohget")
    public ContohRestData contohGetDenganParameter(@RequestParam(name = "name", defaultValue = "Tanpa Nama") String nama,
                                                   @RequestParam(name = "alamat", defaultValue = "Jakarta") String alamat) {

        ContohRestData c = new ContohRestData();
        c.setNama(nama);
        c.setAlamat(alamat);
        c.setKeterangan("Contoh Response Get Dengan parameter");
        return c;
    }

    @GetMapping("/contohget/{nama}/ {alamat}")
    public ContohRestData contohGetDenganPathParameter(@PathVariable String nama,
                                                       @PathVariable String alamat) {
        ContohRestData c = new ContohRestData();
        c.setNama(nama);
        c.setAlamat(alamat);
        c.setKeterangan("Contoh Response Get Dengan parameter");
        return c;
    }


    @PostMapping("/contohpost")
    public ContohRestData contohPostJSON(@RequestBody ContohRestData dataKirimanClient) {
        ContohRestData c = dataKirimanClient;
        c.setKeterangan("Contoh Response POST");
        return c;
    }

    @PostMapping("/contohpostparam")
    public ContohRestData contohPostParam(@RequestParam(name = "nama", defaultValue = "Tanpa Nama") String nama,
                                          @RequestParam(name = "alamat", defaultValue = "Jakarta") String alamat) {

        ContohRestData c = new ContohRestData();
        c.setNama(nama);
        c.setAlamat(alamat);
        c.setKeterangan("Contoh Response Get Dengan parameter");
        return c;
    }

    @DeleteMapping("/contohdelete")
    public ContohRestData contohDelete(@RequestBody ContohRestData dataDariClient) {
        ContohRestData c = dataDariClient;
        c.setKeterangan("Contoh Response Delete");
        return c;
    }


    @PatchMapping("/contohpatch")
    public ContohRestData contohpatch(@RequestBody ContohRestData dataDariClient) {
        ContohRestData c = dataDariClient;
        c.setKeterangan("Contoh Response Patch");
        return c;
    }

    @PutMapping("/contohput")
    public ContohRestData contohPut(@RequestBody ContohRestData dataDariClient) {
        ContohRestData c = dataDariClient;
        c.setKeterangan("Contoh Response PUT");
        return c;
    }
}

