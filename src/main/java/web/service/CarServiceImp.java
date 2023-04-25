package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
        private List<Car> cars;

        {
            cars = new ArrayList<>();
            cars.add(new Car("Nissan", "Almera", "City"));
            cars.add(new Car("Lada", "Priora", "City"));
            cars.add(new Car("Honda", "Civic", "Sport"));
            cars.add(new Car("Kia", "Stinger", "Sport"));
            cars.add(new Car("Mercedes", "Bens", "S-Class"));
        }

        public List<Car> printCars (Integer count) {
            if (count == null) {
                return cars;
            }
            List<Car> cars1 = cars.stream().limit(count).toList();
            return cars1;
        }

}
