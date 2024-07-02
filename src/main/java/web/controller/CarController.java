package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarServiceImpl carService;

    public CarController() {
        carService = new CarServiceImpl();
    }

    @GetMapping(value = "/cars")
    public String getCountCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.getCarsByCounts(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
