package payRollProject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestesFolhaDePagamento {

	ArrayList<Empregado> listaDeFuncionario;
	ArrayList<Bonus> listaDeBonus;
	Empregado funcionario;
	Empregado gerente;
	
	@Before
	public void inicializandoAFolha() {
		listaDeFuncionario = new ArrayList<Empregado>();
		listaDeBonus = new ArrayList<Bonus>();
		funcionario = new Funcionario("testeFuncionario",2500,"Funcionario",listaDeBonus);
		gerente = new Gerente("testeGerente",2500,"Gerente",listaDeBonus);
		
	}
	
	
	@Test
	public void testeSeTenhoUmaListaDeFuncionario() {
		
		boolean resultado = listaDeFuncionario != null;
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeSeTenhoUmaListadeBonus() {
		
		boolean resultado = listaDeBonus != null;
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeSeTenhoUmFuncionario() {
	
		boolean resultado = funcionario != null;
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeSeTenhoUmGerente() {
		
		boolean resultado = gerente != null;
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeCadastarFuncionario() {
		listaDeFuncionario.add(funcionario);
		
		boolean resultado = listaDeFuncionario.get(0).equals(funcionario);
		
		assertTrue(resultado);
		
	}
	
	@Test
	public void testeCadastarGerente() {
		listaDeFuncionario.add(gerente);
		
		boolean resultado = listaDeFuncionario.get(0).equals(gerente);
		
		assertTrue(resultado);
		
	}
	
	@Test
	(expected = IndexOutOfBoundsException.class)
	public void testeRemoverFuncionario() {
		listaDeFuncionario.add(funcionario);
		listaDeFuncionario.remove(0);
		listaDeFuncionario.get(0);
	}
	
	@Test
	public void testeAtualizarFuncionario() {
		listaDeFuncionario.add(gerente);
		Empregado test = new Funcionario("Lucas",2500,"Funcionario",listaDeBonus);
		listaDeFuncionario.set(0, test);
		
		boolean resultado = listaDeFuncionario.get(0).equals(test);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeCadastrarGratificacoes() {
		Bonus bonus = new HorasExtras(4000.00, "Quinta", 3);
		
		listaDeBonus.add(bonus);
		
		boolean resultado = listaDeBonus.get(0).equals(bonus);
		
		assertTrue(resultado);
		
	}
	
	@Test
	public void testeCalculoSalarioFinal() {
		Bonus bonus = new HorasExtras(4000.00, "Quinta", 3);
		
		listaDeBonus.add(bonus);
		
		listaDeFuncionario.add(new Gerente("nome", 4000.00,"Gerente", listaDeBonus));
		
		boolean resultado = listaDeFuncionario.get(0).getSalarioFinal().equals(4012.00);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeValorDasGratificacoes() {
		Bonus bonus = new HorasExtras(4000.00, "Quinta", 3);
		
		listaDeBonus.add(bonus);
		
		listaDeFuncionario.add(new Gerente("nome", 4000.00,"Gerente", listaDeBonus));
		
		boolean resultado = listaDeFuncionario.get(0).getValorDosBonus().equals(12.00);
		
		assertTrue(resultado);
	}	
	
	
}
