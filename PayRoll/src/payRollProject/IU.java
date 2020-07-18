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
			}else {}

			String escolha;
			do {
				String fezBonus = subMenuGratificacoes1();
					if(fezBonus.toLowerCase().equals("sim")) {
						String diaDaSemana = fezHorasExtras();
						int QtdeHorasExtras = fezHorasExtras1();
						listaDeBonus.add(new HorasExtras(2500.00,diaDaSemana,QtdeHorasExtras));
	
					}else if(fezBonus.toLowerCase().equals("nao")) {
						
					}
	
					System.out.print("Fez mais alguma hora extra SIM ou NÃO");
					escolha = teclado.nextLine();

			}while( escolha.toLowerCase().equals("sim"));


			listaDeFuncionario.add(new Funcionario(nome, 2500.00, "Funcionário",listaDeBonus));

		}else if(aux == 2) {
			String melhorDoMes = subMenuGratificacoes();
			if(melhorDoMes.toLowerCase().equals("sim")) {
				listaDeBonus.add(new Desempenho(4000.00)) ;
			}else {}
			
			String fezBonus = subMenuGratificacoes1();
			String escolha;
			
			do {
				if( fezBonus.toLowerCase().equals("sim") ) {
					String diaDaSemana = fezHorasExtras();
					int QtdeHorasExtras = fezHorasExtras1();
					listaDeBonus.add(new HorasExtras(4000.00,diaDaSemana,QtdeHorasExtras));
				}else if(fezBonus == "nao" ) {}

				
				System.out.print("Fez mais alguma hora extra SIM ou NÃO");
				escolha = teclado.nextLine();
			}while(escolha.toLowerCase().equals("sim") );

			listaDeFuncionario.add(new Gerente(nome,4000.00,"Gerente",listaDeBonus));			
		}

	}

	protected static void removerFuncionario(ArrayList<Empregado> listaDeFuncionario) {
		int aux = 0;
		//Exibir a lista
		for(Empregado empregado: listaDeFuncionario) {
			System.out.println("|"+aux+"|" + empregado.getNome());
			aux++;
		}

		System.out.println("Qual funcionario você quer remover ?");
		int posicao = Integer.valueOf(teclado.nextLine());
		listaDeFuncionario.remove(posicao);
	}
	
	protected static void atualizarFuncionario(ArrayList<Empregado> listaDeFuncionario) {
	
		int aux = 0;
		//Exibir a lista
		for(Empregado empregado: listaDeFuncionario) {
			System.out.println("|"+aux+"|" + empregado.getNome());
			aux++;
		}
		System.out.println("Qual funcionario você quer atualizar ?");
		int posicao = Integer.valueOf(teclado.nextLine());
		

	}
	
	protected static void exibirFolha(ArrayList<Empregado> listaDeFuncionario) {	
		System.out.println("Nome   Cargo    Salario.Base   Qtde.Gratificações  Valor das Gratificações  Vencimento Mensal");
		for(Empregado empregado: listaDeFuncionario) {
			System.out.println(empregado.getNome() 
					+ " " 
					+ empregado.getCargo() 
					+ " " 
					+ empregado.getSalarioBase()
					+ " "
				    + empregado.getListaDeBonus().size()
				    + " " 
				    + empregado.getValorDosBonus()
				    + ""
				    + empregado.getSalarioFinal());
		}

	}
	
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

		System.out.println("Digite o nome do empregado");
		String nome = teclado.nextLine();
	
		
		return nome;
	}
	
	public static int subMenuFuncionario1() {
		
		System.out.println("Qual o cargo dele, digite");
		System.out.println("[1] Funcionário");
		System.out.println("[2] Gerente");
		int aux = Integer.valueOf(teclado.nextLine());
		
		
		return aux;
	}
	
	public static String subMenuGratificacoes() {
		System.out.println("O empregado teve um bom desempenho?");
		System.out.println("Sim ou nao");
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
	
	public static int fezHorasExtras1() {
		System.out.println("Quantas horas extras você trabalhou ?");
		int aux = Integer.valueOf(teclado.nextLine());
			
		return aux;
	}
}
