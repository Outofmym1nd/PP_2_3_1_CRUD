package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;

import java.util.List;

import static web.entity.Car.createCar;
import static web.entity.Car.createListCar;
import static web.service.CarService.getSomeCar;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String helloCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        Car car1 = createCar("sedan", "toyota", 200);
        Car car2 = createCar("sedan", "mercedes", 250);
        Car car3 = createCar("estate", "skoda", 152);
        Car car4 = createCar("suv", "volvo", 235);
        Car car5 = createCar("liftback", "audi", 249);

        List<Car> listCar = createListCar(car1, car2, car3, car4, car5);

        model.addAttribute("listCar",
                (count == null || count >= 5) ? listCar : getSomeCar(listCar, count));
        return "cars";
    }
}