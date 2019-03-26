# Notes

- Provides better performance
  - Basic operations are generally O(1)
- Arrays have good performance, so:
  - Transform key to some integer index
  - Use index to access array
- Two major components:
  - A hash function: transform key to integer
  - A bucket array: array storing key-value pairs
- Ends up being an array of linked lists because of collisions

## Bucket Array

- Array `A` of size `N`
  - `N` is the capacity of the array
- Each cell a "bucket"
  - Collection of key-value pairs
- Keys just integers in `[0,N-1]`
  - Store entry `(k, v)` in bucket `A[k]`
  - So, each bucket has at most one item
  - Searches, insertions, removals take O(1) time
- However
  - Keys are not always integers
  - Or not in range `[0, N-1]`
  - Or not evenly distributed in range `[0, N-1]`

### Hash Function

- Map each key `k` to integer `i`
  - Range `[0, N-1]`
- Use `h(k)` to index bucket array `A`
- Store key-value pair `(k, v)` in bucket `A[h(k)]`
- Should distribute keys randomly
- A good hash function minimizes collisions

#### Specifying Hash Functions

- Compose 2 functions
  - Generate a hash code:
    - `KEYS -> INTEGERS`
  - Apply a compression function:
    - `INTEGERS -> [0, N-1]`

#### Hash Code Functions

- Memory address:
  - Use integer address of `k` as a hash code
  - `hashCode()`: inherited from java `Object`
  - Not good for `String` keys: over-ridden
- Integer cast:
  - Can get good codes by interpreting primitives (`byte`, `short`, `char`, etc.) as `int`
  - Might even try this for e.g `long` or `double`
