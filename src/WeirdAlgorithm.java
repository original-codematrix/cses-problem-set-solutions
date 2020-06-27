import java.util.Scanner;

public final class WeirdAlgorithm {

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		long i = scanner.nextLong();
		System.out.print(i);
		while(i > 1) {
			if(i % 2 == 0) {
				i /= 2;
			} else {
				i = 3 * i +1;
			}
			System.out.print(" " + i);
		}
	}
}
