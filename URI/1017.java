import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int spentTime = scanner.nextInt();
		int averageSpeed = scanner.nextInt();
		scanner.close();
		System.out.printf("%.3f\n",spentTime * averageSpeed / 12.0);
	}	
}