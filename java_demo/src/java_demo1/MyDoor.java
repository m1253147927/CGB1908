package java_demo1;

public class MyDoor extends Door {
 
		String material;
	public MyDoor(int width, int height,String material) {
		super(width, height);
		this.material=material;
	}
	
	@Override
	public String toString() {
		return "MyDoor [material=" + material + "]";
	}

	public static void main(String[] args) {
		MyDoor md = new MyDoor(1,2,"wood");
	}
}
