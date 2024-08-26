public class Smartphone extends ElectronicDevice {

    public String operatingSystem;

    public Smartphone(){
        super();
        operatingSystem = "";
    }

    public Smartphone(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nSmartphone:");
        super.displayInfo();
        System.out.println("operating system = '" + operatingSystem + "';" );
    }
}
