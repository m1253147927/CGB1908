package java_demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// Ctrl+Alt+↑  单行或多行复制
		// Ctrl+Shift+F 调整格式
		List<String> list = new ArrayList<String>();
		list.add("你");
		list.add("我");
		list.add("他");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
