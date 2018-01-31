/* You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.

Write a function getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products. */

function getProductsOfAllIntsExceptAtIndex(array) {
  /* BRUTE FORCE
  
  */
}



For example, given:

  [1, 7, 3, 4]

your function would return:

  [84, 12, 28, 21]

by calculating:

  [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
  

0:    1, 2, 3
1: 0,  , 2, 3 
2: 0, 1,  , 3
3: 0, 1, 2,  