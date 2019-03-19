# Notes

- Coursework is work 12% of overall grade (where cw 2 is 38% and exam is 50%)
  - Due in 2 weeks on 28th March

## Traversal VS Search

- Searching is where once you find the node you're looking for, you stop
- Traversal is where you go over all the nodes, without any early stop

## Connectivity

- A graph is connected if there is a path between every pair of vertices
  - Can get from any node to any other node in the graph by choosing a path
- A connected component of a graph `G` is a _maximal connected_ subgraph of `G`

## Subgraphs

- A graph `S` is a subgraph of a graph `G` when:
  - Vertices of `S` are a subset of vertices of `G`
  - Edges of `S` are a subset of edges of `G`
- A spanning subgraph of `G` is a subgraph that contains all the vertices of `G`

## Depth-First Search

- Graph traversal:
  - Systematic procedure
  - Visit all vertices and edges
- DFS:
  - Like exploring a maze "adventurously"
  - Keep track of path back to entrance (start vertex) by means of a rope
  - Mark wherever we've visited
- Good for
  - Determining whether `G` is connected
  - Finding and reporting the connected components of `G`
  - Computing a spanning forest of `G`
- Can be extended to solve other problems:
  - Find and report a path between two given vertices
  - Find a cycle in the graph
- For graph with `n` vertices and `m` edges: `O(n+m)` time
- Implementation can use a recursive approach

### Properties of DFS

- Visits all edges of current node
