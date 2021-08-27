package triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		double lado1, lado2, lado3;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado: ");
		lado1 = leitor.nextDouble();
		System.out.print("Digite o segundo lado: ");
		lado2 = leitor.nextDouble();
		System.out.print("Digite o terceiro lado: ");
		lado3 = leitor.nextDouble();
		leitor.close();
		
		if(lado1 + lado2 < lado3 && lado2 + lado3 < lado1 && lado1 + lado3 < lado2) {
			System.out.println("Os valores digitados n�o resultam em um tri�ngulo!");
		} else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("Este tri�ngulo � Equil�tero!");
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Este tri�ngulo � Is�sceles!");
		} else {
			System.out.println("Este tri�ngulo � Escaleno!");
		}

	}

}
