package org.example.repositories;

import org.example.models.Dolgnosti;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SkladController {

    @GetMapping ("/Sklad/Sklad")
    public String showSkladPage (Model model)
    {
        return "/Sklad/Sklad";
    }


    //    @GetMapping("/tableDolgnosti")//заполняем таблицу java из БД и посылаем в HTML Dolgnosti
//    public String greeting(Model model) {
//        Iterable<Dolgnosti> dlgnElement = dolgnostiRepository.findAll();
//        model.addAttribute("dolgnosti", dlgnElement);
//
//        return "tableDolgnosti";
//    }

}


