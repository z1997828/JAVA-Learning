package tw.com.Andy;

public class Andy07_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int START = 1;
		final int ROWS = 3;
		final int COLS = 4;
				
		
		for(int k=0;k<ROWS;k++) {
			for(int j=1;j<10;j++) {
				for(int i=START;i<START+COLS;i++) {
					int newi = i + k * COLS;
					int r = newi * j;
					System.out.printf("%d x %d = %d\t",newi,j,r);
				}
				System.out.println();  // 拿來換行用
			}
			System.out.println("------------------");
		}
	}

}
