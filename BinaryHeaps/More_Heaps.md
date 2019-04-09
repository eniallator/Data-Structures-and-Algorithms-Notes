# Notes

## Bubbling

- Up-Heap bubbling `insert(k, v)`:
  1. Insert new node as last node of tree
  2. Swap node and parent to restore heap order property
  3. Repeat until restored
- Down-Heap bubbling `removeMin()`:
  1. Smallest element stored at root
  2. Delete last node and store it at the root
  3. Swap node and child to restore heap order property
  4. Repeat until restored

## Binary Heap Complexity

| Algorithm | Average  | Worst Case |
| --------- | -------- | ---------- |
| Space     | O(n)     | O(n)       |
| Search    | O(n)     | O(n)       |
| Insert    | O(1)     | O(log n)   |
| Delete    | O(log n) | O(log n)   |
| Peek      | O(1)     | O(1)       |

## Heap Sort

- Firstly, build the heap (by inserting the unordered set of numbers into it 1 by 1)
  - O(n log n)
- Then continuously do `removeMin` until the heap is empty to get the numbers in order
  - O(n log n)
- This is overall O(n log n) so is pretty efficient
