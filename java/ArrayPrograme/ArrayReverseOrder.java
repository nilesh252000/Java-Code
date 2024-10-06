package ArrayPrograme;

import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        int size;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size");
            size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter " + size + " array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Array elements in reverse order:");
        
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            }
        }
    }


