package android.example.com.scrollinapp;

public class Fruit {
    private String color;
    private String name; //apple has no access to this

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
