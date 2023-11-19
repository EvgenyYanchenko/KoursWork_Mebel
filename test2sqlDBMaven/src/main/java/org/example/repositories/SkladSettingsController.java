package org.example.repositories;


import org.example.models.Sklady;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SkladSettingsController {
    @Autowired
    private SkladRepository skladRepository;
    @PostMapping("/UpravlenPre/UpravlenieProizvodstvom/SettSklady")
    public String addToDB(@RequestParam String nameSklada,
                          @RequestParam String adressSklada,
                          @RequestParam String phoneSklada,
                          Model model) {
        Sklady newSklad = new Sklady(nameSklada, adressSklada, phoneSklada);
        skladRepository.save(newSklad);


        return "redirect:/UpravlenPre/UpravlenieProizvodstvom/SettSklady";
    }


}


