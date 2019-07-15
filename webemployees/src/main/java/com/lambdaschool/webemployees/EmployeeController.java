package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Managed by spring boot - mappings of end points - annotation
@RestController

// all endpoint start with "/data/" no semicolon after annotations
@RequestMapping("/data")
public class EmployeeController {

    // localhost:2019/data/allemployees
    @GetMapping(value = "/allemployees",
                produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees() {
        return new ResponseEntity<>(WebemployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }

    // localhost:2019/data/employee/2
    @GetMapping(value = "/employee/{id}",
            produces = {"application/json"})
    public ResponseEntity<?> getEmpDetail(@PathVariable long id) {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }
}
