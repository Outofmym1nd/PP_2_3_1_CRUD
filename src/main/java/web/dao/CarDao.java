package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {


    List<Car> getListCar();

    List<Car> getSomeCar(List<Car> listCar, int limit);
}
