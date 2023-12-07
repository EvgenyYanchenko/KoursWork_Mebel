package org.example.repositories;


import org.example.models.Dolgnosti;
import org.example.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepo;

    @PostMapping("/UpravlenPre/Sotrudniki&PositionsADD")
    public String addToDB(@RequestParam String lastNAme,
                          @RequestParam String firstName,
                          @RequestParam String sourName,
                          @RequestParam String adressEmployee,
                          @RequestParam String phoneEmployee,
                          @RequestParam("dateOfBirth") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfBirth,
                          Model model) {

//        if("add".equals(action))
//        {
            Employee newEmployee = new Employee(lastNAme,firstName,sourName,adressEmployee,phoneEmployee, dateOfBirth);
            employeeRepo.save(newEmployee);
//        }
        System.out.println("Into Create Empl!!!!!!");
        return "redirect:/UpravlenPre/SotrudnikiSet";
    }


}








