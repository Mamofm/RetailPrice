import java.util.Scanner;
public class RetailPrice {
    public static void main(String args[]) {
        String cont;
        double cost, retail, rate;
        Scanner keybd = new Scanner(System.in);
        rate = 2.5;  // keybd.nextDouble()
        System.out.println("Enter cost:");
        cost = keybd.nextDouble();
        do {
            // Retail Price = Wholesale Cost X 2.5
            retail =   cost * rate;
            System.out.println("Retail value is: " + retail);

            System.out.println("Enter cost:");
            cost = keybd.nextDouble();
        } while (cost != -1);
    }
}
