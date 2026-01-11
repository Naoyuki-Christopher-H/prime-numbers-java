# Prime Number Checker

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Usage](#usage)
  - [Prerequisites](#prerequisites)
  - [Running the Application](#running-the-application)
  - [Using the Application](#using-the-application)
- [Technical Implementation](#technical-implementation)
  - [Algorithms](#algorithms)
  - [Key Methods](#key-methods)
- [Code Quality Features](#code-quality-features)
- [Limitations](#limitations)
- [Repository](#repository)
- [Contributing](#contributing)
- [Disclaimer](#disclaimer)

## Overview

A Java application for checking whether a number is prime, 
supporting both regular integers and arbitrarily large numbers 
using BigInteger.

This project provides a console-based application that allows 
users to check if a number is prime. It efficiently handles 
both standard integer ranges and very large numbers through 
optimized algorithms and BigInteger support.

## Features

- **Dual Number Support**: Processes both standard integers and arbitrarily large numbers
- **Optimized Prime Checking**: Implements efficient algorithms including 6k±1 optimization
- **Robust Error Handling**: Gracefully handles invalid inputs and edge cases
- **Recursive Console Interface**: Continuous operation until explicit quit command
- **Large Number Support**: Utilizes Java's BigInteger class for numbers beyond standard integer limits

## Project Structure

```
Solution/
├── Solution.java         # Main application class with console interface
├── Math.java             # Utility class containing prime checking algorithms
└── README.md             # This documentation file
```

## Usage

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Basic command-line knowledge

### Running the Application

1. Compile the Java files:
   ```
   javac Solution/Solution.java Solution/Math.java
   ```

2. Run the application:
   ```
   java Solution.Solution
   ```

### Using the Application

Once running, the application will:
1. Display a welcome banner
2. Prompt for input with `> `
3. Accept either:
   - A number to check for primality
   - The word "quit" to exit the application

Example session:
```
=====================================
      Prime Number Checker  v1.0     
=====================================
Supports very large numbers!

Enter a number to check if it is prime
or type 'quit' to exit the application:
> 17
17 is prime

Enter a number to check if it is prime
or type 'quit' to exit the application:
> 100
100 is not prime

Enter a number to check if it is prime
or type 'quit' to exit the application:
> 170141183460469231731687303715884105727
170,141,183,460,469,231,731,687,303,715,884,105,727 is prime

Enter a number to check if it is prime
or type 'quit' to exit the application:
> quit
Thank you for using the Prime Checker. Goodbye!
```

## Technical Implementation

### Algorithms

1. **For Standard Integers**:
   - Early elimination of trivial cases (≤1, even numbers, multiples of 3)
   - 6k±1 optimization for checking divisors
   - Checks up to √n only

2. **For Large Numbers (BigInteger)**:
   - Initial probabilistic check with high certainty
   - Deterministic verification using similar optimizations
   - Efficient square root calculation for limit determination

### Key Methods

- `Math.isPrime(int number)`: Checks primality for integers
- `Math.isPrime(BigInteger number)`: Checks primality for large numbers
- `Solution.runPrimeChecker()`: Main application loop

## Code Quality Features

- **Immutable Utility Class**: Math class cannot be instantiated
- **Comprehensive Error Handling**: Catches NumberFormatException and general exceptions
- **Locale-Aware Input**: Case-insensitive quit command handling
- **Resource Management**: Proper Scanner closure
- **Clean Recursion**: Maintains application state without complex loops

## Limitations

- Negative numbers are treated as large numbers (BigInteger path)
- Very large prime checks may be computationally expensive
- Console-only interface (no GUI)

## Repository

The complete source code is available at:  
https://github.com/Naoyuki-Christopher-H/prime-numbers-java.git

## Contributing

If you encounter issues or have improvements to suggest, 
please submit a pull request or open an issue on the 
GitHub repository. Do not attempt to fix problems silently 
outside the project.

## DISCLAIMER

UNDER NO CIRCUMSTANCES SHOULD IMAGES OR EMOJIS BE INCLUDED DIRECTLY IN THE README FILE. 
ALL VISUAL MEDIA, INCLUDING SCREENSHOTS AND IMAGES OF THE APPLICATION, MUST BE STORED IN 
A DEDICATED FOLDER WITHIN THE PROJECT DIRECTORY. THIS FOLDER SHOULD BE CLEARLY STRUCTURED 
AND NAMED ACCORDINGLY TO INDICATE THAT IT CONTAINS ALL VISUAL CONTENT RELATED TO THE 
APPLICATION (FOR EXAMPLE, A FOLDER NAMED IMAGES, SCREENSHOTS, OR MEDIA).

I AM NOT LIABLE OR RESPONSIBLE FOR ANY MALFUNCTIONS, DEFECTS, OR ISSUES THAT MAY OCCUR AS 
A RESULT OF COPYING, MODIFYING, OR USING THIS SOFTWARE. IF YOU ENCOUNTER ANY PROBLEMS OR 
ERRORS, PLEASE DO NOT ATTEMPT TO FIX THEM SILENTLY OR OUTSIDE THE PROJECT. INSTEAD, KINDLY 
SUBMIT A PULL REQUEST OR OPEN AN ISSUE ON THE CORRESPONDING GITHUB REPOSITORY, SO THAT IT 
CAN BE ADDRESSED APPROPRIATELY BY THE MAINTAINERS OR CONTRIBUTORS.

---
