# Notes

- ASSIGNMENT 1 COMING OUT AAAAAAAAH
- PS. ASSIGNMENT 2 IS IMPLEMENTATION

## Graphs

- Mathematically: A graph **G** is a pair (**V**, **E**), where:
  - **V** = {**v<sub>1</sub>**, **v<sub>2</sub>**, **v<sub>3</sub>**, ..., **v<sub>k</sub>**} is a set of nodes or vertices
  - E is a set of pairs of vertices, (**v<sub>i</sub>**, **v<sub>j</sub>**) called edges
- Implemented as a data structure, vertices and edges may store data items

### Types Of Edge

- Directed Edge
  - Ordered vertex pair: (**u**, **v**)
  - Origin **u** and destination **v**
- Undirected Edge
  - Unordered pair (**u**, **v**)
- Directed Graph
  - All edges are directed
- Undirected Graph
  - All edges are undirected
- Edges may also be weighted or unweighted:
  - Weighted graph
    - All edges are weighted
  - Unweighted graph
    - All edges are unweighted

## Applications of graphs

- Transportation network
  - Road, rail and flight networks
- Computer networks
  - Local area network (LAN)
  - Internet and web
- Telecommunications
  - Telephone networks
  - Radio/TV
- Social-networks
  - Social media analytics
- Electronic circuits
  - Printed circuit board (PCB)
  - Integrated circuit design
- Models of knowledge/reasoning
  - Semantic networks
  - Neural networks

## Terminology

- **Endpoints**: end vertices of an edge
- Edges **incident** on a vertex: edges that meet a vertex
- **Adjacent vertices**: vertices connected by an edge
- **Degree** of a vertex: number of incident edges
- **Parallel** edges: 2 or more edges connected the same vertices
- **Self-loop**: edge connecting the same node
- **Path**: Sequence of alternating vertices and edges
  - Begins with a vertex
  - Ends with a vertex
  - Each edge is followed by it's end points
- **Simple path**: all vertices/edges are distinct
- **Cycle**: Circulare path - begins and ends with the same vertex
- **Simple cycle**: All vertices/edges are distinct except the start/end vertex
