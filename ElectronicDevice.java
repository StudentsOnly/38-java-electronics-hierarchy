public class ElectronicDevice {

    protected String brand;
    protected double price;

    public ElectronicDevice(){
        brand = "Bosch";
        price = 0;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public  void setPrice(double price){
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }
     public double getPrice(){
        return price;
     }

     public void displayInfo(){
         System.out.println("brand = '" + brand + "';");
         System.out.println("price = " + price + "$;");
     }
}
