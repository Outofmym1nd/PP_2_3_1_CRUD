package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {


    private static final List<Car> listCar;

    static {
        Car car1 = new Car("sedan", "toyota", 200);
        Car car2 = new Car("sedan", "mercedes", 250);
        Car car3 = new Car("estate", "skoda", 152);
        Car car4 = new Car("suv", "volvo", 235);
        Car car5 = new Car("liftback", "audi", 249);

        listCar = List.of(car1, car2, car3, car4, car5);
    }

    public List<Car> getListCar() {
        return listCar;
    }

    @Override
    public List<Car> getSomeCar(List<Car> listCar, int limit) {
        return listCar.stream().limit(limit).toList();
    }
}
