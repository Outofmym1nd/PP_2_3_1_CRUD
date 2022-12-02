package web.entity;

import java.util.List;

public class Car {


    private String type;
    private String model;
    private int horsePower;

    private Car(String type, String model, int horsePower) {
        this.type = type;
        this.model = model;
        this.horsePower = horsePower;
    }

    public static Car createCar(String type, String model, int horsePower) {
        return new Car(type, model, horsePower);
    }

    public static List<Car> createListCar(Car... car) {
        return List.of(car);
    }

    public static List<Car> getSomeCar(List<Car> listCar, int limit) {
        return listCar.stream().limit(limit).toList();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
