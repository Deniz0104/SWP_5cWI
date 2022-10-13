import java.util.Scanner;

public class Addieren {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        String summand1 = scanner.nextLine();

        System.out.println("Second number: ");
        String summand2 = scanner.nextLine();


        if (summand1.length() - summand2.length() != 0) {
            int difference = summand1.length() - summand2.length();
            if (difference < 0) {
                for (int i = difference; i < 0; i++) {
                    summand1 = "0" + summand1;
                }
            } else {
                for (int i = 0; i < difference; i++) {
                    summand2 = "0" + summand2;
                }
            }
        }

        String result = "";
        int temp = 0;
        for (int i = summand1.length() - 1; i >= 0; i--) {
            int sum = 0;
            sum = Integer.parseInt(summand1.substring(i, i+1)) + Integer.parseInt(summand2.substring(i, i+1)) + temp;
            temp = sum / 10;
            sum = sum % 10;
            result = sum + result;

        }
        System.out.println(summand1 + " + " + summand2 + " = " + result);

    }
}



