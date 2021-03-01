package matrix;

public class IdentityMatrix {

	public static void main(String[] args) {
		
		int a[][] =  {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		boolean flag = true;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//int j=0;
		for(int i=0; i<a.length; i++) {
			if(flag==false) {
				break;
			}
			
			for(int j=0; j<a.length; j++) {
				if(flag==false) {
					break;
				}
				
				if(i==j && a[i][j]==1) {
					flag=true;
				}
				else if(i>j && a[i][j]==0 || i<j && a[i][j]==0) {
					flag=true;
				}else {
					System.out.println(i + ":" + j + "=" + a[i][j] + "!!!");
					flag=false;
				}
			
			}
			
		}
		if(flag==true) {
			System.out.println("Given matrix is identity matrix");
		}else {
			System.out.println("Given matrix is not an identity matrix");
		}

	

}
}
