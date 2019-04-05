# Notes

- Is an ordered tree such that:
  - Each node has at most 2 children
    - Labeled left or right
  - Left child ordered before the right child

## Full Binary Tree

- AKA proper binary tree
- A binary tree where each node has either 0 or 2 children

## Implementation

- Can use a linked list where you store the data, parent pointer and also the left/right children

### Array Implementation

- root node is index `0`
- Left child index is `2 * parentIndex + 1`
- right child index is `2 * parentIndex + 2` ( or `leftIndex + 1` )
