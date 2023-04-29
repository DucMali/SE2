package com.example.tut03.Controller;

import com.example.tut03.Model.Company;
import com.example.tut03.Model.Employee;
import com.example.tut03.Repository.CompanyRepository;
import com.example.tut03.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "/{id}")
    public String getCompanyById(
            @PathVariable(value = "id") Long id, Model model
    ){
        Company company = companyRepository.getById(id);
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        model.addAttribute("company", company);
        return "companyDetail";
    }
}
