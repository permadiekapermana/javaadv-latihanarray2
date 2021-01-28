public class MultidimensionalArrayExercise {
    public static int[][] createArray() {
		int[][] matriks = {
            {0,1,2},
            {1,2,3},
            {2,3,4}
        };
		return matriks;		
	}

    public static void main(String[] args) throws Exception {
        for(int i=0;i<createArray().length;i++) {
			for(int j=0;j<createArray().length;j++) {
				System.out.print(createArray()[i][j] + " ");
			}
			System.out.print("\n");
		}        

    }
}
