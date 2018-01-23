// This method checks if a number is prime - it only needs to go up to the square root of n. What would the runtime be?

boolean isPrime(int n) {
  for (int x = 2; x * x <= n; x++) {
    // same as x <= √n
    if (n % x == 0) {
      return false;
    }
  }

  return true
}

// Answer: O(√N)