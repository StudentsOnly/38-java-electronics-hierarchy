public class Smartphone extends ElectronicDevice {

    private String operatingSystem;

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }

}
