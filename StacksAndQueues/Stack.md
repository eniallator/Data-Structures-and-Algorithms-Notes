# Notes

- TL;DR go to labs
- Abstract data types:
  - We care about behaviour. For a user we care about possible operations on data of this type
  - A class of objects whose logical behaviour is defined by a set of values and a set of operations
- Data structures
  - We care about concrete representation of data from the point of view of the implementer (NOT the user)

## Stacks And Queue

- Special cases of linear data structures
  - Stack: Last in First out (LiFo)
  - Queue: First in First out (FiFo)

## Linear Lists

- First and last nodes often have special significance for:
  - Insertion
  - Removal
  - Access
- Important restricted cases of linear lists:
  - Stack: all insertion, removal, access at one end of list
  - Queue: insertion at one end and removal and access at the other end
  - Deque: FiFo, so same as Queue

## The Stack Abstract Data Type

- ADT: mathematical model of a class of data elements
- Abstract modek: no concrete implementation dictated
- Defined indirectly in terms of:
  - Operations that may be performed
  - Constraints on effects of these operations

| Method              | Description                                                    |
| ------------------- | -------------------------------------------------------------- |
| push(e):            | Insert element on top of the stack                             |
| pop():              | Remove element from top of stack and return it; error if empty |
| size():             | Gets the current size of the stack                             |
| duplicate():        | Dupes the first item                                           |
| peek():             | Return top item without removal                                |
| swap(), exchange(): | Swap the 2 top items on the stack                              |
| rotate():           | Circular shift of the n top most items                         |

## Stack Applications

- Web browser history
- Bracket balancing
- Undo/redo in programs
- Calculators for operands and results
- Runtime memory environments use a call stack
  - It's **M E T A**

## Implementation: Array Based

- Stack: N element array - initially empty
  - Top: -1
- Stack: stack frows from index 0
  - Top: n
- Stack: stack full
  - Top: N-1

```java
public class Stack {
  private static final int DEFAULT_CAPACITY = 500;
  private object[] theArray;
  private int topOfStack;

  public Stack() {
    theArray = new Object[DEFAULT_CAPACITY];
    topOfStack = -1;
  }

  // Stack methods: push/pop/etc.

  public void push(Object newElement) {
    if (topOfStack + 1 == theArray.length)
      throw new OverflowException("ArrayStack: push");
    else
      theArray[++topOfStack] = newElement;
  }

  public Object pop() {
    if (topOfStack > 0) {
      Object top = theArray[topOfStack];
      topOfStack--;
      return top;
    }
    throw new UnderflowException("ArrayStack: pop");
  }
}
```

## Summary

- Special case of linear data structure
  - All insertions, removals, access limited to one end
