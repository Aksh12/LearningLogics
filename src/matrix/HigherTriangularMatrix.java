package matrix;

public class HigherTriangularMatrix {

	public static void main(String[] args) {
		int[][] a= new int[3][3];
		int count=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j]=count++;
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}

		System.out.println("---------------");
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a.length; j++) {
			if(i<j) {
				a[i][j]=0;
			}
		}
	}
	
	for(int i=0; i<a.length;i++) {
		for(int j=0; j<a.length;j++) {
		System.out.print(a[i][j] + " ");
	}
		System.out.println();
	}
	
	}
}
