package tw.com.Andy;

public class Andy05 {

	public static void main(String[] args) {
		int a = 3;
		switch(a) { //只能是byte,short,int,char,String,Enum 
		case 1,3,5: //可以多重比較
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break;
		case 100:
//觀念：假設變數宣告用的是較小的型別，比如說byte，則case要注意不要超過範圍
			System.out.println("C"); 
			break;
		default:
			System.out.println("X");
		}
//		複習：不加break則在執行之後繼續往下執行
	}

}
