public class Main{
    public static void main(String[] args) {

        Television tv = new Television();
        tv.setBrand("LG");
        tv.setPrice(2100);
        tv.setScreenSize(65);

        Smartphone phone = new Smartphone();
        phone.setBrand("Apple");
        phone.setPrice(999);
        phone.setOperatingSystem("iPhone OS");

        tv.displayInfo();
        phone.displayInfo();
    }

}
