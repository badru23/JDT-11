package id.co.indivara.jdt11.departmentsjpa.repository;

import id.co.indivara.jdt11.departmentsjpa.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends  CrudRepository<Department, Long> {


}
