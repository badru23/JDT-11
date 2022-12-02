package id.co.indivara.jdt11.employeesjpa.entity;


import javax.persistence.*;

@Entity
@Table  (name="employees")
public class Employee {
    private Long id;
    private String firstname;
    private String lastname;
    private String emailId;

    public Employee(){

    }

    public Employee(String firstname, String lastname , String emailId){
        this.firstname=firstname;
        this.lastname=lastname;
        this.emailId=emailId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "first_name", nullable = false)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Column(name = "last_name", nullable = false)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Column(name = "email_addres", nullable = false)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
