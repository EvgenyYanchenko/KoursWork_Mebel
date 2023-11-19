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
    public String addToDB(@RequestParam ("action") String action,
                          @RequestParam String nameSklada,
                          @RequestParam String adressSklada,
                          @RequestParam String phoneSklada,
                          Model model) {

        if("add".equals(action))
        {
            Sklady newSklad = new Sklady(nameSklada, adressSklada, phoneSklada);
            skladRepository.save(newSklad);
        }
        else if ("remove".equals(action))
        {
            Sklady skladForDeleting = skladRepository.findById(nameSklada).orElseThrow();
            skladRepository.delete(skladForDeleting);
        }
        return "redirect:/UpravlenPre/UpravlenieProizvodstvom/SettSklady";
    }


}


