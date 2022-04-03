public class SumTest {
	public static void main(String a[]) {
		int sum = 0;
		int invalid = 0;
			for(int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
				try {
					sum += Integer.parseInt(a[i]);
				} catch (NumberFormatException e) {
					invalid++;
				}
			}
		System.out.println("Total no of arguements are : " + a.length);
		System.out.println("Invalid arguements : " + invalid);
		System.out.println("Sum : " + sum);
	}
}
