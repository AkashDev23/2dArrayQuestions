
public class transposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		print(matrix);
		print(transposeMat(matrix));
	}

	static int[][] transposeMat(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}

	static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
