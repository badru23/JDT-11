package id.co.indivara.jdt11.departmentsjpa.services;

import id.co.indivara.jdt11.departmentsjpa.entity.Department;

import java.util.List;

public interface DepartmentService {
    //Method untuk input data dapartment
    Department saveDepartments(Department department);

    //Method untuk ambil semua data departments
    List<Department> fetchDepartmentList();

    //Method untuk operasi update data departments
    Department updateDepartment(Department department, long departmentId);

    //Method untuk menghapus  data departments
    void deleteDepartmentById(Long departmentId);
}
