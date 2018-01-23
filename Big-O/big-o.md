# Big O
- *asymptotic runtime* or *Big-O* is a language and metric used to describe the efficiency of algorithms
- a way to gauge when your algorithm is getting faster/slower 
- in programming, this basically means the tightest description of the runtime

# Technically speaking
- Big O describes the upper bound, Big Omega is the lower bound, and Big Theta is a tight bound - but in the industry at large, Big O and Big Theta have basically become synonymous

# Best, Worst, Expected Case
- usually the worst and expected case are the same.
- Best, worst, and expected describe the big O time for inputs/scenarios, whereas Big O, Big Omega, and Big Theta describe upper, lower, and tight bounds for the runtime

# Space Complexity 
- parallel concept to time complexity 
- an array of size N requires O(N) space - a 2D array of size NxN requires O(N²) space

# Drop the Constants 
- Big O just describes the rate of increase, so we only care about the largest contributing factor

# Drop the Non-Dominant Terms
- O(N² + N) ==> O(N²)
- O(N + log N) ==> O(N)
- O(5*2ᴺ + 1000¹⁰⁰) ==> O(2ᴺ)
- O(B² + A) remains the same! We need to know more about A and B to reduce further

# Multi-Part: Add vs. Multiply
- "do this, then that" = add
- "do this for each time you do that" = multiply 

# Amortized Time 
- ArrayList: usually O(1) [ constant time ], but worst case O(N) [ when the array is full and needs to be copied over to a new array of size 2N ] - this doesn't happen very often though. *amortized time* basically means: yes, the worst case happens, but once it does, it won't happen again for so long that the cost is "amortized".
- X insertions into an ArrayList take O(2X) time. So, each insertion takes O(2) time -> the amortized time is O(1)

# Log N Runtimes
- example: binary search
- looking for an example x in an N-element sorted array, compare it to the middle, if it's smaller, search the left side of the array, if it's larger, the right side, etc.
- so, if we're looking for 9 in array = [ 1, 5, 8, 9, 11, 13, 15, 19, 21]
- 9 < 11
- now we look for 9 in array = [ 1, 5, 8, 9, 11 ]
- 9 > 8
- now we look for 9 in array = [ 9, 11 ]
- 9 = 9

- we start off with an N-element array to search, then an N/2-element array, N/4, etc. Therefore the total runtime is a matter of how many steps we can take until N = 1
- Log basically means the number of times we have to halve number N until we get to 1

# Recursive Runtimes 
int f(int n) {
  // console.log(n)             // 4, 3, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 2, 1, 1

  if(n <= 1) {
    return 1;
  }
  
  // console.log(n)             // 4, 3, 2, 2, 3, 2, 2
  return f(n - 1) + f(n - 1);
}

- our first call to f(N) - let's say f(4) - will recursively call f() two more times (f(3) and f(3)). Each of those calls f() twice, etc.
- the tree will have depth N (in this case, 4). and each node (function call) has two children - each level will have twice as many calls as the one before.

- 2⁰ + 2¹ + 2² + 2³ + ... + 2ᴺ (or 2ᴺ⁺¹ - 1)
- this type of function typically has a runtime of O(branchesᵈᵉᵖᵗʰ) --> O(2ᴺ)
- the space complexity of this algorithm is O(N) - although there are O(2ᴺ) total nodes, only O(N) exist at any given time [ meaning we only need O(N) memory available ]

*Sum of Integers 1 through N*
|- what is 1 + 2 + 3 + ... + N ?
|- if N is even, we pair 1 with N, 2 with N - 1, etc.
|--- we'll have a total of N/2 pairs each with a sum of (N + 1)
|- if N is odd, we pair 0 with N, 1 with N - 1, etc.
|--- we'll have a total of (N+1 / 2) pairs with sum N
|
|- regardless, the total sum is N(N + 1) / 2
|- this comes up a lot in nested for loops:
|    for(int i = 0; i < N; i++) {
|      for(int j = i + 1; j < N; j++) {
|        System.out.print(i + j)
|      }
|    }
|- on the first iteration of the outer loop, the inner loop runs N - 1 times
|- on the second iteration, N - 2 times, etc.
|
|    0 + N - 1 = N - 1
|    1 + N - 2 = N - 1
|    2 + N - 3 = N - 1
|    so, we'll have a total of N/2 pairs with sum (N - 1)
|    
|- the total number of iterations of the inner loop is N(N - 1) / 2 --> O(N²)
