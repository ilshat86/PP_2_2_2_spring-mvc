package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("ford", "focus", 1));
        cars.add(new Car("ford", "focus", 2));
        cars.add(new Car("ford", "focus", 3));
        cars.add(new Car("toyota", "mark", 1));
        cars.add(new Car("toyota", "mark", 2));
        cars.add(new Car("toyota", "prado", 4));
    }

    public List<Car> listCar(int count) {
        if (count < 5) {
            return cars.subList(0, count);
        } else return cars;
    }

}
