package java_demo2;

import org.junit.Test;

public class Demo01 {
	/*
	 *方法：
	 *1、访问控制修饰词
	 *2、返回值类型
	 *3、方法名
	 *4、参数列表
	 *5、方法体
	 */
	public static void main(String[] args) {
		User user = new User(10,"li");
		user.id = 10;
		
		int s = sum(10,20);
		System.out.println("s = "+s);
		System.out.println(sum(10,20));
	}
	
	private static int sum(int a,int b){
		return a+b;
	}
	
	
	
	@Test
	public void f(){
		System.out.println("test");
	}
	
	
	
	

}
