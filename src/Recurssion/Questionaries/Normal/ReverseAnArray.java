package Recurssion.Questionaries.Normal;

public class ReverseAnArray {
    static void reverseAnArray(int[] arr, int start, int end) {
        // base condition
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // recursive call
            reverseAnArray(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseAnArray(arr, 0, arr.length - 1);
        printArray(arr);
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
