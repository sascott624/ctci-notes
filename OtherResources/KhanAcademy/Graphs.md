# Graph Representation 
- models are *vertices*
- connections between vertices are *edges*
    - an edge connecting vertices u and v is represented by the pair (u, v)
- if a connection works in both ways, the graph is *undirected* - and an undirected edge (u, v) is the same as (v, u)
- in an undirected graph, an edge between two vertices is *incident* on the two vertices, and those vertices are *adjacent* or *neighbors*
- the number of edges incident on a vertex is the *degree* of the vertex 
- if u is connected to v and t is connected to u, there is a *path* of two edges between t and v
- when a path goes from one vertex back to itself, it's a *cycle*
- sometimes, edges are labeled - the generic term for a number put on an edge its its *weight*, and a graph whose edges have weights is a *weighted graph*

- one simple way to represent a graph is just a list (or array) of edges - an *edge list*
[ [0, 1], [0, 6], [0, 8], [1, 4], [1, 6], [1, 9], [2, 4], [2, 6], [3, 4], [3, 5], [3, 8], [4, 5], [4, 9], [7, 8], [7, 9] ]
- this is simple, but searching through it is tricky

*Adjacency Matrices*
- for a graph with |V| vertices, an *adjacency matrix* is a |V| x |V| matrix of 0s and 1s, where the entry in row i and column j is 1 if and only if the edge (i, j) is in the graph

      0 1 2 3 4 5 6 7 8 9

  0   0 1 0 0 0 0 1 0 1 0
  1   1 0 0 0 1 0 1 0 0 1
  2   0 0 0 0 1 0 1 0 0 0
  3   0 0 0 0 1 1 0 0 1 0
  4   0 1 1 1 0 1 0 0 0 1
  5   0 0 0 1 1 0 0 0 0 0
  6   1 1 1 0 0 0 0 0 0 0
  7   0 0 0 0 0 0 0 0 1 1
  8   1 0 0 1 0 0 0 1 0 0
  9   0 1 0 0 1 0 0 1 0 0
  
- which is represented in javascript by an array of 10 arrays (each with length 10)
- looking up edges with this method takes constant time, but it takes up a lot of space

*Adjacency Lists*
- combines adjacency graphs with edge lists
- for each vertex i, store an array of the vertices adjacent to it

  0 --> [1, 6, 8]
  1 --> [0, 4, 6, 9]
  2 --> [4, 6]
  3 --> [4, 5, 8]
  4 --> [1, 2, 3, 5, 9]
  5 --> [3, 4]
  6 --> [0, 1, 2]
  7 --> [8, 9]
  8 --> [0, 3, 7]
  9 --> [1, 4, 7]

- which is represented in javascript by an array of 10 arrays (of various lengths)

