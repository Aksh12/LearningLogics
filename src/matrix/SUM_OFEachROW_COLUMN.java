package matrix;

public class SUM_OFEachROW_COLUMN {

	public static void main(String[] args) {
		int[] []a = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
		for(int i=0; i<a.length; i++) {
			int row=0;
			int col=0;
			
			for(int j=0; j<a.length; j++) {
				row =  row+a[i][j];
				col = col+a[j][i];
			}
			System.out.println("sum of row : " + i + " : " +  row);
			System.out.println("sum of col : " + i + " : " +  col);
			System.out.println("--------");
		}
		

	}

}
