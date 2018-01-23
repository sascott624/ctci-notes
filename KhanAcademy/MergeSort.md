# Merge Sort 
- a 'divide and conquer', recursive approach to sorting 
  1. we have an array of N items 
  2. divide the array in two, and recursively divide until each subarray.length = 1
  3. merge the two sorted arrays, and continue to merge back into full (sorted) array of length N
    a. merging is accomplished by comparing items at index 0 for each subarray - the smaller item is popped back into position in the original array, then we compare again until the array is full once more 
    b. each comparison takes constant time, each copy takes constant time, so the run time for merging is Big O(N)

- the divide function takes constant time (it's just calculating the middle index of the array)
- the merge function runs in Big O(N) time (because we're merging a total of N elements)
- now. the running time of mergeSort on an N-element array, is the sum of TWO mergeSorts each on an (N/2)-element subarray
  - each of those mergeSorts on an (N/2)-element subarray calls mergeSort twice on an (N/4)-element subarray
  - basically, as the subproblems get smaller, the number of subproblems doubles, but the merging time halves
  - eventually we get down to subproblems of size 1 ==> Big O(1)
  - repeatedly halving a problem (recursion) yields a runtime of Big O(log N)

- Big O(N log N)
