package service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {
    @Autowired
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(111, "BMW", "black"));
        cars.add(new Car(222, "Mazda", "blue"));
        cars.add(new Car(333, "Vaz", "white"));
        cars.add(new Car(444, "Audi", "red"));
        cars.add(new Car(555, "Geely", "yellow"));
    }

    @Override
    public List<Car> getCarsByCounts(int count) {
        if (count > cars.toArray().length) {
            count = cars.toArray().length;
        }
        return cars.subList(0, count);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
