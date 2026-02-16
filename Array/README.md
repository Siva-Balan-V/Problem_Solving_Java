# Array Programs

This directory contains programs for various array manipulation operations, from basic to intermediate level.

## Programs

### 1. Largest_element_01.java
**Description:** Finds the largest element in an array.

**Logic:**
- Takes array size as input
- Accepts array elements from user
- Initializes largest with first element
- Iterates through array comparing each element with current largest
- Updates largest when a bigger element is found

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements of Array : 12 45 23 67 34
Output: Largest element in array : 67
```

---

### 2. Smallest_element_02.java
**Description:** Finds the smallest element in an array.

**Logic:**
- Takes array size as input
- Accepts array elements from user
- Initializes smallest with first element
- Iterates through array comparing each element with current smallest
- Updates smallest when a smaller element is found

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements of Array : 12 45 23 67 34
Output: Smallest element in array : 12
```

---

### 3. Sum_of_Array_03.java
**Description:** Calculates the sum of all elements in an array.

**Logic:**
- Takes array size as input
- Accepts array elements from user
- Initializes sum to 0
- Iterates through array adding each element to sum

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements of Array : 10 20 30 40 50
Output: Sum of Array : 150
```

---

### 4. Reverse_array_04.java
**Description:** Reverses the order of elements in an array.

**Logic:**
- Takes array size and elements as input
- Uses two pointers approach: one at start, one at end
- Swaps elements from both ends moving toward center
- Continues until pointers meet in middle

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements of Array : 1 2 3 4 5
Output: Reversed Array : 5 4 3 2 1
```

---

### 5. Even_Odd_Count_Array_05.java
**Description:** Counts the number of even and odd elements in an array.

**Logic:**
- Takes array size and elements as input
- Initializes even and odd counters to 0
- Iterates through array checking each element
- Uses modulo operator (%) to check divisibility by 2
- Increments appropriate counter

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 6
Enter the Elements of Array : 1 2 3 4 5 6
Output: 
Even Count : 3
Odd Count : 3
```

---

### 6. Second_Largest_Element_06.java
**Description:** Finds the second largest element in an array.

**Logic:**
- Takes array size and elements as input
- Sorts the array in ascending order using bubble sort
- Returns the second-to-last element (arr[length-2])

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements of Array : 25 10 45 30 20
Output: Second Largest element : 30
```

---

### 7. Ascending_Array_07.java
**Description:** Sorts an array in ascending order.

**Logic:**
- Takes array size and elements as input
- Uses bubble sort algorithm
- Compares adjacent elements and swaps if left > right
- Repeats for n-1 passes where n is array size

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements of Array : 64 34 25 12 22
Output: Sorted Array (Ascending) : 12 22 25 34 64
```

---

### 8. Duplicate_array_08.java
**Description:** Finds and displays duplicate elements in an array.

**Logic:**
- Takes array size and elements as input
- Uses nested loop to compare each element with others
- Maintains a helper array to track already printed duplicates
- Prints each duplicate only once

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 7
Enter the Elements of Array : 1 2 3 2 4 3 5
Output: Duplicate elements : 2 3
```

---

### 9. Merge_array_09.java
**Description:** Merges two arrays into a single array.

**Logic:**
- Takes sizes and elements of two arrays as input
- Creates a new array of size (size1 + size2)
- Copies all elements from first array
- Appends all elements from second array

**Sample Input/Output:**
```
Input: 
Enter Size of Array 1 : 3
Enter Elements of Array 1 : 1 2 3
Enter Size of Array 2 : 2
Enter Elements of Array 2 : 4 5
Output: Merged Array : 1 2 3 4 5
```

---

### 10. Left_rotate_10.java
**Description:** Rotates array elements one position to the left.

**Logic:**
- Takes array size and elements as input
- Stores first element in temporary variable
- Shifts all elements one position to the left
- Places the stored first element at the end

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements of Array : 1 2 3 4 5
Output: Array after left rotation : 2 3 4 5 1
```

---

### 11. Arr.java
**Description:** Utility class containing helper methods for array operations.

**Functions:**
- `print(int[] arr)` - Prints array elements
- `input(int size)` - Takes array input with specified size
- `input()` - Takes array input (asks for size first)

**Note:** This class uses method overloading to provide multiple versions of the input method.
