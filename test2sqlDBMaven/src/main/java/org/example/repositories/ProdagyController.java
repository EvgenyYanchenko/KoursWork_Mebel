package org.example.repositories;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdagyController {

    @GetMapping("/Prodagy/Torgovlja")
    public  String showTorgovljaPage(Model model)
    {
        return "/Prodagy/Torgovlja";
    }
}
