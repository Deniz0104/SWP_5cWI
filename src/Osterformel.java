import java.sql.SQLOutput;
import java.util.Scanner;

public class Osterformel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ostersonntag-Rechner!");
        System.out.println("Geben Sie eine Jahreszahl ein");
        int year = scanner.nextInt();

        int n = year - 1900;
        int a = n % 19;
        int b = ((7*a+1)/19);
        int m = (11*a+4-b) % 29;
        int q = n/4;
        int w = (n+q+31-m) % 7;

        int P = 25-m-w;

        System.out.println("Ostersonntag ist der " + P +
                ". April");
    }
}
