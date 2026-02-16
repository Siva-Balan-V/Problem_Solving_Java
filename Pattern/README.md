# Pattern Programs

This directory contains programs that create various ASCII art patterns using loops and string operations.

## Programs

### 1. Alphabet_Triangle.java
**Description:** Creates a triangle pattern using alphabets.

**Logic:**
- Uses nested loops: outer loop for rows, inner loop for characters
- Prints characters from A to Z cyclically
- Each row has increasing number of characters

**Sample Input/Output:**
```
Input: Enter number of rows : 4
Output:
A
A B
A B C
A B C D
```

---

### 2. Binary_Triangle.java
**Description:** Creates a triangle pattern alternating between 1 and 0.

**Logic:**
- Uses a loop to iterate through rows
- Alternates between prepending "1" and "0" to the string
- Each row shows the pattern built so far

**Sample Input/Output:**
```
Input: Enter number of rows : 5
Output:
1
01
101
0101
10101
```

---

### 3. Butterfly_Pattern.java
**Description:** Creates a butterfly shape using asterisks.

**Logic:**
- Upper half: increasing stars with decreasing middle spaces
- Lower half: mirror of upper half (decreasing stars with increasing spaces)
- Uses nested loops for stars, spaces, and symmetry

**Sample Input/Output:**
```
Input: Enter number of rows : 5
Output:
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
```

---

### 4. Hollow_Diamond.java
**Description:** Creates a hollow diamond shape.

**Logic:**
- Upper triangle: increasing width with spaces inside
- Lower triangle: decreasing width with spaces inside
- Only prints borders, leaving interior hollow
- Uses spaces for indentation and alignment

**Sample Input/Output:**
```
Input: Enter the character : *
Enter number of rows : 5
Output:
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
```

---

### 5. Hollow_Pyramid.java
**Description:** Creates a hollow pyramid shape.

**Logic:**
- First loop prints leading spaces for centering
- Prints asterisks only at edges and bottom row
- Interior remains hollow (filled with spaces)
- Bottom row is completely filled

**Sample Input/Output:**
```
Input: Enter number of rows : 5
Output:
    *
   * *
  *   *
 *     *
*********
```

---

### 6. Hollow_Square.java
**Description:** Creates a hollow square shape.

**Logic:**
- Prints top border (all characters)
- Prints middle rows (only edges, hollow interior)
- Prints bottom border (all characters)
- Interior spaces maintain square shape

**Sample Input/Output:**
```
Input: Enter no of characters : 5
Output:
*****
*   *
*   *
*   *
*****
```

---

### 7. Hourglass_Pattern.java
**Description:** Creates an hourglass shape.

**Logic:**
- Upper half: decreasing width with increasing left indent
- Narrowest point in the middle (single character)
- Lower half: increasing width with decreasing left indent
- Mirror symmetry around middle row

**Sample Input/Output:**
```
Input: Enter number of rows : 5
Output:
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
```

---

### 8. Left_Pascal_Triangle.java
**Description:** Creates a Pascal's triangle aligned to the left.

**Logic:**
- Upper half: rows with increasing number of stars
- Peak row: maximum stars
- Lower half: rows with decreasing number of stars
- Creates a diamond/rhombus shape on the left side

**Sample Input/Output:**
```
Input: Enter number of rows : 5
Output:
*
**
***
****
*****
****
***
**
*
```

---

### 9. Right_Pascal_Triangle.java
**Description:** Creates a Pascal's triangle aligned to the right.

**Logic:**
- Upper half: increasing stars with decreasing leading spaces
- Peak row: maximum stars with no leading spaces
- Lower half: decreasing stars with increasing leading spaces
- Creates a diamond/rhombus shape on the right side

**Sample Input/Output:**
```
Input: Enter number of rows : 5
Output:
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
```

---

## Key Concepts Used
- **Nested Loops:** Outer loop for rows, inner loops for spaces and characters
- **Pattern Recognition:** Understanding symmetry and repetition
- **String Building:** Constructing patterns character by character
- **Mathematical Relations:** Calculating spaces and characters based on row number
- **Indentation:** Using spaces to align patterns properly
