# Insertion Sort 
- sorting a list of items by:
  1. loop over positions in the array, starting with index 1 
  2. compare the current position with elements to is left (moving right to left) until its appropriate place is found 
  3. once we find that the element is less than the element to its left, we slide every following element left and insert the current element 
  
- loops over the indices of an array, but only calls 'insert' on indices 1, 2, 3 ... N - 1
- insertion also requires us to shift the larger elements over - something that takes a constant amount of time proportional to the number of elements (we'll call this K)
- WORST CASE: suppose that the value of every call to 'insert' is less than every element in the subarray to its left. the first insert has K = 1, the second, K = 2, until K = N - 1
- Big O(N²)
- BEST CASE: already sorted, so each call to insert takes constant time 
- Big O(N)
