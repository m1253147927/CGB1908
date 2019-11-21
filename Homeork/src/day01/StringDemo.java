package day01;

public class StringDemo {
	public static void main(String[] args) {
		String  a= "java";
		a="i love java";
		System.out.println(a);
		
		StringBuilder sb 
		= new StringBuilder("java");
		 sb=sb.append("good");
		 
		 StringBuffer s 
			= new StringBuffer("java");
			 s=s.append("good");
		System.out.println(s);
	}
}
