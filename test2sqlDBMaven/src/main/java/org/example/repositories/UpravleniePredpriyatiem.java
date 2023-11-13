package org.example.repositories;

import org.example.models.Sklady;
import org.example.repositories.SkladRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UpravleniePredpriyatiem {

    @Autowired
    private SkladRepository skladRepository;

    @GetMapping("/UpravlenPre/UpravleniePredpriyatiem")
    public String showUpravleniePage (Model model)
    {
        return "/UpravlenPre/UpravleniePredpriyatiem";
    }

    @GetMapping("/UpravlenPre/UpravlenieSotrudniki/Sotrudniki")

        public String showSotrudnikiPage(Model model)
    {
        return "/UpravlenPre/UpravlenieSotrudniki/Sotrudniki";
    }


    @GetMapping("/UpravlenPre/UpravlenieProizvodstvom/SettSklady")

    public String showSettSkladyPage(Model model)
    {
        Iterable<Sklady> skladElement = skladRepository.findAll();
        model.addAttribute("sklady",skladElement);
        return "/UpravlenPre/UpravlenieProizvodstvom/SettSklady";
    }

}
