#java String Methods: A Complete Guide

**Objective:** This guide explains the most important string methods injava, including practical examples and exercises to help you master string manipulation.

---

## Table of Contents

1. [What is a String injava?](#1-what-is-a-string-in-java)
2. [Creating Strings](#2-creating-strings)
3. [Key String Methods](#3-key-string-methods)
    - [length()](#length)
    - [charAt(int index)](#charatint-index)
    - [substring(int beginIndex, int endIndex)](#substringint-beginindex-int-endindex)
    - [indexOf(String s) / lastIndexOf(String s)](#indexofstring-s--lastindexofstring-s)
    - [toLowerCase() / toUpperCase()](#tolowercase--touppercase)
    - [equals(String s) / equalsIgnoreCase(String s)](#equalsstring-s--equalsignorecasestring-s)
    - [trim()](#trim)
    - [replace(String oldChar, String newChar)](#replacestring-oldchar-string-newchar)
    - [split(String regex)](#splitstring-regex)
    - [contains(CharSequence s)](#containscharsequence-s)
    - [startsWith(String prefix) / endsWith(String suffix)](#startswithstring-prefix--endswithstring-suffix)
4. [Immutable Nature of Strings](#4-immutable-nature-of-strings)
5. [Practical Examples](#5-examples)
    - [Count Words in a Sentence](#example-1-count-words-in-a-sentence)
    - [Check for Palindrome](#example-2-check-for-palindrome)
    - [Format a String](#example-3-format-a-string)
6. [Exercises](#6-exercises)

---

## 1. What is a String injava?

Injava, a `String` is a sequence of characters. Strings are objects injava, which means they come with many built-in methods to manipulate text.

---

## 2. Creating Strings

```java
String str1 = "Hello, World!"; // Using string literal
String str2 = new String("Java Programming"); // Using `new` keyword
```

## 3. Key String Methods
### length()
Returns the number of characters in the string.

```java
String str = "Hello";
System.out.println(str.length()); // Output: 5
```

### charAt(int index)
Returns the character at the specified index.

```java
String str = "Java";
System.out.println(str.charAt(2)); // Output: v
```
c) substring(int beginIndex, int endIndex)
Extracts a portion of the string.

```java
String str = "Hello, World!";
System.out.println(str.substring(7, 12)); // Output: World
```

### indexOf(String s) / lastIndexOf(String s)
Finds the position of the first or last occurrence of a substring.

```java
String str = "Java Programming";
System.out.println(str.indexOf("a")); // Output: 1
System.out.println(str.lastIndexOf("a")); // Output: 13
```
### toLowerCase() / toUpperCase()
Converts all characters in the string to lowercase or uppercase.

```java

String str = "Hello, World!";
System.out.println(str.toLowerCase()); // Output: hello, world!
System.out.println(str.toUpperCase()); // Output: HELLO, WORLD!
```
### equals(String s) / equalsIgnoreCase(String s)
Compares two strings for equality, optionally ignoring case.

```java
String str1 = "Java";
String str2 = "```java";
System.out.println(str1.equals(str2)); // Output: false
System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
```
### trim()
Removes leading and trailing whitespaces.

```java

String str = "  java   ";
System.out.println(str.trim()); // Output:java
```
### replace(String oldChar, String newChar)
Replaces all occurrences of a substring with another.

```java

String str = "banana";
System.out.println(str.replace("a", "o")); // Output: bonono
```
### split(String regex)
Splits the string into an array based on the given delimiter.

```java

String str = "Java,Python,C++";
String[] languages = str.split(",");
for (String lang : languages) {
    System.out.println(lang);
}
// Output:
//java
// Python
// C++
```

### contains(CharSequence s)
Checks if the string contains a specific sequence of characters.

```java
String str = "Hello, World!";
System.out.println(str.contains("World")); // Output: true
```
### startsWith(String prefix) / endsWith(String suffix)
Checks if the string starts or ends with a specific substring.


### isEmpty(), IsBlank()
Checks String is empty 

```java
String empty = "";
String space = " ";

System.out.println(empty.lenght()); // 0
System.out.println(empty.lenght() == 0); // true
System.out.println(empty.isEmpty()); // true
System.out.println(empty.isBlank()); // true

```


```java

String str = "Java Programming";
System.out.println(str.startsWith("Java")); // Output: true
System.out.println(str.endsWith("Programming")); // Output: true
```
## 4. Immutable Nature of Strings
Strings injava are immutable, meaning once created, their content cannot be changed. Any method that modifies a string returns a new string object.

Example:

```java
String original = "Hello";
String modified = original.replace("H", "J");

System.out.println(original); // Output: Hello
System.out.println(modified); // Output: Jello
```
## 5.  Examples
### Example 1: Count Words in a Sentence

```java
String sentence = "Java is a powerful programming language";
String[] words = sentence.split(" ");
System.out.println("Word count: " + words.length); // Output: 6
```

### Example 2: Check for Palindrome
```java

String str = "madam";
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(reversed)); // Output: true
```
### Example 3: Format a String

```java
String name = "John";
int age = 30;
System.out.println(String.format("My name is %s and I am %d years old.", name, age));
// Output: My name is John and I am 30 years old.
```

# Exercises: String Manipulation injava

Practice your understanding ofjava string methods with these exercises. They cover a wide range of string manipulation tasks, from basic operations to advanced challenges.

---

## 6. Exercises

### 1. Reverse Each Word in a Sentence
Write a method to reverse each word in a given sentence while keeping the word order the same.  
**Input:** `Java is fun`  
**Output:** `avaJ si nuf`

---

### 2. Count the Occurrences of a Character
Create a program that counts how many times a specific character appears in a string.  
**Input:** `"banana", 'a'`  
**Output:** `3`

---

### 3. Check if Two Strings are Anagrams
Write a function to check if two strings are anagrams (contain the same characters in different orders).  
**Input:** `listen` and `silent`  
**Output:** `true`

---

### 4. Capitalize Each Word
Write a method to capitalize the first letter of each word in a string.  
**Input:** `java is fun`  
**Output:** `Java Is Fun`

---

### 5. Remove Vowels
Write a program to remove all vowels (`a, e, i, o, u`) from a given string.  
**Input:** `beautiful`  
**Output:** `btfl`

---

### 6. Find All Substrings
Generate and print all possible substrings of a given string.  
**Input:** `abc`  
**Output:** `a, b, c, ab, bc, abc`

---

### 7. Check for Balanced Brackets
Write a method to check if a string containing brackets (`()`, `{}`, `[]`) is balanced.  
**Input:** `{[()()]}`  
**Output:** `true`

---

### 8. Remove Consecutive Duplicates
Write a function to remove consecutive duplicate characters from a string.  
**Input:** `aaabbbcccaaa`  
**Output:** `abc`

---

### 9. Find Longest Palindromic Substring
Given a string, find the longest substring that is a palindrome.  
**Input:** `babad`  
**Output:** `bab` or `aba`

---

### 10. Count Words of Specific Length
Write a method to count the number of words in a sentence that have a specific length.  
**Input:** `Java is fun to learn`, `3`  
**Output:** `2` (words: `fun`, `to`)

---

## Advanced Exercises

### 11. Sort Words in Alphabetical Order
Write a program to sort all the words in a string alphabetically.  
**Input:** `Java Python C++ Ruby`  
**Output:** `C++java Python Ruby`

---

### 12. Find the Most Frequent Character
Write a method to find the character that appears most frequently in a string.  
**Input:** `success`  
**Output:** `s`

---

### 13. Validate a Password
Check if a string meets the following password requirements:
- At least 8 characters long
- Contains at least one uppercase letter
- Contains at least one number
- Contains at least one special character (e.g., `@, #, !`)

**Input:** `Passw0rd!`  
**Output:** `Valid`

---

### 14. Remove Non-Alphanumeric Characters
Write a method to remove all non-alphanumeric characters from a string.  
**Input:** `Hello, World!`  
**Output:** `HelloWorld`

---





