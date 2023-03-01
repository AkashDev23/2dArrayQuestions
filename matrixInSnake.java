//Given a matrix of size n x n. print the matrix elements in the snake pattern. 
//print the matrix elements in snake pattern for a given n x n matrix with O(n x n) time 
//complexity and O(1) auxiliary space

//matrix in snake pattern means in the the zeroth row will be printed as it is and the first row will be printed in inverted order
//Now again the second row will be printed as it is and third row will be inverted
// Here we can see a pattern that whole matrix is traversed but odd rows are printed in reverse order and even rows are printed as it is

public class matrixInSnake {
	public static void main(String[] args) {
		int matrix[][] = new int[][] { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };

		print(matrix);

	}

	static void print(int matrix[][]) {
		for (int r = 0; r < matrix.length; r++) {// We traverse through the rows of the matrix
			if (r % 2 == 0) {// check if the row is even or odd
				for (int c = 0; c < matrix[r].length; c++)// if even print as it is
					System.out.print(matrix[r][c] + " ");
			} else {
				for (int c = matrix[r].length - 1; c >= 0; c--)// if odd then print in reverse order
					System.out.print(matrix[r][c] + " ");
			}
		}
	}
}
