package com.cgh.first.controller;

import com.cgh.first.dao.EmployeeDao;
import com.cgh.first.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class employController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping(value = "/emps")
    public String getAllEmps(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "emp/list";
    }

}
