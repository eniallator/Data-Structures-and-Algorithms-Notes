# Notes

- Things to be covered
  - Hierarchical organisation
  - Formal definition
  - Applications and implementation
  - Tree traversal

## Linear VS Non-Linear Data Structures

- Linear implies: List like
  - Simple before and after organisation
- Nonlinear
  - Not found in the same memory space

## Hierarchical Organisation

- In computing, trees are represented like irl trees but upside-down
- Consists of parent/child relationships in "branches", then at the very end of a branch is a "leaf"

## Formal Definition

- A tree is defined as a set of nodes organised by a parent-child relationship
  - If a tree isn't empty, it has a node called root
  - Every node, asides from root, has a parent

## Terminology

- Nodes can have 0 or more children
  - Atleast 1 child: internal
  - 0 children: leaf
- Children that share a common node are siblings
- Also have ancestors and descendants of a node
- A subtree is where you take a node as a root and all of it's descendants

## The Tree Abstract Datatype

- Methods:
  - `root()`: the tree's root node
  - `parent(n)`: gets the parent of node `n`
  - `children(n)`: gets the children of node `n`
  - `isRoot(n)`: boolean if `n` is the root node
  - `isLeaf(n)`: boolean if `n` is a leaf node
  - `size()`: size of the tree
  - `isEmpty()`: boolean if the tree is empty

## Applications Of Trees

- Data storage
- Analysis of data
- Searching algorithms
- Sorting algorithms

## Tree Traversal

- Fundamental problem of systematically visiting every node on a tree
- Common traversal schemes:
  - Preorder traversal
  - Postorder traversal
- Naturally recursive definitions

### Preorder Traversal

- Always visit root first, then child subtrees

```text
Algorithm preorderTraverse(r)
  Input: root node r
  visit(r)
  for each n in r.children
    preorderTraverse(n)
  endfor
```

### Postorder Traversal

- Always visit root last, after child subtrees

```text
Algorithm postorderTraverse(r)
  Input: root node r
  for each n in r.children
    postorderTraverse(n)
  endfor
  visit(r)
```
