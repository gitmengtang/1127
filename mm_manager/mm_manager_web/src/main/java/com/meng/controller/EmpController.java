package com.meng.controller;

import com.meng.pojo.Employee;
import com.meng.service.Imp.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {
    @Autowired
   private EmployeeService employeeService;
    @ResponseBody
    @RequestMapping("getEmp/{id}")
    public String getEmp(Model model, @PathVariable int id){
        Employee empById = employeeService.getEmpById(id);
//        model.addAttribute("emp",empById);
        return "index";
    }


}
