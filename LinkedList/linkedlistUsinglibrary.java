package LinkedList;
import java.util.*;

public class linkedlistUsinglibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list = new LinkedList<String>();
list.addFirst("a");
list.addFirst("b");
System.out.println(list);
list.addLast("c");
System.out.println(list);
for(int i=0;i<list.size();i++) {
	System.out.print(list.get(i) +"->");
}
System.out.println("null");
list.remove(1);
System.out.println(list);
	}

}
