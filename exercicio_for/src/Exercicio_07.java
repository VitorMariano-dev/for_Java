import java.util.Scanner;
public class Exercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int primeiro = i;
			int segundo = i * i; // quadrado = n²
			int terceiro = i * i * i; // cubo = n³
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro); // %d = num inteiro
		}
		
		
		sc.close();
	}

}
