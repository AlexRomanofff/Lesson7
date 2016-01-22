package Lesson10.Containers;


import java.util.ArrayList;
import java.util.List;

public class ServiceRepository<T extends FirstService> {
    private List<T> services;

    public ServiceRepository () {
        services = new ArrayList<>();
    }
    public void addService (T service) {
        services.add(service);
    }
    public void removeService (T service) {
        services.remove(service);
    }
    public List<T> getServices (){
        return new ArrayList<>(services);
    }
}
