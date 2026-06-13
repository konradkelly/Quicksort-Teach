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
        if (input == null || input.length < 2) return;
        if (lower >= upper) return;

        int pivot = input[upper];
        int left = lower;
        int right = upper - 1;

        while (left < right) {
            while (input[left] < pivot && left < upper) {
                left++;
            }

            while (input[right] > pivot && right > lower) {
                right--;
            }

        if (left < right) {
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
            }
        }
        int temp = input[left];
        input[left] = input[upper];
        input[upper] = temp;
        
        Quicksort(input, left - 1, lower);
        Quicksort(input, upper, left + 1);
    }

    public static void Quicksort(int[] input) {
        //Change this based on how you choose your pivot
        Quicksort(input, input.length - 1, 0);
    }
}