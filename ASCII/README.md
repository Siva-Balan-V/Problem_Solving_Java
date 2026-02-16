# ASCII Programs

This directory contains programs that work with ASCII values and character encoding operations.

## Programs

### 1. ASCII_Sum.java
**Description:** Calculates the sum of ASCII values of all characters in a given string.

**Logic:** 
- Takes a string as input
- Iterates through each character in the string
- Converts each character to its ASCII value using type casting `(int)`
- Accumulates the sum of all ASCII values

**Sample Input/Output:**
```
Input: Enter a String : Hello
Output: Sum of ASCII Values of Characters in given String : 500
```

---

### 2. ASCII_value (Directory with ASCII_value.java)
**Description:** Prints the ASCII value of a given character.

**Logic:**
- Takes a single character as input
- Converts the character to integer using type casting `(int)`
- Returns the ASCII value

**Sample Input/Output:**
```
Input: Enter a Character : A
Output: ASCII Value of 'A' : 65
```

---

### 3. A_to_Z_a_to_z.java
**Description:** Displays ASCII values of all alphabetic characters (A-Z and a-z).

**Logic:**
- Uses a loop to iterate through uppercase letters (A-Z)
- Uses another loop to iterate through lowercase letters (a-z)
- Casts each character to int to display its ASCII value

**Sample Input/Output:**
```
Output: 
A : 65
B : 66
...
Z : 90
a : 97
b : 98
...
z : 122
```

---

### 4. Char_value.java
**Description:** Converts an ASCII value to its corresponding character.

**Logic:**
- Takes an integer (ASCII value) as input
- Casts the integer to char type
- Displays the corresponding character

**Sample Input/Output:**
```
Input: Enter ASCII Value : 65
Output: Character : A
```

---

### 5. String_ASCII_value.java
**Description:** Displays the ASCII value of each character in a string.

**Logic:**
- Takes a string as input
- Iterates through each character
- Prints each character along with its ASCII value

**Sample Input/Output:**
```
Input: Enter a String : Java
Output:
J : 74
a : 97
v : 118
a : 97
```

---

### 6. Ucase_Lcase_chk.java
**Description:** Checks whether a given character is uppercase, lowercase, or neither.

**Logic:**
- Takes a character as input
- Uses ASCII value ranges to determine:
  - Uppercase: 65-90 (A-Z)
  - Lowercase: 97-122 (a-z)
- Prints the result

**Sample Input/Output:**
```
Input: Enter a Character : A
Output: 'A' is an Uppercase letter.

Input: Enter a Character : b
Output: 'b' is a Lowercase letter.

Input: Enter a Character : 5
Output: '5' is neither Uppercase nor Lowercase.
```
