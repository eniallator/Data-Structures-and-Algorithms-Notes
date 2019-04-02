# Notes

- Many programming languages don't have a built in data structure
- Are complex
  - Best implementation depends on application
- For this reason, it's common to write custom graph classes

## Questions

- What info do we need to store about a graph?
  - Edges and vertices
- Whats the simplest way to store a graph?
  - HashMap
  - LinkedList
  - Ordered pairs
  - Simple array (or linked list) of edges
  - E.g Using an edge set:
    - `{(1, 7), (2, 6), (3, 1), (3, 5), (4, 6), (5, 4), (5, 2), (6, 8), (7, 2), (7, 8)}`

## Edge List

- Unordered list of edges, where the 2 vertices are referenced in each edge
- Very inefficient for traversing as it needs to find each vertex/edge as well
- Very simple, non-bloated, and can print out each edge very quickly

## Adjacency List

- Use for the 2<sup>nd</sup> coursework
- Uses a vertex collection as well as an edge collection
- Add whatever to the edges - keep in mind storage space for scalability

## Adjacency Matrix

- Not used for the 2<sup>nd</sup> coursework
- 2D array where vertices are the indices and edges are the items in the array

## Performance

- `n` vertices, `m` edges
- No parallel edges
- No loops

|                   | Edge List | Adjacency List     | Adjacency Matrix |
| ----------------- | --------- | ------------------ | ---------------- |
| Space             | n + m     | n + m              | n<sup>2</sup>    |
| incidentEdges(v)  | m         | deg(v)             | n                |
| areAdjacent(v,w)  | m         | min(deg(v),deg(w)) | 1                |
| insertVertex(o)   | 1         | 1                  | n<sup>2</sup>    |
| insertEdge(v,w,o) | 1         | 1                  | 1                |
| removeVertex(v)   | m         | deg(v)             | n<sup>2</sup>    |
| removeEdge(e)     | 1         | 1                  | 1                |
