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

}
