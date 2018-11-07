import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();
        System.out.printf("X = %d\n",x+y);
    }
}