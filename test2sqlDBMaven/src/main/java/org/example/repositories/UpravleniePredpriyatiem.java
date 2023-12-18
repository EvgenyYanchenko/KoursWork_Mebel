package org.example.repositories;

import org.example.models.Dolgnosti;
import org.example.models.Employee;
import org.example.models.Sklady;
import org.example.models.Stores;
import org.example.models.Formy_sobstv_postavshikov;
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

    @Autowired
    private FormSobstvRepository formSobstvRepo;

    @Autowired
    private DolgnostiRepository dolgnRepo;

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
    @GetMapping("/UpravlenPre/SotrudnikiSet")
    public String showSotrudnikiSettingsPage(Model model)
    {
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


        //    Формы собственности Поставщиков
        @GetMapping("/UpravlenPre/FormSobstvennostiPostavshikov")
    public String showFormSobstvennostiPostavshikov(Model model) {
            Iterable<Formy_sobstv_postavshikov> element = formSobstvRepo.findAll();
            model.addAttribute("formy_sobstv_postavshikov", element);
        return "/UpravlenPre/FormSobstvennostiPostavshikov";
    }
    @PostMapping("/UpravlenPre/FormSobstvennostiPostavshikov")
    public String addFormSobstv(@RequestParam ("action") String action,
                          @RequestParam Long id_form_sobstv,
                          @RequestParam String nazvanie_form_sobstv,
                          Model model) {

        if("add".equals(action))
        {
            Formy_sobstv_postavshikov newForma = new Formy_sobstv_postavshikov(nazvanie_form_sobstv);
            formSobstvRepo.save(newForma);
        }
        else if ("remove".equals(action))
        {
            Formy_sobstv_postavshikov formaForRemove = formSobstvRepo.findById(id_form_sobstv).orElseThrow();
            formSobstvRepo.delete(formaForRemove);
        }
        return "redirect:/UpravlenPre/FormSobstvennostiPostavshikov";
    }

}
