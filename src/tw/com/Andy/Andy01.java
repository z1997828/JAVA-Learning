package tw.com.Andy;

public class Andy01 {

	public static void main(String[] args) {
		// byte, short,int,long 代表整數，有正負值	
		// byte 2^8 => 256 => -128~127
		byte var1 = 0; //命名規則[a-z A-Z $_][a-zA-Z0-9$_] (首字不可以用數字)
		byte $$$, $_$ = 123, 變數 = -12;
		System.out.println($_$);
		System.out.println(變數);
		System.out.println(var1);
		//觀念：未給值的變數是尚未初始化的，無法被編譯
		// short 2^16 => 65536 => -32768 ~ 32767
		// int 2^32 =>42E9 常用變數
		// long 2^64
		
		byte var2 = 2, var3 = 1;
		int var4 = var2 + var3;
		System.out.println(var4);
		// 計算時會把數字放到 int 中，塞不進 byte 
		
		byte a = 127;
		a++;// ++ +=這類型的原理和加減乘除不同
		System.out.println(a);
		
		
		
		
		
		
	}

}
