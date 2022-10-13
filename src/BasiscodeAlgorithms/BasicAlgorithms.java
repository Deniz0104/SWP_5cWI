package BasiscodeAlgorithms;

import java.sql.PreparedStatement;

public class BasicAlgorithms {
    public static void main(String[] args) {
        int[] integerArray = new int[]{6, 5, 333414, 55, 23, 7, 22};

        // revert Method + Output
        int[] array1 = revert(integerArray);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // biggest Integer Method + Output
        int largestNumber = max(integerArray);
        System.out.println(largestNumber);

        // smallest Integer Method + Output
        int smallestNumber = min(integerArray);
        System.out.println(smallestNumber);

    }

    public static int[] revert(int[] data) {
        int[] array = new int[data.length];

        int temp = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            array[temp] = data[i];
            temp++;
        }
        return array;
    }

    public static int max(int[] data) {
        int firstIntegerOfArray = data[0];
        for (int i = 1; i < data.length; i++) {
            if (firstIntegerOfArray < data[i]) {
                firstIntegerOfArray = data[i];
            }

        }
        return firstIntegerOfArray;
    }

    public static int min(int[] data) {
        int firstIntegerOfArray2 = data[0];
        for (int i = 0; i < data.length ; i++) {
            if (firstIntegerOfArray2 > data[i]) {
                firstIntegerOfArray2 = data[i];
            }
        }
        return firstIntegerOfArray2;
    }




}
