// What is the runtime for the below code?

void printPairs(int[] array) {
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array.length; i++) {
      System.out.println(array[i] + "," + array[j]);
    }
  }
}

// Answer: O(N²)