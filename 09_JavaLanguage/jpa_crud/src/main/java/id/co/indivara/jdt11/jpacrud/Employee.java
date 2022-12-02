package id.co.indivara.jdt11.jpacrud;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="employee")

public class Employee {
    @Id
    @Column(name="id")
    private int id ;

    @Column(name="name")
    private String name ;

    @Column(name="email")
    private String email ;

    @Column(name="designation")
    private String designation ;

    @Column(name="created")
    private String created ;

    public void setId(int id){
        this.id = id ;
    }
    public int getId(){
        return this.id;
    }
    //================================================
        public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return this.name;
    }
    //================================================
        public void setEmail(String email){
        this.email = email ;
    }
    public String getEmail(){
        return this.email;
    }
    //================================================
        public void setDesignation(String designation){
        this.designation = designation ;
    }
    public String getDesignation(){
        return this.designation;
    }
    //================================================
        public void setCreated(String created){
        this.created = created ;
    }
    public String getCreated(){
        return this.created;
    }
    //================================================
}