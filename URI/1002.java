import java.util.Scanner;

public class Main{
	
	static final double n = 3.14159;
	
    public static void main(String[] args){
        double raio;
        Scanner scanner = new Scanner(System.in);
        raio = scanner.nextDouble();
        scanner.close();
        System.out.printf("A=%.4f\n", n * Math.pow(raio,2));
    }
}