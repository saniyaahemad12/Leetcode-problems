# Largest Submatrix with Rearrangements
You are given a binary matrix matrix of size m x n, and you are allowed to rearrange the columns of the matrix in any order.

Return the area of the largest submatrix within matrix where every element of the submatrix is 1 after reordering the columns optimally.

 

## Example 1:

<img width="452" height="215" alt="image" src="https://github.com/user-attachments/assets/5e73c86a-1e83-485e-ada4-e214209d7091" />

Input: matrix = [[0,0,1],[1,1,1],[1,0,1]]

Output: 4

Explanation: You can rearrange the columns as shown above.

The largest submatrix of 1s, in bold, has an area of 4.

## Example 2: 

<img width="447" height="58" alt="image" src="https://github.com/user-attachments/assets/64860979-8869-4667-8a85-82872ecf9417" />

Input: matrix = [[1,0,1,0,1]]

Output: 3

Explanation: You can rearrange the columns as shown above.

The largest submatrix of 1s, in bold, has an area of 3.

## Example 3:

Input: matrix = [[1,1,0],[1,0,1]]

Output: 2

Explanation: Notice that you must rearrange entire columns, and there is no way to make a submatrix of 1s larger than an area of 2.
 

## Constraints:

- m == matrix.length
- n == matrix[i].length
- 1 <= m * n <= 105
- matrix[i][j] is either 0 or 1.
