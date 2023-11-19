package org.example.repositories;


import org.example.models.Sklady;
import org.example.models.Stores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StoreSettingsController {
    @Autowired
    private StoreSettingsRepository storeRepo;
    @PostMapping("/UpravlenPre/UpravlenieProizvodstvom/StoreSettings")
    public String addToDB(@RequestParam ("action") String action,
                          @RequestParam String nameSklada,
                          @RequestParam String adressSklada,
                          @RequestParam String phoneSklada,
                          Model model) {

        if("add".equals(action))
        {
            Stores newSklad = new Stores(nameSklada, adressSklada, phoneSklada);
            storeRepo.save(newSklad);
        }
        else if ("remove".equals(action))
        {
            Stores storeForDeleting = storeRepo.findById(nameSklada).orElseThrow();
            storeRepo.delete(storeForDeleting);
        }
        return "redirect:/UpravlenPre/UpravlenieProizvodstvom/StoreSettings";
    }


}


