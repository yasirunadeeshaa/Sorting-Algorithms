# Merge Sort

## Overview
Merge Sort is a **divide-and-conquer** sorting algorithm that efficiently sorts an array by repeatedly dividing it into smaller subarrays, sorting them, and merging them back together.

## How Merge Sort Works
### Example:
Given the array: `[91, 32, 92, 13, 73, 14, 64]`

1. **Divide**: Split the array into two halves.
2. **Recursively sort** each half.
3. **Merge** the sorted halves back together.

Example breakdown:
```
Split: [91, 32, 92, 13] | [73, 14, 64]
Split: [91, 32] | [92, 13] | [73, 14] | [64]
Sort:  [32, 91] | [13, 92] | [14, 73] | [64]
Merge: [13, 32, 91, 92] | [14, 64, 73]
Merge: [13, 14, 32, 64, 73, 91, 92]
```

## Merge Sort Implementation in Java
```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] array = {91, 32, 92, 13, 73, 14, 64};
        mergeSort(array, 0, array.length - 1);
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
| **Worst Case**  | O(n log n) |

## Optimizations
1. **Use Iterative Merge Sort** (Avoids recursion overhead).
2. **Hybrid approach**: Switch to Insertion Sort for small subarrays.

## Advantages & Disadvantages
### ✅ **Advantages:**
- Always O(n log n), making it predictable.
- Stable sorting algorithm (preserves relative order of equal elements).
- Works well for linked lists and external sorting (large files).

### ❌ **Disadvantages:**
- Requires **extra space** O(n) for merging.
- Slower for small datasets compared to QuickSort.
