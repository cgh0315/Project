package com.cgh.first.controller;

import com.cgh.first.dao.DepartmentDao;
import com.cgh.first.dao.EmployeeDao;
import com.cgh.first.entities.Department;
import com.cgh.first.entities.Employee;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

@Controller
public class EmployController {

    @Resource
    EmployeeDao employeeDao;

    @Resource
    DepartmentDao departmentDao;

    @GetMapping(value = "/emps")
    public String listEmploys(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "employ/list";
    }

    @GetMapping(value = "/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "employ/add";
    }

    @PostMapping(value = "/emp")
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping(value = "/emp/{id}")
    public String toModifyEmp(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "employ/add";
    }

    @PutMapping(value = "/emp")
    public String modifyEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping(value = "/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id,Model model){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
