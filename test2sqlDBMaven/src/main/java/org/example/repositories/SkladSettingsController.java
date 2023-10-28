package org.example.repositories;

import org.example.models.Dolgnosti;
import org.example.models.Sklady;
import org.example.repositories.SkladRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SkladSettingsController {
    @Autowired
    private SkladRepository skladRepository;

//
//    @GetMapping ("/UpravlenPre/UpravlenieProizvodstvom/SettSklady")
//    public String showSettingsSkladyPage (Model model)
//    {
//        return "/UpravlenPre/UpravlenieProizvodstvom/SettSklady";
//    }

//
//        @GetMapping("/UpravlenPre/UpravlenieProizvodstvom/SettSklady")//заполняем таблицу java из БД и посылаем в HTML Dolgnosti
//    public String fillingAllSkladyTable(Model model) {
//        Iterable<Sklady> skladElement = skladRepository.findAll();
//        model.addAttribute("skladyHTML", skladElement);
//
//        return "/UpravlenPre/UpravlenieProizvodstvom/SettSklady";
//    }

    @PostMapping("/UpravlenPre/UpravlenieProizvodstvom/SettSklady") // получаем данные из html формы, кидаем их в объект  Post?  и сохраняем в БД
    public String addToDB(@RequestParam String nameSklada,
                          @RequestParam String adressSklada,
                          @RequestParam String phoneSklada,
                          Model model)
    {
        Sklady newSklad = new Sklady(nameSklada, adressSklada,phoneSklada);
        skladRepository.save(newSklad);
//
//        Dolgnosti newDolgnost = new Dolgnosti(nazvanie_Dolgnosti, kategoriya, oklad);
//        dolgnostiRepository.save(newDolgnost);
        return "redirect:/UpravlenPre/UpravlenieProizvodstvom/SettSklady";
    }

}


