package studio7;

public class Die {
	private int n;
	
	public Die (int number) {
		n = number;
	}
	
	public static int roll(int n) {
		 return ((int)(Math.random()*n)) + 1;
	}

	public static void main(String[] args) {
		int num = 12;
		System.out.println(roll(num));

	}

}
