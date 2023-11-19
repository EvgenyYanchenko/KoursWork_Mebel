package org.example.repositories;



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
    @PostMapping("/UpravlenPre/StoreSettings")
    public String addToDB(@RequestParam ("action") String action,
                          @RequestParam String storeName,
                          @RequestParam String storeAdress,
                          @RequestParam int storeSpace,
                          Model model) {

        if("add".equals(action))
        {
            Stores newstore = new Stores(storeName, storeAdress, storeSpace);
            storeRepo.save(newstore);
        }
        else if ("remove".equals(action))
        {
            Stores storeForDeleting = storeRepo.findById(storeName).orElseThrow();
            storeRepo.delete(storeForDeleting);
        }
        return "redirect:/UpravlenPre/StoreSettings";
    }


}


