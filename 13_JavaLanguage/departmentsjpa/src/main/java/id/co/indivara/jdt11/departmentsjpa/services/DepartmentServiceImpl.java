package id.co.indivara.jdt11.departmentsjpa.services;

import id.co.indivara.jdt11.departmentsjpa.entity.Department;
import id.co.indivara.jdt11.departmentsjpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartments(Department department){
        return  departmentRepository.save(department);
    }


    public List<Department> fetchDepartmentList(){
        return (List<Department>) departmentRepository.findAll();
    }


    public Department updateDepartment(Department department, long departmentId){
        //Ambil Data Exiting di db yang akan di update
        Department depDB = departmentRepository.findById(departmentId).get();

        //Lakukan Checking , apakah json dikirim oleh client, fieldnya di isi atau tidak
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentsCode()) && !"".equalsIgnoreCase(department.getDepartmentsCode())){
            depDB.setDepartmentsCode(department.getDepartmentsCode());
        }
        return departmentRepository.save(depDB);
    }


    public void deleteDepartmentById(Long departmentId){
        departmentRepository.deleteById(departmentId);
    }

}
