# Binary Tree
- a data-structure meant to simulate a hierarchy
- each node will have a root value and a list of references to other (child) nodes
- specifically, a *binary* tree's nodes have at most two children (left child and right child)

TRAVERSAL

       F
     /   \
    B     G
  /   \    \
 A     D    I
      / \    \ 
     C   E    H

*pre-order*: start at the root, traverse left, then right
[ F, B, A, D, C, E, G, I, H ]


*in-order*: traverse left, then the root, then right
[ A, B, C, D, E, F, G, H, I ]

- typically, for a binary search tree, we can retrieve all of the data in sorted order through in-order traversal 


*post-order*: traverse left, then right, then the root
[ A, C, E, D, B, H, I, G, F ]

- deletion occurs in post-order (delete left child, then right child, then node)