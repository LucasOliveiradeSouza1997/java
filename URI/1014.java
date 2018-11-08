import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		float y;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextFloat();
		scanner.close();
		System.out.printf("%.3f km/l\n", x / y);
	}	
}