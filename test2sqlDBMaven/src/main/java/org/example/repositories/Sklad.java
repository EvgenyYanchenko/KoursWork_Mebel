package org.example.repositories;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sklad {

    @GetMapping ("/Sklad/Sklad")
    public String showSkladPage (Model model)
    {
        return "/Sklad/Sklad";
    }
}
