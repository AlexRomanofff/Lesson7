package Lesson10.Reflections.frame4;


public class TV {

    private int weight;
    private int height;
    private String manufacturer;
    private double price;

    public TV () {

    }

    public TV (int weight, int height, String manufacturer) {
        this.weight = weight;
        this.height = height;
        this.manufacturer = manufacturer;
    }
    public TV (String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public TV (int weight, int height,  String manufacturer, double price) {
        this.weight = weight;
        this.height = height;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }
}
