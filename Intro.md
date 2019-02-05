# Notes

- Introduction, arrays and linked lists

## Introduction

- WE NEED TO BUILD A WALL (she's amuuuuurican)
- Only juan textbook (juan cuz mexico is close to america)
- Timetable stuff... yada yada yada
- ERMAHGERD FINERL YER STUDERNTS
- Flexing on us haters
- CW worth 40% (100% for a pass :OOOOOOOOOOOO)
  - Split up into 30% for first and 70% for second
- Exam worth 60%
- F to pay respects to whoever asked a question this lecture 😂
- YOU'LL NEVER GUESS WHAT THIS MODULE CONTAINS
  - (data structures and algorithms)
- Algorithm definition:
  - Step by step procedure for solving a problem in a finite amount of time
- Something something fox and stork something something

| Data Structures                   | Algorithms                |
| --------------------------------- | ------------------------- |
| Stack and queue                   | Search                    |
| Linked list                       | Sorting                   |
| Priority queue                    | Tree traversal            |
| Trees                             | graph traversal           |
| The binary heap (AKA binary tree) | shortest paths            |
| Maps and hashes                   | cycle detection in graphs |
| Graphs                            |                           |

## Why Study This Stuff

- Understand how to create a better program
- Understand how to tackle new problems
- Evaluate the quality of a program

## Types of data structures

- Data Structure
  - Linear
    - Arrays
    - Linked list
    - Stack
    - Queue
  - Non-linear
    - Trees
    - Graph

| Basis for comparison | Linear data structure            | Non-linear data structure |
| -------------------- | -------------------------------- | ------------------------- |
| Basic                | The data items are arranged</br> |

look at the canvas slides to finish this table, myself

## Arrays

- Arrays:
  - List of values referenced by array index
  - In java index starts at 0
  - Part of the java collective framework
  - Arrays are objects in java (contents can be primitive types or object types)
- Array operations and efficiency
  - Store as many items as need up to max capacity
  - Constant time operation to find items by index
  - Removal - to avoid gaps with no entry we need to move all the array items up to close the gap

## Linked Lists

- Has a head memory location that points to the first node
- Each node in the linked list contains the value itself and then the reference to the next node
- Nodes can be anywhere in the memory
- E.g

```text
[349238|] -> [271893|I am a value 😊] -> [813292|null]
```

## Arrays VS Linked Lists

- AAAAAAAAAAAAAAAAAAAAAAAAAAAAH FUCK THERE'S A HUGE TABLE IMMA HAVE TO COPY

## Defining Linked Lists

### ListNode

```java
public class ListNode {
    // Instance variables
    private object data;
    private ListNode next;

    // Constructor
    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    // Missing getters and setters
}
```

### Linked List

```java
public class LinkedList {
    // Instance variables
    private ListNode head;
    private int size;

    // Constructor
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Missing methods
}
```

- SHE MADE A SYNTAX ERROR 😱
