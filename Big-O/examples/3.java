// What is the runtime for the below code?
// note: this is very similar to the previous code, but the inner loop starts at i + 1

void printUnorderedPairs(int[] array) {
  for (int i = 0; i < array.length; i++) {
    for (int j = i + 1; j < array.length; i++) {
      System.out.println(array[i] + "," + array[j]);
    }
  }
}

// Answer: O(N²)
// the first time through, the inner loop runs for N - 1 steps, then N - 2
// (N - 1) + (N - 2) + ... + 2 + 1
// is the same as 
// 1 + 2 + 3 + ... + N - 1
// so, the sum of int 1 ... N - 1 = N(N - 1) / 2 --> O(N²)

// also, visualize the half matrix!