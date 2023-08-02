package AtividadeExtra;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float salBruto,adicionalNotu,horaExtra,Desconto,salLiquido;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o salario bruto: ");
		salBruto = leia.nextFloat();
		System.out.println("Digite os adiocionais noturnos: ");
		adicionalNotu = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		horaExtra = leia.nextFloat();
		System.out.println("Digite o Desconto ");
		Desconto = leia.nextFloat();
		salLiquido = salBruto + adicionalNotu + (horaExtra*5) - Desconto;
		
		System.out.println(salLiquido);
	}

}
