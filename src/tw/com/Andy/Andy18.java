package tw.com.Andy;

public class Andy18 {

	public static void main(String[] args) {
		Brad201 obj1 = new Brad201(2);
//		建構一個名為 Brad201 的物件實體
		System.out.println(obj1.toString());
		Brad202 obj2 = new Brad202();
	}

}

//JAVA可以在類別內新增類別，但只能有一個主類別 public 

class Brad201 {
//	敘述句首句都一定是在幫建構句初始化
//	現在才開始編寫建構式
//	JAVA 所有的class都有建構式，如果沒寫就會將父類別未傳參數的值拿來用
//	JAVA的所有物件要存在都必須要做初始化
//	建構式本身沒有辦法繼承
	Brad201(int a){
		System.out.println("Brad201()");
	}
}
class Brad202 extends Brad201{

	Brad202() {
// 使用super使父類別初始化
		super(3);
		System.out.println("Brad202()");

	}
	
}