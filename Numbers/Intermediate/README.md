# Intermediate Number Programs

This directory contains advanced programs for special number classifications and properties.

## Programs

### 1. Armstrong_01.java
**Description:** Checks if a number is an Armstrong number (also called Narcissistic number).

**Logic:**
- An Armstrong number is equal to the sum of its digits raised to the power of number of digits
- Counts the number of digits in the number
- Raises each digit to the power of digit count
- Sums all the powered digits
- Compares sum with original number
- Formula: For n digits, if abcd = a^n + b^n + c^n + d^n, then it's an Armstrong number

**Sample Input/Output:**
```
Input: Enter a Number : 153
Output: 153 is a Armstrong number.
(1³ + 5³ + 3³ = 1 + 125 + 27 = 153)

Input: Enter a Number : 9474
Output: 9474 is a Armstrong number.
(9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474)

Input: Enter a Number : 123
Output: 123 is not a Armstrong number.
```

---

### 2. Perfect_number_02.java
**Description:** Checks if a number is a Perfect number.

**Logic:**
- A Perfect number equals the sum of its proper divisors (excluding itself)
- Finds all divisors from 1 to n-1
- Adds all divisors to a sum
- Compares sum with original number

**Sample Input/Output:**
```
Input: Enter a Number : 6
Output: 6 is a Perfect Number.
(Divisors: 1, 2, 3; Sum = 1 + 2 + 3 = 6)

Input: Enter a Number : 28
Output: 28 is a Perfect Number.
(Divisors: 1, 2, 4, 7, 14; Sum = 1 + 2 + 4 + 7 + 14 = 28)

Input: Enter a Number : 10
Output: 10 is not a Perfect Number.
```

---

### 3. Strong_number_03.java
**Description:** Checks if a number is a Strong number.

**Logic:**
- A Strong number equals the sum of factorials of its digits
- Extracts each digit from the number
- Calculates factorial of each digit
- Sums all factorials
- Compares sum with original number
- Formula: If 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145, then it's a Strong number

**Sample Input/Output:**
```
Input: Enter a Number : 145
Output: 145 is a Strong Number.
(1! + 4! + 5! = 1 + 24 + 120 = 145)

Input: Enter a Number : 2
Output: 2 is a Strong Number.
(2! = 2)

Input: Enter a Number : 123
Output: 123 is not a Strong Number.
```

---

### 4. Automorphic_number_04.java
**Description:** Checks if a number is an Automorphic number.

**Logic:**
- An Automorphic number's square ends with the number itself
- Squares the input number
- Extracts the last n digits from square (where n = length of original)
- Compares extracted digits with original number

**Sample Input/Output:**
```
Input: Enter a Number : 5
Output: 5 is an Automorphic Number.
(5² = 25, ends with 5)

Input: Enter a Number : 25
Output: 25 is an Automorphic Number.
(25² = 625, ends with 25)

Input: Enter a Number : 76
Output: 76 is an Automorphic Number.
(76² = 5776, ends with 76)

Input: Enter a Number : 10
Output: 10 is not an Automorphic Number.
```

---

### 5. Harshad_number_05.java
**Description:** Checks if a number is a Harshad number (also called Niven number).

**Logic:**
- A Harshad number is divisible by the sum of its digits
- Calculates sum of all digits
- Checks if number is divisible by digit sum
- Formula: If n % (sum of digits) == 0, then it's a Harshad number

**Sample Input/Output:**
```
Input: Enter a Number : 18
Output: 18 is a Harshad Number.
(Sum of digits = 1 + 8 = 9; 18 % 9 = 0)

Input: Enter a Number : 21
Output: 21 is a Harshad Number.
(Sum of digits = 2 + 1 = 3; 21 % 3 = 0)

Input: Enter a Number : 19
Output: 19 is not a Harshad Number.
```

---

### 6. Duck_number_06.java
**Description:** Checks if a number is a Duck number.

**Logic:**
- A Duck number contains at least one zero, but not at the beginning
- Iterates through all digits of the number
- Checks if any digit equals 0
- Returns true if zero is found (and number doesn't start with 0)

**Sample Input/Output:**
```
Input: Enter a Number : 402
Output: 402 is a Duck Number.

Input: Enter a Number : 1050
Output: 1050 is a Duck Number.

Input: Enter a Number : 123
Output: 123 is not a Duck Number.

Input: Enter a Number : 024
Output: Not a Duck Number (leading zero not allowed)
```

---

### 7. Neon_number_07.java
**Description:** Checks if a number is a Neon number.

**Logic:**
- A Neon number's square's digit sum equals the number itself
- Squares the input number
- Calculates sum of digits of the square
- Compares digit sum with original number

**Sample Input/Output:**
```
Input: Enter a Number : 9
Output: 9 is a Neon Number.
(9² = 81; 8 + 1 = 9)

Input: Enter a Number : 1
Output: 1 is a Neon Number.
(1² = 1; digit sum = 1)

Input: Enter a Number : 5
Output: 5 is not a Neon Number.
```

---

### 8. Kaprekar_number_08.java
**Description:** Checks if a number is a Kaprekar number.

**Logic:**
- A Kaprekar number's square can be split into two parts that sum to the original
- Squares the input number
- Tries splitting square at different positions
- Checks if sum of parts equals original number
- Formula: If 45² = 2025 and 20 + 25 = 45, then 45 is a Kaprekar number

**Sample Input/Output:**
```
Input: Enter a Number : 9
Output: 9 is a Kaprekar Number.
(9² = 81; 8 + 1 = 9)

Input: Enter a Number : 45
Output: 45 is a Kaprekar Number.
(45² = 2025; 20 + 25 = 45)

Input: Enter a Number : 297
Output: 297 is a Kaprekar Number.
(297² = 88209; 88 + 209 = 297)

Input: Enter a Number : 10
Output: 10 is not a Kaprekar Number.
```

---

### 9. Magic_number_09.java
**Description:** Checks if a number is a Magic number.

**Logic:**
- A Magic number's recursive digit sum equals 1
- Repeatedly sums digits until a single digit remains
- Checks if final single digit equals 1
- Example: 1234 → 1+2+3+4=10 → 1+0=1 (Magic!)

**Sample Input/Output:**
```
Input: Enter a Number : 1
Output: 1 is a Magic Number.

Input: Enter a Number : 10
Output: 10 is a Magic Number.
(1 + 0 = 1)

Input: Enter a Number : 1234
Output: 1234 is a Magic Number.
(1+2+3+4=10; 1+0=1)

Input: Enter a Number : 123
Output: 123 is not a Magic Number.
(1+2+3=6; not 1)
```

---

### 10. HCF_10.java
**Description:** Finds the Highest Common Factor (HCF) or Greatest Common Divisor (GCD) of two numbers.

**Logic:**
- Takes two numbers as input
- Finds the smaller of the two numbers
- Loops from the smaller number down to 1
- Finds the first number that divides both inputs evenly
- That number is the HCF

**Sample Input/Output:**
```
Input: 
Enter First Number : 24
Enter Second Number : 36
Output: HCF of 24 and 36 : 12

Input: 
Enter First Number : 15
Enter Second Number : 25
Output: HCF of 15 and 25 : 5

Input: 
Enter First Number : 7
Enter Second Number : 13
Output: HCF of 7 and 13 : 1
```
