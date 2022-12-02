package id.co.indivara.jdt11.demovalidasi;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class personform {

    @NotNull
    @Size(min=2, max = 30, message = "Boss, nama minimal 2 huruf, maksimal 30 karakter")
    private String name;
    @NotNull
    @Min(value=18 , message = "Software ini hanya dijual ke anak kecil")
    private String age;
    private String keterangan;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
