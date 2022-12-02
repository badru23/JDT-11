package id.co.indivara.jdt11.crudproject;
import java.sql.*;
import java.util.*;

public class EmployeeDAO{
	private Database db;
	private Connection conn;
	private String dbTable="employee";
	public ResultSet result;
	
	public EmployeeDAO(Database db) throws Exception{
		this.db=db;
		this.conn=db.getConnection();
	}
	
	//method untuk mengambil semua data di table employees
	public ArrayList<Employee> getAllEmployees() throws Exception{
		String sql="SELECT * FROM "+this.dbTable;
		Statement stm=this.conn.createStatement();
		result=stm.executeQuery(sql);
		ArrayList<Employee> semuaEmployee = new ArrayList<Employee>();
		while(result.next()){
			Employee e=new Employee();
			e.setId(result.getString("id"));
			e.setName(result.getString("name"));
			e.setEmail(result.getString("email"));
			e.setDesignation(result.getString("designation"));
			e.setCreated(result.getString("created"));
			semuaEmployee.add(e);
		}
		stm.close();
		return semuaEmployee;
	}		
	//METHOD UNTUK MENCARI EMPLOYEE BERDASARKAN NIP
	public Employee findEmployee(String nip) throws Exception{
		String sql="SELECT * FROM "+this.dbTable+" WHERE id='"+nip+"'";
		Statement stm=this.conn.createStatement();
		result=stm.executeQuery(sql);
		Employee e=null;
		if (result.next()){
			e=new Employee();
			e.setId(result.getString("id"));
			e.setName(result.getString("name"));
			e.setEmail(result.getString("email"));
			e.setDesignation(result.getString("designation"));
			e.setCreated(result.getString("created"));
		}
		stm.close();
		return e;
	}
	public boolean createEmployee(Employee e) throws Exception{
		String sql=("INSERT INTO employee Values(?,?,?,?,?");
		PreparedStatement stm=conn.prepareStatement(sql);
		stm.setString(1,e.getId());
		stm.setString(2,e.getName());
		stm.setString(3,e.getEmail());
		stm.setString(4,e.getDesignation());
		stm.setString(5,e.getCreated());
		int hasil=stm.executeUpdate();
		stm.close();
		if (hasil > 0){
			return true;
		}
		return false;
	}

	public boolean updateEmployee(Employee e) throws Exception {
		String sql = ("UPDATE employee SET name= ? , email = ? , designation = ? WHERE id = ? ");
		PreparedStatement stm=conn.prepareStatement(sql);
		stm.setString(1,e.getId());
		stm.setString(2,e.getName());
		stm.setString(3,e.getEmail());
		stm.setString(4,e.getDesignation());
		int hasil = stm.executeUpdate();
		stm.close();
		if (hasil > 0){
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(String nip) throws Exception{
		String sql = "DELETE FROM employee WHERE id = ? ";
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setString(1, nip);
		int hasil = stm.executeUpdate();
		stm.close();
		if (hasil > 0){
			return true;
		}
		return false;
	}
}