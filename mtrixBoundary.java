
public class mtrixBoundary {
	public static void main(String[] args) {
		int arr[][] = { { 11, 12, 13, 14 },
						{ 15, 16, 17, 18 },
						{ 19, 20, 21, 22 }, 
						{ 23, 24, 25, 26 } };
//		print(arr, 4, 4);
		printb(arr);
	}

	private static void printb(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0)
					System.out.print(arr[i][j] + " ");
				else if (i == arr.length - 1)
					System.out.print(arr[i][j] + " ");
				else if (j == 0)
					System.out.print(arr[i][j] + " ");
				else if (j == arr[0].length - 1)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}
	}
	//This method also does the same thing but only written differently

//	public static void print(int mat[][], int m, int n) {
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i == 0)
//					System.out.print(mat[i][j] + " ");
//				else if (i == m - 1)
//					System.out.print(mat[i][j] + " ");
//				else if (j == 0)
//					System.out.print(mat[i][j] + " ");
//				else if (j == n - 1)
//					System.out.print(mat[i][j] + " ");
//				else
//					System.out.print("   ");
//			}
//			System.out.println("");
//		}
//	}
}