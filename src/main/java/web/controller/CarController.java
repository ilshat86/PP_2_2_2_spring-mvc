package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String getCars(ModelMap model, @RequestParam(required = false, defaultValue = "5", name = "count") int count) {
        List<Car> cars = carDao.listCar(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
