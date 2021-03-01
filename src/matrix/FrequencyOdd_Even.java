package matrix;

public class FrequencyOdd_Even {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int count=0;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j]=count++;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int even =0;
		int odd=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i][j]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}

}
