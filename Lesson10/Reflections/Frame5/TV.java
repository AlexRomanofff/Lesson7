package Lesson10.Reflections.Frame5;

import java.lang.reflect.Field;

public class TV {

    private int height;
    private int width;
    private String brand;
     public TV () {

     }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getBrand() {
        return brand;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}

