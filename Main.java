import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        // Making it more complicated to practice.

        List<ElectronicDevice> list = new ArrayList<>(List.of(
                new Television("LG", 999.99, 22),
                new Smartphone("Apple", 599.99, "MacOS"))
        );

        for (ElectronicDevice device : list) {
            System.out.print(device.getClass().getSimpleName() + ", Brand: " + device.getBrand() +
                    ", Price: $" + device.getPrice());
            System.out.println(
                    (device instanceof Television tv) ? ", Screen Size: " + tv.getScreenSize() + " inch":
                    (device instanceof Smartphone sp) ? ", Operating System: " + sp.getOperatingSystem() :
                    ""
            );
        }

    }

}
