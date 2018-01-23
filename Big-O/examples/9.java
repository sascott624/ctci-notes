// The following sums the values of all the nodes in a binary search tree. What would the runtime be?

int sum(Node node) {
  if (node == null) {
    return 0
  }
  return sum(node.left) + node.value + sum(node.right);
}

// Answer: O(N)