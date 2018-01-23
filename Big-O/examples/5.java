// What is the runtime for the below code?

void printUnorderedPairs(int[] arrayA, int[] arrayB) {
  for (int i = 0; i < arrayA.length; i++) {
    for (int j = 0; j < arrayB.length; j++) {
      for (int k = 0; k < 100000; k++) {
        System.out.println(arrayA[i] + "," + arrayB[j]);
      }
    }
  }
}

// Answer: O(A*B)
// (let A = arrayA.length, B = arrayB.length)
// that k loop doesn't really change anything - 100000 units of work is still constant!
