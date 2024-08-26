public class Main{
    public static void main(String[] args) {

        Television tv = new Television();
        tv.setBrand("Sony");
        tv.setPrice(2599.99);
        tv.setScreenSize(65);
        tv.displayInfo();

        System.out.println();

        Smartphone phone = new Smartphone();
        phone.setBrand("Sony");
        phone.setPrice(599.99);
        phone.setOperatingSystem("Android");
        phone.displayInfo();
    }
}
