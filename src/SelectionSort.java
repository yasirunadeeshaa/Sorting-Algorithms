public class SelectionSort {
   public static void sort(int[] values){
       int lastUnsortedIndex = values.length - 1;
       while(0<lastUnsortedIndex){
           int maxIndex = 0;
           int maxValue = values[0];
           for(int i=1;i<=lastUnsortedIndex;i++){
               if(values[i]>maxValue){
                   maxValue=values[i];
                   maxIndex= i;
               }
           }
           values[maxIndex] = values[lastUnsortedIndex];
           values[lastUnsortedIndex] = maxValue;
           lastUnsortedIndex--;
       }
   }
//    Best Case (Already Sorted): O(n²)
//    Worst Case (Reverse Sorted): O(n²)
//    Average Case: O(n²)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop over the array to find the minimum element in each iteration
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the smallest

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
//    Best, Worst, and Average Case Complexity: O(n²)

}
