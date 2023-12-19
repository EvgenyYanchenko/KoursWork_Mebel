package org.example.repositories;


import org.example.models.Dolgnosti;
import org.example.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    DolgnostiRepository dolgnRepo;

    // Sotrudniki settings show page
    @GetMapping("/UpravlenPre/SotrudnikiSet")
    public String showSotrudnikiSettingsPage(Model model) {
        Iterable<Employee> element = employeeRepo.findAll();
        model.addAttribute("employee", element);
        return "/UpravlenPre/SotrudnikiSet";
    }


    @GetMapping("/UpravlenPre/Sotrudniki&PositionsADD")
    public String showPositionsADD(Model model) {
        System.out.println("redirect to Sotrudniki&PositionsADD");

        //add dolgnosti to select elmnt
        Iterable<Dolgnosti> dolgnosti = dolgnRepo.findAll();
        model.addAttribute("dolgnosti", dolgnosti);

        return "/UpravlenPre/Sotrudniki&PositionsADD";
    }

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
        Employee newEmployee = new Employee(lastNAme, firstName, sourName, adressEmployee, phoneEmployee, dateOfBirth);
        employeeRepo.save(newEmployee);
//        }
        System.out.println("Into Create Empl!!!!!!");
        return "redirect:/UpravlenPre/SotrudnikiSet";
    }

//    @PostMapping("/UpravlenPre/Sotrudniki&PositionsADD")
//    public String addToDB(@RequestParam String nazvanie_Dolgnosti,
//                          @RequestParam String kategoriya,
//                          @RequestParam int oklad,
//                          Model model) {
//
//        Dolgnosti newDolgnost = new Dolgnosti(nazvanie_Dolgnosti,kategoriya,oklad);
//        dolgnRepo.save(newDolgnost);
//
//        return "redirect:/UpravlenPre/Sotrudniki&PositionsADD";
//    }

//      2 forms data are processing
//    @PostMapping("/processForm")
//    public ResponseEntity<String> processForm(@RequestParam("data1") String data1, @RequestParam("data2") String data2) {
//        // Обработка данных формы
//        // ...
//
//        return ResponseEntity.ok("Success");
//    }


}








