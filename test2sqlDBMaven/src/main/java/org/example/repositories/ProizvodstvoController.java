package org.example.repositories;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProizvodstvoController {

    @GetMapping ("/proizvodstvo/Proizvodstvo")
    public String showProizvodstvoPage (Model model)
    {
        return "/proizvodstvo/Proizvodstvo";
    }
}
