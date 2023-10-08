import java.util.Locale;
import java.util.Scanner;
public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("Divisão ompossível");
			}else {
				double soma = (double) x / y; // Aqui foi colocado o (double) para transformar as variaveis inteiras X e Y em double para retornar o valor correto
				System.out.println(soma);
			}
			
		}
		
		sc.close();
	}

}
