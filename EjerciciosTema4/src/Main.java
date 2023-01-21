import com.smart.SmartPhone;
import com.smart.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Smsung", "s10", "Azul", 8, "android");
        SmartWatch smartWatch = new SmartWatch("Xiaomi", "mi band 6", "negro", 3.5, "Bluetooh");

        System.out.println("El smartphone es:" + smartPhone + "\nEl smartwatch es: " + smartWatch);
    }
}