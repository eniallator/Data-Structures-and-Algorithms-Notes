# Notes

- Items are added the same like normal queues
- When removing, get the item with the highest priority (lowest priority value) and remove that
  - When finding this, you can use ≥ or ≤

## Methods

- `insert(k, x)`: Insert item `x` wth a priority value of `k`
- `removeMin()`: Removes the item with the highest priority (lowest priority value)
- `size()`: Gets the size of the priority queue
- `isEmpty()`: Boolean saying if the priority queue is empty
- `min()`: Gets the item with the highest priority

## Implementation

### Interface

```java
public void insert(int key, Object value);
public Object removeMin();
public int size();
public boolean isEmpty();
public Object min();
```

### Data Structures To Implement

- Array
  - Non-sorted and sorted versions
- Linked List
  - Non-sorted and sorted versions
- Heaps <sub><sub>of heaps lmao 😂😂😂 420 xX1337_GOTTEMXx</sub></sub>

#### Linked List Naive Implementations

- First way:
  - Always adding to the start of the linked list
    - O(1)
  - To remove, you need to find the lowest priority item and then remove that
    - O(n)
- Second way:
  - Adding to the list so that it's sorted - so find the right place
    - O(n)
  - To remove, just take the first item
    - O(1)

## Comparators

- A comparator object encapsulates the action of comparing two objects according to a given total order relation
- Generic priority queue uses an auxiliary comparator

## Sorting

- Can use priority queue to sort data
- Insert elements with a series of insert operations
- Remove the elements in sorted order with a series of `removeMin` operations
- Run time?

## Sequence-Based Priority Queue

- Implementation with an sorted list:
  - `insert` - `O(1)` since inserting is at the beginning or end of the sequence
  - `removeMin` - `O(n)` since traversing entire sequence to find the smallest key
- Implementation with unsorted list:
  - `insert` - `O(n)` since figuring out place to insert the item
  - `removeMin` - `O(1)` since u know where the min key is
