# String Programs

This directory contains programs for various string manipulation and analysis operations.

## Programs

### 1. Alphabet_count.java
**Description:** Counts the number of alphabets, digits, symbols, and spaces in a string.

**Logic:**
- Takes a string as input
- Iterates through each character
- Uses ASCII value ranges to classify:
  - Alphabets: A-Z (65-90) or a-z (97-122)
  - Digits: 0-9 (48-57)
  - Space: ASCII value 32
  - Symbols: everything else
- Increments appropriate counters

**Sample Input/Output:**
```
Input: Enter a String : Hello World 123!
Output:
Alphabets : 10
Digits : 3
Spaces : 2
Symbols : 1
```

---

### 2. Anagram.java
**Description:** Checks if two strings are anagrams of each other.

**Logic:**
- Anagrams are words formed by rearranging letters of another word
- Checks if both strings have same length
- For each character in first string, replaces matching character in second string with '_'
- If all characters are matched (all become '_'), strings are anagrams

**Sample Input/Output:**
```
Input: 
Enter First String : listen
Enter Second String : silent
Output: listen and silent are Anagrams.

Input: 
Enter First String : hello
Enter Second String : world
Output: hello and world are not Anagrams.
```

---

### 3. Character_function.java
**Description:** Counts uppercase, lowercase, digits, and special characters in a string.

**Logic:**
- Takes a string as input
- Uses Character class methods:
  - `Character.isUpperCase()` for uppercase letters
  - `Character.isLowerCase()` for lowercase letters
  - `Character.isDigit()` for numeric digits
  - `Character.isWhitespace()` for spaces
- Everything else is counted as special characters

**Sample Input/Output:**
```
Input: Enter a String : Hello World 123!
Output:
Uppercase : 2
Lowercase : 8
Digits : 3
Spaces : 2
Special Characters : 1
```

---

### 4. Frequent_char.java
**Description:** Finds the most frequently occurring character in a string.

**Logic:**
- Takes a string as input
- Creates array to count occurrences of each unique character
- Iterates through string counting each character
- Tracks character with maximum count
- Displays the most frequent character and its count

**Sample Input/Output:**
```
Input: Enter a String : hello
Output: Most Frequent Character : 'l' appears 2 times

Input: Enter a String : programming
Output: Most Frequent Character : 'g' appears 2 times
```

---

### 5. Length.java
**Description:** Finds the length of a string without using the built-in `.length()` method.

**Logic:**
- Takes a string as input
- Uses a loop with `charAt(i)` method
- Continues until `IndexOutOfBoundsException` is thrown
- Catches exception and returns the count
- Alternative: manual character counting

**Sample Input/Output:**
```
Input: Enter a String : Hello
Output: Length of String : 5

Input: Enter a String : Java Programming
Output: Length of String : 16
```

---

### 6. Palindrome.java
**Description:** Checks if a string is a palindrome (reads same forwards and backwards).

**Logic:**
- Takes a string as input
- Converts to lowercase for case-insensitive comparison
- Reverses the string by iterating from end to beginning
- Compares reversed string with original
- If equal, it's a palindrome

**Sample Input/Output:**
```
Input: Enter a String : madam
Output: madam is a Palindrome.

Input: Enter a String : racecar
Output: racecar is a Palindrome.

Input: Enter a String : hello
Output: hello is not a Palindrome.
```

---

### 7. Remove_duplicate.java
**Description:** Removes duplicate characters from a string.

**Logic:**
- Takes a string as input
- Creates a new empty string for result
- Iterates through original string
- For each character, checks if it's already in result string
- Adds character to result only if it's not already present

**Sample Input/Output:**
```
Input: Enter a String : programming
Output: String after removing duplicates : progamin

Input: Enter a String : hello
Output: String after removing duplicates : helo
```

---

### 8. Swap.java
**Description:** Swaps the first and last characters of a string.

**Logic:**
- Takes a string as input
- Extracts first character using `charAt(0)`
- Extracts last character using `charAt(length-1)`
- Builds new string: last char + middle chars + first char
- Uses `substring()` for middle portion

**Sample Input/Output:**
```
Input: Enter a String : Hello
Output: String after swapping : oellH

Input: Enter a String : Java
Output: String after swapping : aavJ
```

---

### 9. Ucase_Lcase.java
**Description:** Converts a string to uppercase and lowercase.

**Logic:**
- Takes a string as input
- Uses built-in `.toUpperCase()` method for uppercase conversion
- Uses built-in `.toLowerCase()` method for lowercase conversion
- Displays both conversions

**Sample Input/Output:**
```
Input: Enter a String : Hello World
Output:
Uppercase : HELLO WORLD
Lowercase : hello world
```

---

### 10. Vowel_or_Consonant.java
**Description:** Checks if a given character is a vowel or consonant.

**Logic:**
- Takes a single character as input
- Checks if character is present in vowel string "aeiouAEIOU"
- Uses `.contains()` method or multiple `.equals()` comparisons
- If vowel found, prints "Vowel", else prints "Consonant"

**Sample Input/Output:**
```
Input: Enter a Character : a
Output: 'a' is a Vowel.

Input: Enter a Character : b
Output: 'b' is a Consonant.

Input: Enter a Character : E
Output: 'E' is a Vowel.
```

---

### 11. Word_Count.java
**Description:** Counts the number of words in a string.

**Logic:**
- Takes a string as input
- Uses `.split(" ")` method to split string by spaces
- Returns the length of resulting array
- Each array element represents one word

**Sample Input/Output:**
```
Input: Enter a String : Hello World
Output: Number of Words : 2

Input: Enter a String : Java is a programming language
Output: Number of Words : 5
```

---

## Key Concepts Used
- **String Traversal:** Iterating through characters using loops
- **Character Methods:** Using Character class for classification
- **String Methods:** Built-in methods like `charAt()`, `substring()`, `split()`
- **ASCII Values:** Using character codes for classification
- **String Building:** Constructing new strings from characters
- **Comparison:** Checking equality and pattern matching
