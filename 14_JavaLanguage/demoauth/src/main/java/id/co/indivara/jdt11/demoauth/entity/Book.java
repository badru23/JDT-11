package id.co.indivara.jdt11.demoauth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Bro , judul nya isi lah..")
    private String nama;
    @NotEmpty(message = "Bro , Penulis Harus di isi..")
    private String author;
    @NotNull(message = "Bro , Harganya lah blok..")
    @DecimalMin("1.000")
    private BigDecimal price;


    public Book(){
    }

    public Book(Long id, String nama, String author, BigDecimal price) {
        this.id = id;
        this.nama = nama;
        this.author = author;
        this.price = price;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}