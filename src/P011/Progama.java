package P011;

import java.util.Scanner;

public class Progama {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Seja bem-vindo(a)!");
			System.out.println("Por favor informe os seguintes dados:");
			System.out.println("Seu nome: ");
			String nome = sc.nextLine();
			System.out.println("Sua idade: ");
			int idade = sc.nextInt();
			System.out.println("Seu número de telefone:");
			int nTelefone = sc.nextInt();
			
			Aluguel al01 = new Aluguel(nome, idade, nTelefone);
			
			System.out.println("###############################");
			System.out.println("Agora nos informe as seguintes dados sobre o veículo:");
			System.out.println("Modelo do carro:"); //o print do modelo do carro
			    sc.nextLine();
			String modCarro = sc.nextLine();        // e da placa saem juntos
			System.out.println("Placa do carro:");  // e so recebe um valorkoij0ik
			String placa = sc.nextLine();
			System.out.println("Quantos quilometros foram rodados?");
			float KmR = sc.nextFloat();
			
			al01.carros(modCarro, placa, KmR);
			//teste
			
			
	}

}
