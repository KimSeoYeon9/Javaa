package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores[i].length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = new int[2][];
		javaScores[0] = new int[2];
		javaScores[1] = new int[3];
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores.length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}
	}
}
