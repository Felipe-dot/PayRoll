package payRollProject;

import java.util.Scanner;

public class IU {
	
	public static void menuInicial() {
		System.out.println("==========MENU===========");
		System.out.println("=========Digite==========");
		System.out.println("[1] Cadastrar funcionário");
		System.out.println("[2] Remover funcionário");
		System.out.println("[3] atualizar funcionário");
		System.out.println("[4] exibir folha de pagamento");
		System.out.println("[5] Sair");
		System.out.println("===========================");
	}
	
	public static String subMenuFuncionario() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do empregado");
		String nome = teclado.nextLine();
	
		
		return nome;
	}
	
	public static int subMenuFuncionario1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o cargo dele, digite");
		System.out.println("[1] Funcionário");
		System.out.println("[2] Gerente");
		int aux = Integer.valueOf(teclado.nextLine());
		
		
		return aux;
	}
	
	public static String subMenuGratificacoes() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("O empregado teve um bom desempenho?");
		System.out.println("Sim ou nao");
		String simOuNao = teclado.nextLine();
	
		
		return simOuNao;
	}
	
	public static String subMenuGratificacoes1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Fez horas extras? Sim ou Nao");
		String simOuNao = teclado.nextLine();
		
		
		return simOuNao;
	}
	
	public static String fezHorasExtras() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que dia da semana vc fez hora extra ?");
		String diaDaSemana = teclado.nextLine();
		
		
		return diaDaSemana;
	}
	
	public static int fezHorasExtras1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas horas extras você trabalhou ?");
		int aux = Integer.valueOf(teclado.nextLine());
		
		
		return aux;
	}
}
