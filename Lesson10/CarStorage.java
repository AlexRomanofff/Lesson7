package Lesson10;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarStorage<T extends Car> {

    private List<T> cars;

    public CarStorage () {
        cars = new ArrayList<>();
    }

    public void addCar (T car) {
        cars.add(car);
    }
    public List<T> getCar () {
        return new ArrayList<>(cars);
    }
    public void removeCar (T car) {
        cars.remove(car);
    }
    public void printList () {
        for (Car car : cars) {
            System.out.println( car.getManufacturer());
        }
    }

    public void sortByPrice () {
        cars.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return Double.valueOf(o1.getPrice()).compareTo(o2.getPrice());
            }
        });

    }

}
