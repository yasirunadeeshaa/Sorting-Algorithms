# Sorting Algorithms - Lecture Notes

## Overview
Sorting is the process of arranging elements in a specific order, typically in ascending or descending order. It is an essential concept in computer science as it improves data searching, organization, and efficiency in processing.

## Sorting Problem Definition
Given an array of elements, sorting aims to reorder them in increasing or decreasing order.

### Example:
Unsorted array: `[91, 32, 92, 13, 73, 14]`
Sorted array (ascending order): `[13, 14, 32, 73, 91, 92]`

## Common Sorting Algorithms
Different sorting algorithms vary in efficiency and implementation. Below are some commonly used ones:

### 1. Selection Sort
- **Concept**: Finds the largest (or smallest) element in the unsorted section and moves it to the sorted section.
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Stable?**: No

### 2. Bubble Sort
- **Concept**: Repeatedly compares and swaps adjacent elements if they are in the wrong order.
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Stable?**: Yes

### 3. Merge Sort (Divide and Conquer)
- **Concept**:
    1. Divide the array into two halves.
    2. Recursively sort each half.
    3. Merge the sorted halves back together.
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Stable?**: Yes

### 4. QuickSort (Divide and Conquer)
- **Concept**:
    1. Choose a pivot.
    2. Partition elements into two sub-arrays (less than and greater than the pivot).
    3. Recursively apply QuickSort to sub-arrays.
- **Time Complexity**:
    - Best/Average: O(n log n)
    - Worst (bad pivot selection): O(n²)
- **Space Complexity**: O(log n)
- **Stable?**: No

## Sorting Performance Comparison
The table below compares the key properties of different sorting algorithms:

| Algorithm     | Best Case | Worst Case | Space Complexity | Stable? |
|--------------|-----------|------------|------------------|---------|
| Selection Sort | O(n²)    | O(n²)      | O(1)             | No      |
| Bubble Sort   | O(n)     | O(n²)      | O(1)             | Yes     |
| Merge Sort    | O(n log n) | O(n log n) | O(n)             | Yes     |
| QuickSort     | O(n log n) | O(n²)      | O(log n)         | No      |

## Choosing the Best Sorting Algorithm
- **For small datasets**: Selection Sort or Bubble Sort may be sufficient.
- **For large datasets**: Merge Sort or QuickSort is preferable.
- **If stability is required**: Merge Sort is a good choice.

