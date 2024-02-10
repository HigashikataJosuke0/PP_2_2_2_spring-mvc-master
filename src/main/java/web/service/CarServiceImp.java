package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars = getCars();

    private List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Red", "Niva"));
        cars.add(new Car(2, "Yellow", "Lada"));
        cars.add(new Car(3, "Green", "Oka"));
        cars.add(new Car(4, "Black", "Audi"));
        cars.add(new Car(5, "Blue", "Porshe"));
        return cars;
    }
@Override
    public List<Car> getCarsByCount(Optional<Integer> count) {
        int tmp = count.isEmpty() ? 0 : count.get();

        if (tmp < 5 && tmp >= 1) {
            return cars.stream()
                    .limit(tmp)
                    .toList();
        }else {
            return cars;
        }
    }

}
