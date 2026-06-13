import java.util.Random;

public class Assingment {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] test = new int[10];
        for (int i = 0; i < test.length; i++) {
            test[i] = generator.nextInt(100);
        }

        System.out.println("Original array:");
        for (int num : test) {
            System.out.print(num + " ");
        }

        Quicksort(test);

        System.out.println("Sorted array:");
        for (int num : test) {
            System.out.print(num + " ");
        }
    }

    public static void Quicksort(int[] input, int upper, int lower){
        //Code Goes here
    }

    public static void Quicksort(int[] input) {
        Quicksort(input, input.length-1, 0);
    }
}