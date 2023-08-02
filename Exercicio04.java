package AtividadeExtra;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		float n1,n2,n3,n4,res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo numero");
		n2 = leia.nextFloat();
		System.out.println("Digite o terceiro numero");
		n3 = leia.nextFloat();
		System.out.println("Digite o quarto numero");
		n4 = leia.nextFloat();
		
		res = (n1*n2)-(n3*n4);
		
		System.out.println("Diferença: "+res);
		
	}

}
