import java.util.Scanner;
public class Exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int fat = 1;
		for(int i = 1; i <= n; i++) { // fatorial de N
			fat = fat * i;
		}
		System.out.println(fat);
		
		
		
		sc.close();
	}

}
