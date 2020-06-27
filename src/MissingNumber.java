import java.util.Scanner;

public final class MissingNumber {

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final long n = scanner.nextLong();
		long s = 0;
		for (int i = 1; i < n; i++) {
			final long a = scanner.nextLong();
			s += a;
			System.out.println(s);
		}
		System.out.println(n * (n + 1) / 2 - s);
	}
}
