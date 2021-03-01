package matrix;

public class Product_twoMatrix {

	public static void main(String[] args) {
		
		int a[][]= {{2,3},{4,5}};
		int b[][]= {{1,2},{2,3}};
		int c[][] = new int[a.length][a.length];
		int temp[]=new int[0];
		int count=0;
		int res=0;
		System.out.println("***A***");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("***B***");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("***RESULT****");
		int j=0;
		
		for(int i=0; i<a.length; i++) {
			count=0;
			
			for(int k =0; k<b.length; k++) {
				res = 0;
			for(j=0; j<a.length; j++) {
		      res=res+(a[i][j])*(b[j][count]);
				
				
			}
			count++;
			System.out.print(res + " ");
			}
			System.out.println();
		}
		

	}

}
