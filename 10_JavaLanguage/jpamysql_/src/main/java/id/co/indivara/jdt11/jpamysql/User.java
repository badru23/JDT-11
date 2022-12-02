package id.co.indivara.jdt11.jpamysql;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	
	protected User (){}
	protected User (String name,String email){
		this.name=name;
		this.email=email;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
}