public class MergeSort {
    // Merge (sorted) ranges values[first]...values[mid] and values[mid+1]...values[last]
    private static void mergeRanges(int[] values, int first, int mid, int last){
// Exercise!
    }
    // Auxiliary recursive function
// Sorts the range values[first]...values[last]
    private static void sortRange(int[] values, int first, int last){
        if(last > first){ // Otherwise there is nothing to do (single value)
            int mid = (first + last) / 2;
            sortRange(values, first, mid); // Recursively sort first half
            sortRange(values, mid + 1, last); // Recursively sort second half
            mergeRanges(values, first, mid, last); // Merge sorted halves
        }
    }
    public static void sort(int[] values){
        sortRange(values, 0, values.length - 1);
    }

}
