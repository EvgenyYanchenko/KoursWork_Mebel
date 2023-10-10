package org.example;

import org.example.models.Dolgnosti;
import org.example.repositories.DolgnostiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private DolgnostiRepository dolgnostiRepository;




    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false,defaultValue = "World")String name,
                          Map<String, Object> model)
    {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping("/tableDolgnosti")//заполняем таблицу java из БД и посылаем в HTML
    public String greeting(Model model)
    {
        Iterable<Dolgnosti> dlgnElement = dolgnostiRepository.findAll();
        model.addAttribute("dolgnosti", dlgnElement);

        return "tableDolgnosti";
    }

    @GetMapping
    public String main(Map<String,Object> model)
    {
        model.put("some","Lets go codding!!!");
return "main";
    }


}
