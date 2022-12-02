package id.co.indivara.jdt11.departmentsjpa.controller;

import id.co.indivara.jdt11.departmentsjpa.entity.Department;
import id.co.indivara.jdt11.departmentsjpa.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department/v1")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService ;

    //Method untuk input data department ke table database
    @PostMapping("/departments")
    public Department simpanDataDepartment(@RequestBody Department department){
        return  departmentService.saveDepartments(department);
    }

    //Method untuk mengambil data dari table
    @GetMapping("/departmentview")
    public List<Department> ambilDataSemuaDepartment(){
        return departmentService.fetchDepartmentList();
    }

    //Method untuk update data
    @PutMapping("departments/{id}")
    public Department updateDepartment(@RequestBody Department department,@PathVariable("id") Long departmentId){
        return  departmentService.updateDepartment(department, departmentId);
    }

    //Method untuk delete data
    @DeleteMapping("departments/{id}")
    public String hapusDataDepartment(@PathVariable("id") Long id){
        departmentService.deleteDepartmentById(id);
        return "Data berhasil di hapus!";
    }
}
