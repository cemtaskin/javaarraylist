import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> carMades = new ArrayList<String>();
        System.out.println("Please enter top 10 car mades");
        for (int i=0;i<10;i++){
            String carMade = scanner.nextLine();
            carMades.add(carMade);
        }

        Collections.sort(carMades);

        for (String carMade : carMades) {
            System.out.println("Car made : " + carMade);
        }
    }
}
