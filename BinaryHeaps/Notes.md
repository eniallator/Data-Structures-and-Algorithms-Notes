# Notes

- It's a complete binary tree ordered from top to bottom
- Heap order property:
  - For every node `n`, key stored at `n` is >= to the key stored at `n`'s parent
- Min-heap (c.f. max-heap)

## Methods

- `insert(k, v)`:
  - Insert new node as last node of tree
  - Swap node and parent to restore heap order property
- `removeMin()`:
  - Smallest element stored at root
  - Delete last node and store entry at root
  - Swap node and child with smallest key to restore order property
