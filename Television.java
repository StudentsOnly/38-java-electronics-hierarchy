class Television extends ElectronicDevice {
    private int screenSize;

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void displayInfo() {
        System.out.println("Device: Television");
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: $" + getPrice());
        System.out.println("Screen Size: " + getScreenSize());
    }
}
