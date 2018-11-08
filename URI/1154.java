import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int value;
		int media=0;
		int cont =0;
		do {
			value = scanner.nextInt();
			if(value>=0) {
				media+=value;
				cont++;
			}
		} while(value >= 0);
		scanner.close();
		if(cont == 0) {
			System.out.printf("%.2f\n",0);
		}else {
			System.out.printf("%.2f\n",(float)media/cont);
		}	
	}
}