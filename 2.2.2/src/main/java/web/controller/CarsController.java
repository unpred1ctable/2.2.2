package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false, defaultValue = "5") Integer count)  {
        List<Car> cars = carService.carsList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
