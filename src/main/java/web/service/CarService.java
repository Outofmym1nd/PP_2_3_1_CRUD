package web.service;

import web.entity.Car;

import java.util.List;

public class CarService {


    public static List<Car> getSomeCar(List<Car> listCar, int limit) {
        return Car.getSomeCar(listCar, limit);
    }
}
