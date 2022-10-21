package Sortierverfahren;

public class sort {
    public static void main(String[] args) {
        int[] integerArray = new int[]{6, 5, 3334, 55, 23, 7, 22};
        System.out.println("Array to sort:");
        printArray(integerArray);

        // selectedSort + Output
        int[] array1 = selectedSort(integerArray, "Descending");
        printArray(array1);

        // bubbleSort + Output
        System.out.println("Bubble Sort: ");
        int[] array2 = bubbleSort(integerArray);
        printArray(array2);
    }

    public static int[] selectedSort(int[] data, String sortingType) {
        switch (sortingType) {
            case "Descending":
                System.out.println("Descending Selected Sort:");
                for (int i = 0; i < data.length; i++) {
                    for (int j = i; j < data.length; j++) {
                        if (data[i] < data[j]) {
                            int temp = data[j];
                            data[j] = data[i];
                            data[i] = temp;
                        }
                    }
                }
                break;
            case "Ascending":
                System.out.println("Ascending Selected Sort:");
                for (int i = 0; i < data.length; i++) {
                    for (int j = i; j < data.length; j++) {
                        if (data[i] > data[j]) {
                            int temp = data[j];
                            data[j] = data[i];
                            data[i] = temp;
                        }
                    }
                }
            default:
                break;
        }
        return data;
    }

    public static int[] bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                int temp = data[i + 1];
                data[i + 1] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

    public static void printArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length - 1; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println(data[data.length - 1] + "]");

    }


}
