package telefonia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos-100)* 2.0;
		}
		
		System.out.printf("O valor da conta é R$ %.2f%n",conta);
		
		sc.close();
		
		
	}

}
