public class Television extends ElectronicDevice {

   private int screenSize;

    public Television(String brand, double price, int screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
