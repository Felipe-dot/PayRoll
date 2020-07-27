package payRollProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends IU {

	public static void main(String[] args) {

		int cont =0,loop = 0;
		Scanner teclado = new Scanner(System.in);
		ArrayList<Empregado> listaDeFuncionario = new ArrayList<Empregado>();
		ArrayList<Bonus> listaDeBonus = new ArrayList<Bonus>();
		
		do{
			menuInicial();	
			try {	
				cont = Integer.valueOf(teclado.nextLine());
			} catch (NumberFormatException exception) {
				System.err.println("Digite um numero por favor!");
			}
			
			switch(cont) { 
			case 1:
				cadastrarFuncionario(listaDeFuncionario, listaDeBonus);
				System.out.println("\n");
				break;
			case 2:
				if(loop == 0) {
					System.out.println("nenhum funcionario cadastrado");
					break;
				}
				removerFuncionario(listaDeFuncionario);
				System.out.println("\n");
				break;
			case 3:
				if(loop == 0) {
					System.out.println("nenhum funcionario cadastrado");
					break;
				}
				atualizarFuncionario(listaDeFuncionario,listaDeBonus);
				System.out.println("\n");
				break;
		
			case 4:
				exibirFolha(listaDeFuncionario);
				System.out.println("\n");
				break;
			}
			
			loop++;			
		}while(cont != 5);	
		
		teclado.close();
	}

}
