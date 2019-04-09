# Notes

## Shortest Paths: BFS

- Can find shortest paths
- Application to routing problems
  - E.g Minimise changes of a train between A and D
- Property (shortest path):
  - For each vertex `v` in `L`<sub>`i`</sub>
    - Path from `s` to `v` in `T`<sub>`s`</sub> has `i` edges
    - Every path from `s` to `v` in `G`<sub>`s`</sub> has atleast `i` edges
- But the "cost" may not be uniform
  - E.g minimise the distance between A and D

## Shortest Paths: Weighted Graphs

- In a weighted graph:
  - Each edge has an associated numerical value, called the weight
  - Edge weights may represent distance, cost time, etc.
- Example:
  - In a flight route graph, weights represent distances in miles between the endpoint airports

## Dijkstra's Algorithm

- Given a start vertex `s`, compute shortest distances of all the vertices from `s`
- Assumptions:
  1. The graph is connected
  2. The edges are undirected
  3. The edge weights are non-negative
