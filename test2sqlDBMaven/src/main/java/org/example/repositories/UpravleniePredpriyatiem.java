package org.example.repositories;

import org.example.models.Dolgnosti;
import org.example.models.Employee;
import org.example.models.Sklady;
import org.example.models.Stores;
import org.example.repositories.SkladRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class UpravleniePredpriyatiem {

    @Autowired
    private SkladRepository skladRepository;

    @Autowired
    private StoreSettingsRepository storesRepository;

    @Autowired
    private EmployeeRepository employeeRepo;

    @GetMapping("/UpravlenPre/UpravleniePredpriyatiem")
    public String showUpravleniePage (Model model)
    {
        return "/UpravlenPre/UpravleniePredpriyatiem";
    }


    // Settings Sklady
    @GetMapping("/UpravlenPre/UpravlenieProizvodstvom/SettSklady")
    public String showSettSkladyPage(Model model)
    {
        Iterable<Sklady> skladElement = skladRepository.findAll();
        model.addAttribute("sklady",skladElement);
        return "/UpravlenPre/UpravlenieProizvodstvom/SettSklady";
    }





    // StoresSettings show page
    @GetMapping("/UpravlenPre/StoreSettings")
    public String showSettStoresPage(Model model)
    {
        Iterable<Stores> someStore = storesRepository.findAll();
        model.addAttribute("stores", someStore);
        return "/UpravlenPre/StoreSettings";
    }


    // Sotrudniki settings show page
    @GetMapping("/UpravlenPre/SotrudnikiSettings")
    public String showSotrudnikiSettingsPage(Model model)
    {
//        Iterable<Employee> element = employeeRepo.findAll();
//        model.addAttribute("employee", element);
        return "/UpravlenPre/SotrudnikiSettings";
    }

    @PostMapping("/UpravlenPre/Sotrudniki&PositionsADD")
    public String addToDB(@RequestParam String employeeLastName,
                          @RequestParam String employeeName,
                          @RequestParam String employeeSourName,
                          @RequestParam String employeeAdress,
                          @RequestParam Date employeeDateOfBirth,
                          @RequestParam String employeePhone,
                          @RequestParam Dolgnosti employeePositions,
                          Model model) {


        return "redirect:/UpravlenPre/Sotrudniki&PositionsADD";
    }


}
