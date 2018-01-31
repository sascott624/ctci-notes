# Quick Sort 
- a 'divide and conquer', recursive approach to sorting 
  1. we have an array of N items 
  2. select a 'pivot' and rearrange all elements in the array so that those that are smaller than the pivot fall to the left, and those that are larger are on the right (this is called 'partitioning')
    a. we typically choose the rightmost element in the array as the pivot 
  3. then recursively sort the subarrays to the left and the right of the pivot
  
let array = [9, 7, 5, 11, 12, 2, 14, 3, 10, 6]
    indices  0  1  2   3   4  5   6  7   8  9

low = 0 (first index)
high = 9 (last index)
pivot = 6

i = -1 (initialize index of smaller element)
traverse elements from j = low to high-1 (because high is the pivot)
    j = 0 --> array[j] > pivot, do nothing
    j = 1 --> array[j] > pivot, do nothing 
    j = 2 --> array[j] <= pivot, swap: increment i and swap array[i] with array[j]
      i = 0
      array: [ 5, 7, 9, 11, 12, 2, 14, 3, 10, 6]
    j = 3 --> array[j] > pivot, do nothing
    j = 4 --> array[j] > pivot, do nothing
    j = 5 --> array[j] <= pivot, swap: increment i and swap array[i] with array[j]
      i = 1
      array: [ 5, 2, 9, 11, 12, 7, 14, 3, 10, 6]
    j = 6 --> array[j] > pivot, do nothing
    j = 7 --> array[j] <= pivot, swap: increment i and swap array[i] with array[j]
      i = 2
      array: [ 5, 2, 3, 11, 12, 7, 14, 9, 10, 6]
    j = 8 --> array[j] > pivot, do nothing
    now we exit the loop (j === high - 1), and it's just a question of placing our pivot
    we swap it with array[i + 1] (in this case, array[3])
      array: [ 5, 2, 3, 6, 12, 7, 14, 9, 10, 11 ]
    
now we do the whole process again on arrays [ 5, 2, 3 ] and [ 12, 7, 14, 9, 10, 11 ]


- the real work here is in the divide step (which partitions the array)
- in a worst case scenario, our subarrays aren't "balanced", and we do O(N^2) work
- but the average-case running time is O(N log N)

- Big O(N log N)
