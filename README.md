# Problem Solving Java 

Welcome to **Problem_Solving_Java** - A comprehensive collection of Java programming solutions covering fundamental to intermediate level problems. This repository is designed to help programmers learn and practice Java through hands-on problem-solving.

[![Java](https://img.shields.io/badge/Java-Programming-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Contributions Welcome](https://img.shields.io/badge/Contributions-Welcome-brightgreen.svg)](#contributing)

##  Table of Contents

- [About](#about)
- [Repository Structure](#repository-structure)
- [Problem Categories](#problem-categories)
  - [Numbers](#numbers)
  - [Arrays](#arrays)
  - [Strings](#strings)
  - [Pattern](#pattern)
- [Getting Started](#getting-started)
- [How to Run](#how-to-run)
- [Prerequisites](#prerequisites)
- [Contributing](#contributing)
- [Author](#author)

##  About

This repository contains well-structured Java solutions to various programming problems. Each solution is implemented with clear logic and follows Java best practices. The problems are organized into different categories to make learning systematic and progressive.

**Key Features:**
- ✅ Clean and readable code
- ✅ Organized by problem categories
- ✅ Interactive console-based programs
- ✅ Beginner to intermediate level problems
- ✅ Scanner-based user input handling
- ✅ 44+ problem solutions across 4 categories

##  Repository Structure

```
Problem_Solving_Java/
│
├── Numbers/              # Numerical computation problems (22 problems)
│   ├── Intermediate/     # Advanced number problems (10 problems)
│   └── [Basic Problems]  # Fundamental number operations (12 problems)
│
├── Array/                # Array manipulation problems (11 problems)
│
├── Strings/              # String processing problems (11 problems)
│
└── Pattern/              # Pattern printing programs (1 problem)
```

##  Problem Categories

### Numbers

This section contains problems related to numerical computations and mathematical operations.

#### Basic Level (12 Problems):
1. **Arithmetic_operators.java** - Implementation of basic arithmetic operations
2. **Circle_area.java** - Calculate the area of a circle
3. **Factorial.java** - Compute factorial of a number
4. **Fibonacci.java** - Generate Fibonacci series
5. **Prime_check.java** - Check if a number is prime
6. **Number_Palindrome.java** - Check if a number is a palindrome
7. **Sum_of_digits.java** - Calculate sum of digits in a number
8. **Temperature.java** - Temperature conversion utilities
9. **Marks.java** - Process and analyze marks
10. **number_checker.java** - Various number validation checks
11. **Ascending_Descending.java** - Sort numbers in ascending/descending order

#### Intermediate Level (10 Problems):
1. **Armstrong_01.java** - Check Armstrong numbers
2. **Perfect_number_02.java** - Check if a number is a perfect number
3. **Strong_number_03.java** - Verify strong numbers (sum of factorials equals the number)
4. **Automorphic_number_04.java** - Check automorphic numbers
5. **Harshad_number_05.java** - Identify Harshad (Niven) numbers
6. **Duck_number_06.java** - Check for duck numbers (zeros present but not at beginning)
7. **Neon_number_07.java** - Verify neon numbers
8. **Kaprekar_number_08.java** - Check Kaprekar numbers
9. **Magic_number_09.java** - Identify magic numbers
10. **HCF_10.java** - Calculate Highest Common Factor (GCD)

### Arrays

This section focuses on array operations and manipulations.

1. **Largest_element_01.java** - Find the largest element in an array
2. **Smallest_element_02.java** - Find the smallest element in an array
3. **Sum_of_Array_03.java** - Calculate the sum of all array elements
4. **Reverse_array_04.java** - Reverse an array
5. **Even_Odd_Count_Array_05.java** - Count even and odd elements in an array
6. **Second_Largest_Element_06.java** - Find the second largest element
7. **Ascending_Array_07.java** - Sort array in ascending order
8. **Duplicate_array_08.java** - Find duplicate elements in an array
9. **Merge_array_09.java** - Merge two arrays
10. **Left_rotate_10.java** - Rotate array elements to the left
11. **Arr.java** - General array operations

### Strings

This section covers string manipulation and processing problems.

1. **Palindrome.java** - Check if a string is a palindrome
2. **Length.java** - Calculate string length
3. **Vowel_or_Consonant.java** - Check if a character is vowel or consonant
4. **Alphabet_count.java** - Count alphabets in a string
5. **Character_function.java** - Various character operations
6. **Anagram.java** - Check if two strings are anagrams
7. **Frequent_char.java** - Find the most frequent character in a string
8. **Remove_duplicate.java** - Remove duplicate characters from a string
9. **Swap.java** - Swap strings without using a temporary variable
10. **Ucase_Lcase.java** - Convert between uppercase and lowercase
11. **Word_Count.java** - Count words in a string

### Pattern

This section contains pattern printing problems.

1. **Hollow_Square.java** - Print a hollow square pattern

##  Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:
- **Java Development Kit (JDK)** - Version 8 or higher
- **IDE** (Optional but recommended):
  - Eclipse
  - IntelliJ IDEA
  - VS Code with Java Extension Pack
  - NetBeans

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Siva-Balan-V/Problem_Solving_Java.git
   ```

2. **Navigate to the repository:**
   ```bash
   cd Problem_Solving_Java
   ```

3. **Choose a problem category:**
   ```bash
   cd Numbers    # or Array, or Strings, or Pattern
   ```

##  How to Run

### Method 1: Using Command Line

1. **Compile the Java file:**
   ```bash
   javac -d . FileName.java
   ```

2. **Run the compiled program:**
   ```bash
   java PST.FileName
   ```

**Example:**
```bash
# Navigate to the Numbers directory
cd Numbers

# Compile the Fibonacci program
javac -d . Fibonacci.java

# Run the program
java PST.Fibonacci
```

### Method 2: Using an IDE

1. **Import the project** into your preferred IDE
2. **Navigate** to the desired Java file
3. **Run** the file directly using the IDE's run button
4. **Enter input** when prompted in the console

### Sample Execution

```
Enter a Whole number :
5
0,1,1,2,3,
```

##  Code Structure

All programs follow a consistent structure:
- **Package declaration:** `package PST;`
- **Imports:** Required Java utilities (mainly `java.util.Scanner`)
- **Main class:** Descriptive class names
- **User interaction:** Scanner-based input
- **Logic implementation:** Clear and well-commented code
- **Output:** Console-based results

##  Contributing

Contributions are always welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a new branch (`git checkout -b feature/AmazingFeature`)
3. **Add** your solution with proper naming convention
4. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
5. **Push** to the branch (`git push origin feature/AmazingFeature`)
6. **Open** a Pull Request

### Contribution Guidelines:
- Follow the existing code structure and naming conventions
- Ensure your code is well-commented
- Use meaningful variable names
- Test your code before submitting
- Add your problem to the appropriate category
- Update this README if adding new categories

## License

This project is open source and available for educational purposes.

##  Author

**Siva Balan V**

- GitHub: [@Siva-Balan-V](https://github.com/Siva-Balan-V)
- Repository: [Problem_Solving_Java](https://github.com/Siva-Balan-V/Problem_Solving_Java)

##  Acknowledgments

- Thanks to all contributors who have helped improve this repository
- Inspired by the need for organized Java problem-solving resources
- Built for learners, by learners

## 📞 Contact & Support

If you have any questions or suggestions, feel free to:
- Open an issue in the repository
- Reach out through GitHub

---

### ⭐ Star this repository if you find it helpful!

**Happy Coding! 💻**
