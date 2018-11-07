import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int values[] = new int[5];
		int i;
		Scanner scanner = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			values[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.printf("%d valor(es) par(es)\n",quantidadePar(values));
		System.out.printf("%d valor(es) impar(es)\n",quantidadeImpar(quantidadePar(values)));
		System.out.printf("%d valor(es) positivo(s)\n",quantidadePositiva(values));
		System.out.printf("%d valor(es) negativo(s)\n",quantidadeNegativa(values));
	}

	public static int quantidadePar(int values[]) {
		int i, totalPares = 0;
		for (i = 0; i < 5; i++) {
			if (values[i] % 2 == 0) {
				totalPares++;
			}
		}
		return totalPares;
	}

	public static int quantidadeImpar(int quantidadePar) {
		return 5 - quantidadePar;
	}

	public static int quantidadePositiva(int values[]) {
		int i, totalPositivos = 0;
   	 	for(i=0;i<5;i++) {
   	 		if(values[i] > 0) {
   	 			totalPositivos++;
   	 		} 
   	 	}
   	 	return totalPositivos;
	}
	public static int quantidadeNegativa(int values[]) {
		int i, totalNegativos = 0;
   	 	for(i=0;i<5;i++) {
   	 		if(values[i] < 0) {
   	 		totalNegativos++;
   	 		} 
   	 	}
   	 	return totalNegativos;
	}
}