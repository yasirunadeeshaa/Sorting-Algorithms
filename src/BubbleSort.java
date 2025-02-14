public class BubbleSort {
    public static void sort(int[] values){
//        int n = values.length;
//        for(int i =0;i<=n-1;i++){
//            int maxvalue=values[i];
//            int maxValueIndex = i;
//            for(int j=i+1;j<n-i;j++){
//                if(values[j]>maxvalue){
//                    maxValueIndex=j;
//                    maxvalue=values[j];
//                    int temp = values[j];
//                    values[j]=maxvalue;
//                    values[j-1]=temp;
//                }
//                else{
//                    int temp=values[j];
//                    values[j]=maxvalue;
//                    values[j-1]=temp;
//                }
//                for (int num : values) {
//                    System.out.print(num + " ");
//                }
//                System.out.println("-------------------------");
//            }
//            n--;
//        }
        int n = values.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Inner loop for pairwise comparison
            for (int j = 0; j < n - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    // Swap values[j] and values[j+1]
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    swapped = true; // Mark that swapping happened
                }
            }

            // If no swaps happened, the array is already sorted
            if (!swapped) break;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {91, 32, 92, 13, 73, 14};

        System.out.println("Original array:");
        printArray(array);

        // Sorting using Bubble Sort
        sort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

}
/* --------------------------------------------------------------------------------------
Time Complexity Analysis
        * Worst Case (Reverse Sorted Array)  → O(n²)
        * Best Case (Already Sorted Array)   → O(n) (Thanks to the swapped flag)
        * Average Case                       → O(n²)
 ------------------------------------------------------------------------------------------*/
