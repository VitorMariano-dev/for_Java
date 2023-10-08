import java.util.Scanner;
public class Exercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				
				// ele faz a divisão e se o resultado for igual a 0 ele pega o multiplicador
				// a todo momento ele divide pelo I 
				
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
