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
			System.out.println("Modelo do carro:");
			    sc.nextLine();
			String modCarro = sc.nextLine();       
			System.out.println("Placa do carro:"); 
			String placa = sc.nextLine();
			System.out.println("Quantos quilometros foram rodados?");
			float KmR = sc.nextFloat();
			System.out.println("Por quantos dias o veículo foi alugado?");
			int DiAlugados = sc.nextInt();
			
			al01.carros(modCarro, placa, KmR, DiAlugados);
			
			System.out.println(al01);
			
			double totalKmR = KmR * 4.5;
			int totaldiaria = DiAlugados * 3;
			double geral = totalKmR + DiAlugados;
			System.out.println("---------------------------------");
			System.out.println("Pela quantidade de dias que o veículo foi alugado, terá de ser pago: R$" +totalKmR);
			System.out.println("Pelo total de quilometros percorridos, terão de ser pagos: R$" +totaldiaria);
			System.out.println("No total o valor a ser pago é: R$" +geral);
        }

	@Override
	public String toString() {
		return "Progama []";
	 }

}
