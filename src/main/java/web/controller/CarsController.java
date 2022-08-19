package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Mazda", "Red", "Sport-car"));
        cars.add(new Car("Audi", "Blue", "Hatchback"));
        cars.add(new Car("Range Rover", "Black", "Off-Road"));
        cars.add(new Car("Mini Cooper", "Yellow", "Hatchback"));
        cars.add(new Car("Tesla", "White", "E-car"));
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, Model model) {
        if (count != null) {
            List<Car> cars2 = cars.stream().limit(Long.parseLong(count)).collect(Collectors.toList());
            model.addAttribute("cars", cars2);
        } else {
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}
