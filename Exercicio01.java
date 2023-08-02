package AtividadeExtra;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float salario,abono,salarioNovo;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salario");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono");
		abono = leia.nextFloat();
		
		salarioNovo= salario+abono;
		System.out.println("Novo Salario " + salarioNovo);
		
		
		
		
		

	}

}
