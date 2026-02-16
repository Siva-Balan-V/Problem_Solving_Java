# Numbers Programs

This directory contains programs for basic mathematical operations and number theory concepts.

## Programs

### 1. Arithmetic_operators.java
**Description:** Performs basic arithmetic operations on two numbers.

**Logic:**
- Takes two numbers as input
- Performs addition, subtraction, multiplication, and division
- Displays results of all operations

**Sample Input/Output:**
```
Input: 
Enter First Number : 10
Enter Second Number : 5
Output:
Addition : 15
Subtraction : 5
Multiplication : 50
Division : 2
```

---

### 2. Ascending_Descending.java
**Description:** Sorts an array in both ascending and descending order.

**Logic:**
- Takes array size and elements as input
- Uses bubble sort for ascending order
- Reverses iteration for descending order

**Sample Input/Output:**
```
Input: 
Enter the Size of the Array : 5
Enter the Elements : 5 2 8 1 9
Output:
Ascending Order : 1 2 5 8 9
Descending Order : 9 8 5 2 1
```

---

### 3. Circle_area.java
**Description:** Calculates the area of a circle.

**Logic:**
- Takes radius as input
- Uses formula: Area = π × r²
- Uses Math.PI for π value

**Sample Input/Output:**
```
Input: Enter radius : 7
Output: Area of Circle : 153.93804002589985
```

---

### 4. Factorial.java
**Description:** Calculates the factorial of a number.

**Logic:**
- Takes a whole number as input
- Handles special cases: negative (error), zero (1)
- Uses loop to multiply all numbers from 1 to n
- Formula: n! = n × (n-1) × (n-2) × ... × 1

**Sample Input/Output:**
```
Input: Enter a Whole Number : 5
Output: Factorial : 120

Input: Enter a Whole Number : 0
Output: Factorial : 1

Input: Enter a Whole Number : -3
Output: Enter a Whole Number !!!
```

---

### 5. Fibonacci.java
**Description:** Generates the Fibonacci sequence up to n terms.

**Logic:**
- Takes number of terms as input
- Initializes first two terms as 0 and 1
- Each subsequent term is sum of previous two terms
- Formula: F(n) = F(n-1) + F(n-2)

**Sample Input/Output:**
```
Input: Enter number of terms : 7
Output: Fibonacci Sequence : 0 1 1 2 3 5 8
```

---

### 6. Marks.java
**Description:** Calculates total and average of three subject marks.

**Logic:**
- Takes marks of three subjects as input
- Calculates total by adding all marks
- Calculates average by dividing total by 3

**Sample Input/Output:**
```
Input: 
Enter Mark 1 : 85
Enter Mark 2 : 90
Enter Mark 3 : 78
Output:
Total : 253
Average : 84.33
```

---

### 7. Number_Palindrome.java
**Description:** Checks if a number is a palindrome (reads same forwards and backwards).

**Logic:**
- Takes a number as input
- Reverses the number using modulo and division operations
- Extracts last digit using n % 10
- Compares reversed number with original

**Sample Input/Output:**
```
Input: Enter a Number : 121
Output: 121 is a Palindrome.

Input: Enter a Number : 123
Output: 123 is not a Palindrome.
```

---

### 8. Prime_check.java
**Description:** Checks if a number is prime.

**Logic:**
- Takes a number as input
- Checks if number is divisible by any number from 2 to n-1
- If divisible by any number, it's not prime
- Prime numbers are only divisible by 1 and themselves

**Sample Input/Output:**
```
Input: Enter a Number : 7
Output: 7 is a Prime Number.

Input: Enter a Number : 10
Output: 10 is not a Prime Number.
```

---

### 9. Sum_of_digits.java
**Description:** Calculates the sum of all digits in a number.

**Logic:**
- Takes a number as input
- Uses modulo (%) to extract last digit
- Adds digit to sum
- Divides number by 10 to remove last digit
- Repeats until number becomes 0

**Sample Input/Output:**
```
Input: Enter a Number : 1234
Output: Sum of Digits : 10
(1 + 2 + 3 + 4 = 10)
```

---

### 10. Temperature.java
**Description:** Converts temperature from Celsius to Fahrenheit.

**Logic:**
- Takes temperature in Celsius as input
- Uses formula: F = (9/5) × C + 32
- Displays temperature in Fahrenheit

**Sample Input/Output:**
```
Input: Enter Temperature in Celsius : 25
Output: Temperature in Fahrenheit : 77.0
```

---

### 11. number_checker.java
**Description:** Checks if a number is positive, negative, or zero.

**Logic:**
- Takes a number as input
- Uses conditional statements to check:
  - If number > 0: Positive
  - If number < 0: Negative
  - If number == 0: Zero

**Sample Input/Output:**
```
Input: Enter a Number : 5
Output: 5 is Positive.

Input: Enter a Number : -3
Output: -3 is Negative.

Input: Enter a Number : 0
Output: Number is Zero.
```

---

## Subdirectory
- **Intermediate/** - Contains advanced number classification programs (Armstrong, Perfect, Strong, Automorphic, Harshad, Duck, Neon, Kaprekar, Magic numbers, and HCF)
