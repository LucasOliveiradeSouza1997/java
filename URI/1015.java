import java.util.Scanner;

final class Ponto{
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void distancia(Ponto p2) {
		double distancia = Math.sqrt(Math.pow(p2.getX()- this.x,2) + Math.pow(p2.getY()- this.y,2));
		System.out.printf("%.4f\n",distancia);
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		p1.setX(scanner.nextDouble());
		p1.setY(scanner.nextDouble());
		p2.setX(scanner.nextDouble());
		p2.setY(scanner.nextDouble());
		scanner.close();
		p1.distancia(p2);
	}	
}