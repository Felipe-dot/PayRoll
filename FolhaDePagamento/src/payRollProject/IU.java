package payRollProject;

import java.util.ArrayList;
import java.util.Scanner;


public class IU {

	static Scanner teclado = new Scanner(System.in);

	protected static void cadastrarFuncionario(ArrayList<Empregado> listaDeFuncionario, ArrayList<Bonus> listaDeBonus) {

		String nome = subMenuFuncionario();
		int aux = subMenuFuncionario1();

		if(aux == 1) {
			String melhorDoMes = subMenuGratificacoes();
			
			if(melhorDoMes.toLowerCase().equals("sim")) {
				listaDeBonus.add(new Desempenho(2500.00));
			}

			String escolha;
			String fezBonus = subMenuGratificacoes1();
			if(fezBonus.toLowerCase().equals("sim")) {
				do {
					String diaDaSemana = fezHorasExtras();
					int QtdeHorasExtras = quantasHorasExtras();
					listaDeBonus.add(new HorasExtras(2500.00,diaDaSemana,QtdeHorasExtras));

					System.out.print("Fez mais alguma hora extra sim ou nao");
					escolha = teclado.nextLine();

				}while(escolha.toLowerCase().equals("sim"));

			}else if(fezBonus.toLowerCase().equals("nao")){}

			listaDeFuncionario.add(new Funcionario(nome, 2500.00, "Funcionario",listaDeBonus));

		}else if(aux == 2) {
			String melhorDoMes = subMenuGratificacoes();
			if(melhorDoMes.toLowerCase().equals("sim")) {
				listaDeBonus.add(new Desempenho(4000.00)) ;
			}else {}

			String fezBonus = subMenuGratificacoes1();
			String escolha;
			if( fezBonus.toLowerCase().equals("sim") ) { 
				do {
					String diaDaSemana = fezHorasExtras();
					int QtdeHorasExtras = quantasHorasExtras();
					listaDeBonus.add(new HorasExtras(4000.00,diaDaSemana,QtdeHorasExtras));
					
					System.out.println("Fez mais alguma hora extra sim ou nao");
					escolha = teclado.nextLine();
				}while(escolha.toLowerCase().equals("sim") );
				
			}else if(fezBonus.toLowerCase().equals("nao")) {}

			listaDeFuncionario.add(new Gerente(nome,4000.00,"Gerente",listaDeBonus));			
		}	
	}
	
	protected static void cadastrarFuncionario(ArrayList<Empregado> listaDeFuncionario, ArrayList<Bonus> listaDeBonus, int posicao) {

		String nome = subMenuFuncionario();
		int aux = subMenuFuncionario1();
	
		if(aux == 1) {
			String melhorDoMes = subMenuGratificacoes();
			if(melhorDoMes.toLowerCase().equals("sim")) {
				listaDeBonus.add(new Desempenho(2500.00));
			}

			String escolha;
			String fezBonus = subMenuGratificacoes1();
			if(fezBonus.toLowerCase().equals("sim")) {
				do {
					String diaDaSemana = fezHorasExtras();
					int QtdeHorasExtras = quantasHorasExtras();
					listaDeBonus.add(new HorasExtras(2500.00,diaDaSemana,QtdeHorasExtras));

					System.out.print("Fez mais alguma hora extra sim ou nao");
					escolha = teclado.nextLine();

				}while(escolha.toLowerCase().equals("sim"));

			}else if(fezBonus.toLowerCase().equals("nao")){}

			listaDeFuncionario.set(posicao,new Funcionario(nome, 2500.00, "Funcionario",listaDeBonus));

		}else if(aux == 2) {
			
			String melhorDoMes = subMenuGratificacoes();
			if(melhorDoMes.toLowerCase().equals("sim")) {
				listaDeBonus.add(new Desempenho(4000.00)) ;
			}

			String fezBonus = subMenuGratificacoes1();
			String escolha;
			if( fezBonus.toLowerCase().equals("sim") ) { 
				do {
					String diaDaSemana = fezHorasExtras();
					int QtdeHorasExtras = quantasHorasExtras();
					listaDeBonus.add(new HorasExtras(4000.00,diaDaSemana,QtdeHorasExtras));
					
					System.out.println("Fez mais alguma hora extra sim ou nao");
					escolha = teclado.nextLine();
				}while(escolha.toLowerCase().equals("sim") );
				
			}else if(fezBonus.toLowerCase().equals("nao")) {}

			listaDeFuncionario.set(posicao,new Gerente(nome,4000.00,"Gerente",listaDeBonus));			
		}	
	}

