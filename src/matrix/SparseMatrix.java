package matrix;

public class SparseMatrix {

	public static void main(String[] args) {
	int a[][] =  {{1,5,0,},{5,1,0}};
	
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a.length; j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
	int col = a[0].length;
	int row = a.length;
	
	int countZero=0;
	int countNonZero=0;
	
	for(int i=0; i<row; i++) {
		for(int j=0; j<col; j++) {
			if(a[i][j]==0) {
				countZero =countZero +1;
			}else {
				countNonZero++;
			}
		}
		
	}
	
	if(countZero>countNonZero) {
		System.out.println("Given Martix is Sparse : " + countZero + " are Zero's");
	}else {
		System.out.println("Given Matrix is not Sparse : " + countNonZero + " : are non zero's");
	}
}
}