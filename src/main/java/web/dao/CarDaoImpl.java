package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;


    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(111, "BMW", "black"));
        cars.add(new Car(222, "Mazda", "blue"));
        cars.add(new Car(333, "Vaz", "white"));
        cars.add(new Car(444, "Audi", "red"));
        cars.add(new Car(555, "Geely", "yellow"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count > cars.size()) {
            count = cars.size();
        }
        return cars.subList(0, count);
    }
}