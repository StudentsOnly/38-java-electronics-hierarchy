class Smartphone extends ElectronicDevice {
    private String operatingSystem;

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void displayInfo() {
        System.out.println("Device: Smartphone");
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: $" + getPrice());
        System.out.println("Operating System: " + getOperatingSystem());
    }
}