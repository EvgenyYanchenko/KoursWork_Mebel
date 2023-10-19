package org.example.repositories;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UpravleniePredpriyatiem {

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

//    @GetMapping("/Prodagy/Torgovlja")
//
//    public String showTorgovljaPage(Model model)
//    {
//        return "/Prodagy/Torgovlja";
//    }
}
