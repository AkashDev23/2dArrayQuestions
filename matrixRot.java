/*Given a matrix, clockwise rotate elements in it. 
A matrix needs to be traversed in spiral form. Rotate all the boundary elements, starting from the 
outermost and then rotate the inner ring. 
Expected Time Complexity: O(m x n) 
public*/ class matrixRot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };// initialize the matrix
		print(arr);
		rotateMat(4, 4, arr);// call the rotate function
		
	}

	static void rotateMat(int m, int n, int mat[][]) {
		int row = 0, col = 0;
		while (row < m && col < n) {
			if (row + 1 == m || col + 1 == n) {// This is the base case this means that only 1x1 matrix is left so
												// break.
				break;
			}
			int prev = mat[row + 1][col];// initialize a prev value that will come in the position of the first element
			for (int i = col; i < n; i++) {
				int curr = mat[row][i];// at current value put the value that will be replaced by the prev then this
										// will move forward and prev will come in it's place
				mat[row][i] = prev;// swap current element with previous element
				prev = curr;
			}
			row++;// increment the row

			for (int i = row; i < m; i++) {
				int curr = mat[i][n - 1];
				mat[i][n - 1] = prev;
				prev = curr;
			}
			n--;
			if (row < m) {
				for (int i = n - 1; i >= col; i--) {
					int curr = mat[m - 1][i];
					mat[m - 1][i] = prev;
					prev = curr;
				}
			}
			m--;

			// Move elements of first column
			// from the remaining rows
			if (col < n) {
				for (int i = m - 1; i >= row; i--) {
					int curr = mat[i][col];
					mat[i][col] = prev;
					prev = curr;
				}
			}
			col++;
		}

		// Print the final matrix
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.print("\n");
		}
	}
//print function to print the matrix
	static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}