package tw.com.Andy; 

public class Andy09_3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52];
		boolean isRepeat = false;
		int temp;
		for(int i = 0;i<poker.length;i++) {
			do {
			 temp = (int)(Math.random()*52)+1;
			
			//檢查機制
			isRepeat = false;
			for(int j =0; j < i; j++) {
				if(temp == poker[j]) {
					isRepeat = true;
					break;
					}
				}
			}while(isRepeat);
			poker[i] = temp;
			System.out.println(poker[i]);
		}
		System.out.println("------------");
		System.out.println(System.currentTimeMillis() - start);
	}

}
