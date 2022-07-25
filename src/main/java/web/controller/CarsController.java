package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarService carsService;

    @GetMapping()
    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
        List<Car> qtyCars = carsService.carList(count);
        model.addAttribute("cars", qtyCars);
        return "cars";
    }

}