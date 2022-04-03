public class Static {
	static int x = 20;
	static int y;
	
	static void func(int z) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	 }
	
	static {
	      System.out.println("Running static initialization block.");
	      y = x + 3;
	 }
	public static void main(String args[]) {
	      func(10);
	 }
}
