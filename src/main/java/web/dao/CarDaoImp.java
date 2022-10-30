package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao {

    List<Car> cars = new ArrayList<>();

    public CarDaoImp() {
        this.cars.add(new Car("ford", "focus", 1));
        this.cars.add(new Car("ford", "focus", 2));
        this.cars.add(new Car("ford", "focus", 3));
        this.cars.add(new Car("toyota", "mark", 1));
        this.cars.add(new Car("toyota", "mark", 2));
        this.cars.add(new Car("toyota", "prado", 4));
    }

    @Override
    public List<Car> listCar(int count) {
        if (count < 5) {
            return cars.subList(0, count);
        } else return cars;
    }

}
