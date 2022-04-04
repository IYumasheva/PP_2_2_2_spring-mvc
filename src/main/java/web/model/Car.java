package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String color;
    private String model;
    private String brand;

    public Car(String color, String model, String brand) {
        this.color = color;
        this.model = model;
        this.brand = brand;
    }

    public static List<Car> get5Cars(){
        List<Car> list = new ArrayList<>();
        list.add(new Car("white", "Cayenne", "Porsche"));
        list.add(new Car("grey", "Cayenne", "Porsche"));
        list.add(new Car("pink", "Cayenne", "Porsche"));
        list.add(new Car("red", "Cayenne", "Porsche"));
        list.add(new Car("green", "Cayenne", "Porsche"));
        return list;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
