# Notes

- Self balancing trees:
  - AVL tree
  - B-tree
  - Red-black tree
  - Scapegoat tree
  - Splay tree
  - etc.

## Importance of being balanced

- O(h) where h is the height
  - h between log n and n
  - Perfectly balanced = log n
  - Worst case = n

## AVL Trees

- Binary search tree but with the height balance property
- Each node keeps track of it's own height
- That way, the root node keeps track of the longest run
- How do we maintain the height-balance property?
  - `k` is the key
  - New entries inserted with `put(k, v)`
  - Entries removed with `remove(k)`
