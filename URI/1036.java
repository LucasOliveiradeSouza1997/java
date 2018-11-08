import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		scanner.close();
		float discriminante = (float)Math.pow(b,2) - 4 * a * c;
		if(discriminante < 0 || a == 0) {
			System.out.printf("Impossivel calcular\n");
		}else {
			float r1 = (float)(-b + Math.sqrt(discriminante))/(2*a); 
			float r2 = (float)(-b - Math.sqrt(discriminante))/(2*a); 
			System.out.printf("R1 = %.5f\n",r1);
			System.out.printf("R2 = %.5f\n",r2);
		}
	}	
}