package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.ServiceFilter;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String CarsList(@RequestParam(value = "count", required = false) Integer count, Model model){
            model.addAttribute("cars", ServiceFilter.getSomeCar(count));
        return "cars";
    }
}