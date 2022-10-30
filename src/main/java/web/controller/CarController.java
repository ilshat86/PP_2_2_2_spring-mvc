package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    CarService carService = new CarServiceImp();

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String getCars(ModelMap model, @RequestParam(required = false, defaultValue = "5", name = "count") int count) {
        List<Car> cars = carService.listCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
