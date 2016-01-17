package Lesson10;


public class Demo {
    public static void main(String[] args) {
        Nissan nissan = new Nissan();
        Toyota toyota = new Toyota();

        CarStorage<Car> cars = new CarStorage<>();

        nissan.setPrice(10000);
        toyota.setPrice(9000);
        cars.addCar(nissan);
        cars.addCar(toyota);
        cars.printList();
        cars.sortByPrice();
        cars.printList();
    }
}
