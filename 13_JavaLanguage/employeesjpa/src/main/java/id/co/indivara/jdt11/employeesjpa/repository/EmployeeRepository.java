package id.co.indivara.jdt11.employeesjpa.repository;
import id.co.indivara.jdt11.employeesjpa.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
