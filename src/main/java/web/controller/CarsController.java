package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private final CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printCars (@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = carService.printCars(count);
        model.addAttribute("cars", cars);
        return "Car";
    }
}
