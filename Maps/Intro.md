# Notes

- A map is a searchable collection of key-value entries
  - AKA: dictionary, associative array, symbol table, lookup table, etc.
- The main operations of a map are for:
  - Inserting new things
  - Deleting things
  - Searching for things
- Maps support fundamental software applications:
  - Caches
  - Compiler symbol table
- Also other data structures:
  - Sets

## Key-Value Storage

- Maps allow us to store elements so thaat they can be quickly retrieved using keys
  - Store key-value pairs `(k,v)` called entries
  - Keys must be unique
- How can we implement them?

### Maps Using An Array

- List of values referenced by array index
  - Integer keys
  - Values arbitrary types (primitive or object types)
- Advantages: fast (constant time) lookup of values by keys
- Disadvantage: only allows consecutive, positive integer keys
- Maps are more general: allow keys and values to be arbitrary objects

## The Map ADT

- Should support the following operations:

| Method                                        | Description                                                                                                       |
| --------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| get(k)                                        | if map has an entry (k,v), return value v; else, return null                                                      |
| put(k,v)                                      | Insert (k,v) in map; if there was no previous entry for k, return null; else return old valuev’ associated with k |
| remove(k)                                     | Remove entry (k,v) and return v; if no such entry, return null                                                    |
| Should also support the following operations: |
| entrySet()                                    | Return iterable collection of all entries                                                                         |
| keySet()                                      | Return iterable collection of all keys                                                                            |
| values()                                      | Return iterable collection of all the values                                                                      |
| size()                                        | Return int number of entries in map collection                                                                    |
| isEmpty()                                     | Return true if map has no entries; false otherwise.                                                               |

## LECTURER

- TRIGGERED: SHE'S USING EDGE
- Now she's telling us how to make weed cookies
