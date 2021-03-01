package matrix;

public class LowerTriangularMatrix {

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
		
		boolean flag=false;
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j]) {
					flag=true;
					continue;
				}
				if(flag==true) {
					a[i][j]=0;
				}
			}
			flag=false;
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
			System.out.print(a[i][j] + " ");
		}
			System.out.println();
		}
	}
	

}
