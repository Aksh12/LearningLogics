package matrix;

public class Transpose {

	public static void main(String[] args) {
		
		int[][]a= {{1,3,4},{2,4,3},{3,4,5}};

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("--------TRANSPOSE-------");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j][i] + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
