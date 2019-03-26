# Notes

## Java Maps

- `TreeMap` offers `O(log n)` lookup and insertion
  - Keys are in sorted order
  - Keys must implement the `Comparable` interface
  - Implemented with a Red-Black Tree
- `HashMap` offers `O(1)` lookup and insertion
  - Keys are arbitrarily placed
  - Implemented with an array of linked lists

## The Map ADT

- Should have the following operations

| Method     | Description                                                                                                        |
| ---------- | ------------------------------------------------------------------------------------------------------------------ |
| get(k)     | if map has an entry (k,v), return value v; else, return null                                                       |
| put(k,v)   | Insert (k,v) in map; if there was no previous entry for k, return null; else return old value v’ associated with k |
| remove(k)  | Remove entry (k,v) and return v; if no such entry, return null                                                     |
|            | Should also support the following operations:                                                                      |
| entrySet() | Return iterable collection of all entries                                                                          |
| keySet()   | Return iterable collection of all keys                                                                             |
| values()   | Return iterable collection of all the values                                                                       |
| size()     | Return int number of entries in map collection                                                                     |
| isEmpty()  | Return true if map has no entries; false otherwise.                                                                |

## Doubly Linked List Implementation

- Store entries in arbitrary order
- Ok for small maps
- Doubly linked lists allow for both forward & backward traversal
  - Allow efficient insertion/removal of arbitrary nodes
- `get(k)` algorithm:

```text
Algorithm get(k)
  Input: A key k
  Output: value for key k or null if no key k
  n := map.header()
  while n.getNext() != trailer
    n := n.getNext() // get next node
    if n.entry().getKey().equals(k) then
      return n.entry().getValue()
    endif
  endwhile
  return null // no entry with key = k
```

- `put(k, v)` algorithm:

```text
Algorithm put(k,v)
  Input: key-value pair k, v
  Output: return old value of k, or null, if no k
  n := Map.header()
  while n.getNext() != trailer
    n := n.getNext()
    if n.entry().getKey().equals(k) then
      u := n.entry().getValue() // get old value
      n.setData(new Entry(k,v)) // replace entry
      return u  // return old value
    endif
  endwhile
  Map.addLast(new Entry(k, v))
  size := size + 1
  return null // no entry with key = k
```

- `remove(k)` algorithm:

```text
Algorithm remove(k)
  Input: key k
  Output: value of k, if in Map; null otherwise
  n := Map.header()
  while n.getNext() != trailer
    n := n.getNext() // get next node
    if n.entry().getKey().equals(k) then
      u := n.entry().getValue()
      Map.remove(n) // remove from Map
      size := size - 1 // decrement size of Map
      return u // return removed value
    endif
  endwhile
  return null // no entry with key = k
```

### Performance

- Put is O(n)
  - Proportional to the length of the list
  - Need to search for possible duplicate keys
- Get and remove also take O(n)
  - In worst case, traversing the length of the list
- List implementation of maps only suitable for a small size
- For larger maps, need to efficiently access values from keys
  - Back to arrays
  - Hash functions
