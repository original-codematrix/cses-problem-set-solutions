import java.util.Scanner;

public final class Repetitions {

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final char[] c = scanner.nextLine().toCharArray();
		int repetition = 0, ans = 1;
		char c1 = 'A';
		for (final char c2 : c) {
			if(c2 == c1) {
				repetition++;
				ans = Math.max(repetition, ans);
			} else {
				repetition = 1;
				c1 = c2;
			}
		}
		System.out.print(ans);
	}
}