	protected static void removerFuncionario(ArrayList<Empregado> listaDeFuncionario) {
		int posicao = 0;
		//Exibir a lista
		exibirFolha(listaDeFuncionario);
		
		System.out.println("Qual funcionario voce quer remover ?");
		try {
			posicao = Integer.valueOf(teclado.nextLine());
		} catch(NumberFormatException exception) { 
			System.err.println("Digite um numero valido!");
			System.out.println("Qual funcionario voce quer remover ?");
			posicao = Integer.valueOf(teclado.nextLine());
		}
		
		listaDeFuncionario.remove(posicao);
	}

	protected static void atualizarFuncionario(ArrayList<Empregado> listaDeFuncionario, ArrayList<Bonus> listaDeBonus) {

		//Exibir a lista
		int posicao = 0;
		exibirFolha(listaDeFuncionario);
		System.out.println("Qual funcionario voce quer atualizar ?");
		
		try {
			posicao = Integer.valueOf(teclado.nextLine());
		} catch(NumberFormatException exception) {
			System.err.println("Digite um numero valido!");
			System.out.println("Qual funcionario voce quer atualizar ?");
			posicao = Integer.valueOf(teclado.nextLine());
		}
		cadastrarFuncionario(listaDeFuncionario, listaDeBonus, posicao);

	}

	protected static void exibirFolha(ArrayList<Empregado> listaDeFuncionario) {
		int aux = 0;
		System.out.println("Nome   Cargo    Salario.Base   Qtde.Gratificacoes  Valor das Gratificacoes  Vencimento Mensal");
		for(Empregado empregado: listaDeFuncionario) {
			System.out.println("|"+ aux +"|" + empregado.getNome() 
			+ " " 
			+ empregado.getCargo() 
			+ " " 
			+ empregado.getSalarioBase() + "R$"
			+ "\t"	
			+ empregado.getListaDeBonus().size()
			+ "\t\t" 
			+ empregado.getValorDosBonus() + "R$"
			+ "\t\t\t"
			+ empregado.getSalarioFinal() + "R$");
			aux++;
		}
			
	}

	public static void menuInicial() {
		System.out.println("==========MENU===========");
		System.out.println("=========Digite==========");
		System.out.println("[1] Cadastrar funcionario");
		System.out.println("[2] Remover funcionrio");
		System.out.println("[3] atualizar funcionario");
		System.out.println("[4] exibir folha de pagamento");
		System.out.println("[5] Sair");
		System.out.println("===========================");
	}

	public static String subMenuFuncionario() {

		System.out.println("Digite o nome do empregado");
		String nome = teclado.nextLine();

		return nome;
	}

	public static int subMenuFuncionario1() {
		int aux = 0;
		System.out.println("Qual o cargo dele, digite");
		System.out.println("[1] Funcionario");
		System.out.println("[2] Gerente");
		try {
			 aux = Integer.valueOf(teclado.nextLine());	
		} catch (NumberFormatException exception){
			System.err.println("Digite um numero valido!");
			System.out.println("[1] Funcionario");
			System.out.println("[2] Gerente");
			aux = Integer.valueOf(teclado.nextLine());		
		}
		return aux;
	}

	public static String subMenuGratificacoes() {
		System.out.println("O empregado teve um bom desempenho? Sim ou nao");
		
		String simOuNao = teclado.nextLine();

		return simOuNao.toLowerCase();
	}

	public static String subMenuGratificacoes1() {
		System.out.println("Fez horas extras? Sim ou Nao");
		String simOuNao = teclado.nextLine();

		return simOuNao.toLowerCase();
	}

	public static String fezHorasExtras() {
		System.out.println("Que dia da semana vc fez hora extra ?");
		String diaDaSemana = teclado.nextLine();

		return diaDaSemana;
	}

	public static int quantasHorasExtras() {
		int aux = 0;
		System.out.println("Quantas horas extras voce trabalhou ?");
		try {
			aux = Integer.valueOf(teclado.nextLine());
		}catch(NumberFormatException exception) {
			System.err.println("Digite um numero valido!");
			System.out.println("Quantas horas extras voce trabalhou ?");
			aux = Integer.valueOf(teclado.nextLine());
		}
	
		return aux;
	}
}
