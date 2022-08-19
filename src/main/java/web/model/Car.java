package web.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Car {

    private String model;

    private String color;

    private String type;

    public Car() {
    }

    public Car(String model, String color, String type) {
        this.model = model;
        this.color = color;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
