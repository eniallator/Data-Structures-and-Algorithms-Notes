# Notes

- Insertion one end, removal/access at the other
- FIFO data structure
- "We don't, as programmers, want java" truer things have never been spoken
- Circular queues are queues implemented using an array where it wraps around the end of the array

## Methods

- enqueue and dequeue for adding/removing items
- size for getting how big it is
- front gets the first element of the queue, without removing it

## Applications Of Queues

- Printer queue
- Games

## Java Implementation

### Interface

```java
public void enqueue(Object item);
public Object dequeue();

public int size();
public Object front();
```

### Array Queue

```java
public class Queue {
  private Object[] theArray;
  private int currentSize;
  private int rear;
  private int front;

  private int increment(int x) {
    return ++x % theArray.length;
  }

  public void enqueue(Object item) {
    if(currentSize == theArray.length)
      throw new OverflowException("ArrayQueue:enqueue");
      theArray[rear] = item;
      rear = increment(rear);
      currentSize++;
  }

  public Object dequeue() {
    if(isEmpty())
      throw new UnderflowException("ArrayQueue:Dequeue");
    Object frontItem = theArray[front];
    front = increment(front);
    return frontItem;
  }
}
```

## Circular Queue

- Circular queue is one that wraps around and reuses the memory space
- Usually uses singly linked lists 😱

## Double Ended Queue

- Supports:
  - Insertion at the front and rear of the queue
  - Deletion at both the front and rear
- Generally referred to as deque
  - Pronounced "deck" with a new zealander accent

## The Deque ADT Methods

- addfirst(e)
- addLast(e)
- removeFirst()
- removeLast()

---

- size()
- isEmpty()
- front()
- rear()

### Deque Implementation

- Deque may be implemented using arrays or linked lists
- Array based implementation:
  - Circular implementation
