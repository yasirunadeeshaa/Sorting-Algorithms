# QuickSort

## Overview
QuickSort is a **divide-and-conquer** sorting algorithm that efficiently sorts an array by selecting a **pivot element** and partitioning the array into two halves:
1. **Left sub-array** (elements smaller than the pivot)
2. **Right sub-array** (elements greater than the pivot)

The process is recursively applied to the sub-arrays until the entire array is sorted.

## How QuickSort Works
### Example:
Given the array: `[91, 32, 92, 13, 73, 14, 64]`

1. **Choose a pivot** (e.g., `32`).
2. **Partition the array**:
- Move elements **smaller than 32** to the left.
- Move elements **greater than 32** to the right.
- Example after partitioning: `[13, 14, 32, 92, 73, 91, 64]`
3. **Recursively sort the left and right partitions**.
4. **Final sorted array**: `[13, 14, 32, 64, 73, 91, 92]`

## QuickSort Implementation in Java
```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int[] array = {91, 32, 92, 13, 73, 14, 64};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
```

## Time Complexity Analysis
| Case          | Complexity   |
|--------------|-------------|
| **Best Case**  | O(n log n) |
| **Average Case** | O(n log n) |
| **Worst Case**  | O(n²) (if the pivot is poorly chosen) |

## Optimizations
1. **Pivot Selection Strategies**:
- Random pivot
- Median of three (first, middle, last element)
2. **Use Insertion Sort for Small Arrays** (n < 10)

## Advantages & Disadvantages
### ✅ **Advantages:**
- Faster than Merge Sort in practice.
- In-place sorting (no extra memory needed).
- Efficient for large datasets.

### ❌ **Disadvantages:**
- Worst case O(n²) if pivot selection is bad.
- Not stable (equal elements may swap positions).
- Recursive (may cause stack overflow for large n).
