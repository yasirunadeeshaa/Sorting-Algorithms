//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);

        // Perform Selection Sort
//        SelectionSort.selectionSort(arr);
//        System.out.println("Sorted array:");
//        SelectionSort.printArray(arr);

        SelectionSort.sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}