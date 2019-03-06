# Notes

## Exercise

![Example Tree](https://i.imgur.com/G4QkXR0.png)

- Pre
  - 42, 15, 27, 48, 9, 86, 12, 5, 3, 39
- In
  - 15, 48, 27, 42, 86, 5, 12, 9, 3, 39
- Post
  - 48, 27, 15, 5, 12, 86, 39, 3, 9, 42

## Contains Method

```java
public boolean contains(int value) {
  return contains(overallRoot, value);
}

private boolean contains(IntTreeNode node, int value) {
  if (node == null) {
    return false;   // base case: not found here
  } else if (node.data == value) {
    return true;    // base case: found here
  } else {
    // recursive case: search left/right subtrees
    return contains(node.left, value) || contains(node.right, value);
  }
}
```

## Application: Binary Search

- Keys at the left subtree are < the current node
- Keys at the right subtree are > the current node#

## Inorder Traversal

- Inorder traversal visits keys in smallest to largest (sorted) order
- The current node's value is checked right after the left node is checked, so before the right node is checked

## Key Definitions

- Depth (node)
  - The number of ancestors of the current node (excluding itself, so 0 indexed)
- Height (tree)
  - The longest path that can be taken from the root node, to a leaf
- Level `i` (tree)
  - All the nodes at depth `i`
  - Maximum number of nodes at level `i` is 2<sup>i</sup>

## Analysis: Binary Search

- Worst case: proportional to the height of a tree
- For a tree with `n` nodes:
  - Best: O(log<sub>2</sub>n)
  - Worst: O(n)
- Depends on the structure of the tree
  - Can ensure the height of a tree with `n` nodes is log<sub>2</sub>(n), rounded down
