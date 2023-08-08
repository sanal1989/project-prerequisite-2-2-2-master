package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> cars ;

    public CarService() {
        this.cars = Car.cars;
        cars.add(new Car("LADA", "WHITE", 2010));
        cars.add(new Car("BMW", "BLACK", 2020));
        cars.add(new Car("HONDA", "RED", 2021));
        cars.add(new Car("HAMMER", "BLACK", 2020));
        cars.add(new Car("KIA", "WHITE", 2022));
    }

    public List<Car> countCar(int count){
        List<Car> list = new ArrayList<>();
        if(count > 5) count = cars.size();
        for (int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
