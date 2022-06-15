package ArrayList;
import java.util.*;
public class ArrayListImplementation {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// TODO Auto-generated method stub
list.add(0);
list.add(8);
list.add(5);
System.out.println(list);
int element =  list.get(1);
System.out.println(element);

//adding elements in between of the list
list.add(1, 3);
System.out.println(list.get(1));
System.out.println(list);

//to replace elements
list.set(0, 9);
System.out.println(list);

//list.remove();
//list.size();

//printing arrayList using loops
for(int i=0;i<list.size();i++) {
	System.out.print(list.get(i));
}
System.out.println();
//sorting
Collections.sort(list);
System.out.print(list);
	}
	

	
	
	

}
