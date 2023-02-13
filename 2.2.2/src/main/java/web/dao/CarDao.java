package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private  static final List<Car> cars = new ArrayList<>();
    static {
        Car car1 = new Car("Mers", 1998, 280);
        Car car2 = new Car("bmw", 2003, 270);
        Car car3 = new Car("kia", 2014, 150);
        Car car4 = new Car("toyota", 2020, 160);
        Car car5 = new Car("audi", 2005, 275);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getFewCars(int count) {
        return cars.subList(0, count);
    }

}
