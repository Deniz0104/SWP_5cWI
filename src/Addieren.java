import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Addieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summand1 = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        while (summand1 > 0) {
            list.push( summand1 % 10 );
            summand1 = summand1 / 10;
        }

        while (!list.isEmpty()) {
            System.out.print(list.pop() + " ");
        }


    }
}
