public class Main {

    public static void main(String[] args) {

        System.out.println("\uD83D\uDCFA===Television===\uD83D\uDCFA");
        Television television = new Television();
        television.setBrand("LG");
        television.setPrice(999.99);
        television.setScreenSize(97);
        television.displayInfo();

        System.out.println("\uD83D\uDCF1===Smartphone===\uD83D\uDCF1");
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Samsung");
        smartphone.setPrice(1399.99);
        smartphone.setOperatingSystem("Android 8.0 \"Oreo\"");
        smartphone.displayInfo();


    }

}
