# Arrays
- collection of items stored at continuous memory locations 
- allow random access of elements 
- statically implemented - they are initiated with a set size

# Linked Lists
- better memory management than arrays 
- no direct access to elements 

# Stacks 
- LIFO (last in first out)
- useful for solving recursion (recursive calls are placed on a stack and removed when called)
- useful for Depth-First Search 
- useful for converting a decimal to a binary number 
- useful for reversing a string 

# Queues
- FIFO (first in first out)
- useful for access to shared resources (i.e. printers)

# Trees 
- hierarchical data structure
- top element is the root
- each element (besides the root) has a parent element, and may have children 
- useful to store hierarchical data 

# Heaps 
- come in two forms: min heaps and max heaps 
- in a min heap, the heap property means: each node should be smaller than/equal to its children (the root is always the smallest value)
- in a max heap, the heap property means: each node should be greater than/equal to its children
- useful for priority queues

# Hash Tables
- a key:value lookup (it gives us a way of, given a key, associating a value with it for quick lookups)
- a data structure that stores data in the form of key:value pairs
- the key is hashed (via a hashing function: string --> integer), then the hash is mapped to an array index, and the key:value pair are stored at that index (usually in a linked list)
- since there are an infinite number of strings and a finite number of indexes, it's possible for two different strings to be mapped to the same index. this is called a *collision*, and has multiple solutions: one of which is *chaining* = essentially, store collisions in a linked list
- if we have a "good" hash table with a good hash function, the runtime is O(1)
- worst case, runtime is O(N)
  
  
  
  
  
  
  