package org.example.repositories;

import org.example.models.Sklady;
import org.example.models.Stores;
import org.example.repositories.SkladRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpravleniePredpriyatiem {

    @Autowired
    private SkladRepository skladRepository;
    private StoreSettingsRepository storesRepository;

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
//        Iterable<Stores> someStore = storesRepository.findAll();
//        model.addAttribute("stores", someStore);
        return "/UpravlenPre/StoreSettings";
    }

}
