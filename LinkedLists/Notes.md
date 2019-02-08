# Notes

- Arrays can be inefficient in some situations as they have a fixed size and can't be grown
- Linked lists are ordered collection of nodes
- Nodes contain data and a link
- Common operations include add/remove/query

## Java Implementations

- First basic version

```java
public class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
```

- Version 2

```java
public class ListNode {
    private Object data;
    private ListNode next;

    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public void setNext(ListNode next) {
        next = node;
    }

    public ListNode getNext() {
        return next;
    }
}
```

- Linked list class

```java
public class LinkedList {
    private ListNode head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(ListNode n) {
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addLast(ListNode n) {
        ListNode newNode = new ListNode();
        tail.setNext(newNode);
        tail = newNode;
    }

    public void addAt(ListNode n, int i);

    public void removeFirst() {
        if (head == null)
            // error, it's empty
        else {
          head = head.getNext();
        }
    }

    public void removeLast();
    public void removeAt(int i);

    public boolean isEmpty();
    public int size();
}
```

- Using a linked list

```java
public class Contacts {
    private LinkedList entries;

    public Contacts() {
        entries = new LinkedList();
    }
}
```

## Doubly Linked Lists

- Provides both forward and backwards traversal
- Nodes have next and prev links
- Sentinels are dummy nodes to mark the start and end of the list
  - Don't hold actual data
  - They exist to avoid bugs
  - Header and trailer sentinels can mark start and end
    - Replace head and tail pointers
