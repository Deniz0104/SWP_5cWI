import java.util.Scanner;

public class Addieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        String summand1 = scanner.nextLine();

        System.out.println("Second number: ");
        String summand2 = scanner.nextLine();


        int nextPosition = 0;
        String summe = "";
        for (int i = summand1.length() - 1; i >= 0; i--) {
            int summePosition = Integer.parseInt(summand1.substring(i, i + 1)) + Integer.parseInt(summand2.substring(i, i + 1)) + nextPosition;
            nextPosition = 0;
            if (summePosition >= 10) {
                nextPosition = 1;
            }
            summe = summePosition + summe;
        }
        System.out.println(summand1);
        System.out.println(summand2 + " + ");
        System.out.println("--------------");
        System.out.println(summe);

    }
}


