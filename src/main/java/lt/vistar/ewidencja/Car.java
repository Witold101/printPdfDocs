package lt.vistar.ewidencja;

public class Car {
    private String type;
    private String brand;
    private String number;
    private String engine;

    public Car(String type, String brand, String number, String engine) {
        this.type = type;
        this.brand = brand;
        this.number = number;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumber() {
        return number;
    }

    public String getEngine() {
        return engine;
    }
}
