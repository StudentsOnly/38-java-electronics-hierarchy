public class Television extends ElectronicDevice{

    public int screenSize;

    public Television(){
        super();
        screenSize = 0;
    }

    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

    public int getScreenSize(){
        return screenSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nTelevision:");
        super.displayInfo();
        System.out.println("screen size = " + screenSize + "\";");
    }
}
