public class Television extends ElectronicDevice {

    private int screenSize;

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
