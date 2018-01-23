// Suppose we had an algorithm that took in an array of strings, sorted each string, and then sorted the full array. What would the runtime be?

void sortArray(arrayOfStrings) {
  for (i = 0; i < arrayOfStrings.length; i++) {
    for (j = 0; j < arrayOfStrings[i].length; j++) {
      // sort the string, which is O(s log s)
      // this is done a times (where a is the length of the array)
      // so, O(a*s log s)
    }
    
    // now we have to sort all of the strings in the array 
    // there are a strings to sort, so O(a log a)
    // but bear in mind that each string needs to be compared at O(s) time 
    // so, the final for the outer loop is O(a*s log a)
  }
}

// Answer: O(a*s(log s + log a))