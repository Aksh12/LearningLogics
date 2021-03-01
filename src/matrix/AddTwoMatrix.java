package matrix;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		int [][] a= new int[2][2];
		int [][] b= new int[2][2];
		int [][] c= new int[a.length][a.length]; 
		boolean flag = true;
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		

		b[0][0]=1;
		b[0][1]=2;
		b[1][0]=3;
		b[1][1]=-4;
	
		int count=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length;j++) {
				if(a[i][j] == b[i][j]) {
				count++;
				}else {
					break;
				}
			}
		}
		
		
		if(count==8) {
			System.out.println("Both arrays are identical");
		}else {
			System.out.println("Both arrays are not identical");
		}
		
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length;j++) {
//				c[i][j]=a[i][j] - b[i][j];
//				System.out.print(c[i][j] + "  ");
//				
//			}
//			System.out.println();
//		}
		
//		if(flag == true) {
//			System.out.println("Both 2D arrays are identical");
//		}else {
//			System.out.println("2D arrays are not identical");
//		}
	}

}
