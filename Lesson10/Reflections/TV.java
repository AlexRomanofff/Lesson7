package Lesson10.Reflections;


public class TV {
    public int height;
    public int weight;
    private String brand;

    public int getWeight() {
        return weight;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
