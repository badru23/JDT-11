package id.co.indivara.jdt11.crudproject;

public class Employee
{
	private String id;
	private String name;
	private String email;
	private String designation;
	private String created;
	
	public void setId(String s){
		this.id=s;
	}
	public String getId(){
		return this.id;
	}
	
	public void setName(String s){
		this.name=s;
	}
	public String getName(){
		return this.name;
	}
	
	public void setEmail(String s){
		this.email=s;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setDesignation(String s){
		this.designation=s;
	}
	public String getDesignation(){
		return this.designation;
	}
	
	public void setCreated(String s){
		this.created=s;
	}
	public String getCreated(){
		return this.created;
	}
}
