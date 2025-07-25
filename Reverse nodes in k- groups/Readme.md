# Reverse Nodes in k-groups

Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

## Example 1:

![image](https://github.com/user-attachments/assets/4a61e29a-7a43-4e5f-8e0e-07779172c1f3)

Input: head = [1,2,3,4,5], k = 2

Output: [2,1,4,3,5]

## xample 2:

![image](https://github.com/user-attachments/assets/dffb1ca4-1bf6-4ac2-af17-a06036702610)

Input: head = [1,2,3,4,5], k = 3

Output: [3,2,1,4,5]
 

## Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 5000
0 <= Node.val <= 1000

