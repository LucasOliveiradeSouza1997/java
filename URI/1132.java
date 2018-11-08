import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int soma =0;
		int i;
		int aux;
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		if(x>y) {
			aux = x;
			x = y;
			y = aux;
		}
		for(i=x;i<=y;i++) {
			if(i % 13 != 0) {
				soma+= i;
			}
		}
		System.out.println(soma);
	}	
}