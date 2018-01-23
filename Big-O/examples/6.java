// What is the runtime for the below code?

void reverse(int[] array) {
  for (int i = 0; i < arrayA.length / 2; i++) {
    int other = array.length - i - 1;
    int temp = array[i];
    array[i] = array[other];
    array[other] = temp;
  }
}

// Answer: O(N)
