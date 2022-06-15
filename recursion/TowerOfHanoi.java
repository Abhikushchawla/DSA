package recursion;

public class TowerOfHanoi {
	
	public static void arrange(char from,char to,char helper,int n) {
		if(n==0) {
			return;
		}
		arrange(from,helper,to,n-1);
		System.out.println("Move disk"+n+" "+"from"+" "+from+" "+"to"+" "+to);
		arrange(helper,to,from,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

arrange('A','C','B',4);
	}

}
