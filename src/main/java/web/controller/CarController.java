package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.ServiceFilter;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String CarsList(@RequestParam("count") int count, Model model){

        model.addAttribute("cars", ServiceFilter.getSomeCar(count));

        return "cars";
    }
}


//        for(Car car : ServiceFilter.getSomeCar(count)){
//            System.out.println(car);
//        }