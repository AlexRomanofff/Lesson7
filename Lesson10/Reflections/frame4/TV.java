package Lesson10.Reflections.frame4;


public class TV {

    private int weight;
    private int height;
    private String manufacturer;
    private String price;

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
    public TV (int weight,  String manufacturer, int height, String price) {
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

    public String getPrice() {
        return price;
    }
}
