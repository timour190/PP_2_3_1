package model;

public class Car {

    private int carNumber;

    @Override
    public String toString() {
        return "Car{" +
                "carNumber=" + carNumber +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    private String model;
    private String color;

    public Car(int carNumber, String model, String color) {
        this.carNumber = carNumber;
        this.model = model;
        this.color = color;
    }
    public Car() {}


    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
