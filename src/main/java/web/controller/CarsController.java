package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String printCarsBycount(@RequestParam(value = "count",required = false)  Optional<Integer> count,ModelMap model){
        model.addAttribute("cars",carService.getCarsByCount(count).stream().toList());
        return "cars";
    }
}
