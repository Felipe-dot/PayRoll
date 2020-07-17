package payRollProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends IU {

	public static void main(String[] args) {

		int cont,loop = 0;
		Scanner teclado = new Scanner(System.in);
		ArrayList<Empregado> listaDeFuncionario = new ArrayList<Empregado>();
		ArrayList<Bonus> listaDeBonus = new ArrayList<Bonus>();
		do{
			menuInicial();
			cont = Integer.valueOf(teclado.nextLine());
			switch(cont) { 
			case 1:
				cadastrarFuncionario(listaDeFuncionario, listaDeBonus);
				System.out.println("\n\n");
				break;
			case 2:
				if(loop == 0) {
					System.out.println("nenhum funcionario cadastrado");
					break;
				}
				removerFuncionario(listaDeFuncionario);
				System.out.println("\n\n");
				break;
			case 3:
				atualizarFuncionario(listaDeFuncionario);
				System.out.println("\n\n");
				break;
			case 4:
				exibirFolha(listaDeFuncionario);
				System.out.println("\n\n ");
				break;
			}
			loop++;
		}while(cont != 5);	

	}

	private static void cadastrarFuncionario(ArrayList<Empregado> listaDeFuncionario, ArrayList<Bonus> listaDeBonus) {

		Scanner teclado = new Scanner(System.in);
		String nome = subMenuFuncionario();
		int aux = subMenuFuncionario1();

		if(aux == 1) {
			String melhorDoMes = subMenuGratificacoes();
			if(melhorDoMes == "Sim" || melhorDoMes == "sim" || melhorDoMes == "SIM") {
				listaDeBonus.add(new Desempenho(2500.00));
			}else {}

			String escolha;
			do {
				String fezBonus = subMenuGratificacoes1();
					if(fezBonus == "Sim" || fezBonus == "sim" || fezBonus == "SIM") {
						String diaDaSemana = fezHorasExtras();
						int QtdeHorasExtras = fezHorasExtras1();
						listaDeBonus.add(new HorasExtras(2500.00,diaDaSemana,QtdeHorasExtras));
	
					}else if(fezBonus == "Não" || fezBonus == "não" || fezBonus == "nao") {
						
					}
	
					System.out.print("Fez mais alguma hora extra SIM ou NÃO");
					escolha = teclado.nextLine();

			}while(escolha == "SIM" || escolha == "sim" || escolha == "Sim");


			listaDeFuncionario.add(new Funcionario(nome, 2500.00, "Funcionário",listaDeBonus));

		}else if(aux == 2) {
			String melhorDoMes = subMenuGratificacoes();
			if(melhorDoMes == "Sim" || melhorDoMes == "sim" || melhorDoMes == "SIM") {
				listaDeBonus.add(new Desempenho(4000.00)) ;
			}else {}
			
			String fezBonus = subMenuGratificacoes1();
			String escolha;
			
			do {
				if(fezBonus == "Sim" || fezBonus == "sim" || fezBonus == "SIM") {
					String diaDaSemana = fezHorasExtras();
					int QtdeHorasExtras = fezHorasExtras1();
					listaDeBonus.add(new HorasExtras(4000.00,diaDaSemana,QtdeHorasExtras));
				}else if(fezBonus == "Não" || fezBonus == "não" || fezBonus == "nao") {}

				
				System.out.print("Fez mais alguma hora extra SIM ou NÃO");
				escolha = teclado.nextLine();
			}while(escolha == "SIM" || escolha == "sim" || escolha == "Sim");

			listaDeFuncionario.add(new Gerente(nome,4000.00,"Gerente",listaDeBonus));			
		}

	}

	private static void removerFuncionario(ArrayList<Empregado> listaDeFuncionario) {
		Scanner teclado = new Scanner(System.in);
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
	
	private static void atualizarFuncionario(ArrayList<Empregado> listaDeFuncionario) {
		Scanner teclado = new Scanner(System.in);
		int aux = 0;
		//Exibir a lista
		for(Empregado empregado: listaDeFuncionario) {
			System.out.println("|"+aux+"|" + empregado.getNome());
			aux++;
		}
		System.out.println("Qual funcionario você quer atualizar ?");
		int posicao = Integer.valueOf(teclado.nextLine());
		

	}
	
	private static void exibirFolha(ArrayList<Empregado> listaDeFuncionario) {	
		System.out.println("Nome   Cargo    Salario.Base   Qtde.Gratificações  Valor das Gratificações  Vencimento Mensal");
		for(Empregado empregado: listaDeFuncionario) {
			System.out.println(empregado.getNome() 
					+ " " 
					+ empregado.getCargo() 
					+ " " 
					+ empregado.getSalarioBase()
					+ " "
				    + empregado.getListaDeBonus().size());
		}

	}

}
