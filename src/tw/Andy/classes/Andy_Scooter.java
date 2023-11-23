package tw.Andy.classes;

public class Andy_Scooter extends Andy_bike{
	// extends 繼承
	private int gear;
	private String color;
	//物件屬性不會幫忙自動初始化
	
	public Andy_Scooter() {
		color = "black";
		// 
	}
	
	public Andy_Scooter(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// 預設是 0
	public void upSpeed() {
		if(gear > 0) {
			speed = speed < 1 ? 1 : speed * 1.7;
		}
	}
	
	public void upSpeed(double args) {
		if(args > 0 && args < 1) {
		speed = speed < 1 ? 1 : speed * (1+args) * gear;
		}
	}
	
	//覆寫 Override 在直系父系修改
	//覆載 Overload 同個類別當中更改的參數、型別
	
	public boolean changeGear(int gear) {
		if(gear >= 0 && gear <= 4) {
			this.gear = gear;
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return color + ":" + gear + ":" + speed;
	}
}
