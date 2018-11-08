import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int imput = scanner.nextInt();
		scanner.close();
		System.out.printf("%d minutos\n",2*imput);
	}	
}