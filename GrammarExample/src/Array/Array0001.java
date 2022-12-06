package Array;

public class Array0001 {
	public static void main(String[] args) {
		int[][] mathscores = new int[2][3];

		for (int i = 0; i < mathscores.length; i++) {
			for (int j = 0; j < mathscores[i].length; j++) {
//				System.out.println("mathscores[" + i +"] ["+ j +"] = "  + mathscores[i][j]);
				System.out.print(mathscores[i][j] + " ");

			}
		}

		System.out.println();
		System.out.println("--------------------------------");
		mathscores[1][0] = 80;
		mathscores[1][2] = 99;
		for (int i = 0; i < mathscores.length; i++) {
			for (int j = 0; j < mathscores[i].length; j++) {
				System.out.println("mathscores[" + i + "] [" + j + "] = " + mathscores[i][j]);
			}
		}

	}

}
