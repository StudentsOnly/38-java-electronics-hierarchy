public class Main{
    public static void main(String[] args){
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Google");
        smartphone.setPrice(900);

        smartphone.setOperatingSystem("Android");
        System.out.println("===Smartphone info===");
        System.out.printf("\tBrand: %s\n", smartphone.getBrand());
        System.out.printf("\tOS: %s\n", smartphone.getOperatingSystem());
        System.out.printf("\tPrice: $%.2f\n", smartphone.getPrice());


        Television tv = new Television();
        tv.setBrand("Samsung");
        tv.setScreenSize(50);
        tv.setPrice(500);

        System.out.println("===TV info===");
        System.out.printf("\tBrand: %s\n", tv.getBrand());
        System.out.printf("\tScreen Size: %d\"\n", tv.getScreenSize());
        System.out.printf("\tPrice: $%.2f\n", tv.getPrice());
    }

}
