package id.co.indivara.jdt11.employeesjpa.controller;

import id.co.indivara.jdt11.employeesjpa.entity.Employee;
import id.co.indivara.jdt11.employeesjpa.exception.DataKagaKetemuException;
import id.co.indivara.jdt11.employeesjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee/api/v1/")
public class EmpolyeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    //Ambil semua data Employee
    @GetMapping("/employee")
    public List<Employee> ambilSemuaDataEmployee(){
        return employeeRepository.findAll();
    }


    @GetMapping("/employee/{id}")
    public ResponseEntity <Employee> cariDataEmployee(@PathVariable(value = "id")Long employeeId ) throws DataKagaKetemuException {
        Employee employee= employeeRepository.findById(employeeId) .orElseThrow(()-> new DataKagaKetemuException("Employee Dengan nip : " + employeeId + "Tidak ada"));
        return ResponseEntity.ok().body(employee);
    }

    //Insert Data Employee
    @PostMapping("/employeepost")
    public Employee insertDataEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    //Upadate Data Employee
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateDataEmploye(@PathVariable(value = "id")Long employeeId,
                                                      @RequestBody @Valid Employee employeeDetails) throws DataKagaKetemuException{
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(()-> new DataKagaKetemuException("Employee Dengan nip : " + employeeId + "Tidak ada"));
        employee.setEmailId(employeeDetails.getEmailId());
        employee.setFirstname(employeeDetails.getFirstname());
        employee.setLastname(employeeDetails.getLastname());
        Employee updateEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("/employee/{id}")
    public Map<String,Boolean> ErorEmployee (@PathVariable(value = "id")Long employeeId,
                                             @RequestBody @Valid Employee employeeDetails) throws DataKagaKetemuException {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new DataKagaKetemuException("Employee Dengan nip : " + employeeId + " Tidak ada"));
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Employee Has Been Eror Succesfull", Boolean.TRUE);
        return response;
    }

}
