package web.model;

public class Car {


    private String type;
    private String model;
    private int horsePower;

    public Car(String type, String model, int horsePower) {
        this.type = type;
        this.model = model;
        this.horsePower = horsePower;
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
