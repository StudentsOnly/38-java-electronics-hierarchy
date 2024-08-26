public class Smartphone extends ElectronicDevice {

    private String operatingSystem;

    public Smartphone(String brand, double price, String operatingSystem) {
        super(brand, price);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
