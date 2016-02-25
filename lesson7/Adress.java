package lesson7;

public class Adress {

    private String city;
    private String street;
    private int house;

    public Adress () {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Adress) {
            Adress adress = (Adress) obj;
            if (getStreet() != null && getCity() != null && getHouse() > 0) {
                return (getCity().equals(adress.city) && getStreet().equals(adress.street) && getHouse() > 0);
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
            int result = 24;
            result = 37*result+getCity().hashCode();
            result = 37*result+getStreet().hashCode();
            return 37*result+getHouse();
    }
}
