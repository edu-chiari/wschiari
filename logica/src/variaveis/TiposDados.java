package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// main ? o start point de uma aplica??o Java
	// ? a chave de igni??o do carro
	public static void main(String[] args) {
		
		// Sintaxe: <Tipo de dado> <nome da variavel> = <dados>
		
		String nome = JOptionPane.showInputDialog("digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("digite a sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso"));
		double imc = peso / (altura * altura);		
		
		// teste simples:
		//String nome = "Eduardo";
		//int idade = 42;
		//double altura = 1.81;
		
		System.out.println("nome...: " + nome);
		System.out.println("idade...: " + idade);
		System.out.println("altura...:" + altura);
		System.out.println("IMC...:" +imc);
		
		/*
		 * Dados (podem ser): 
		 * Alfan?mericos (um texto, parte de um texto, ou um n?mero que n?o ser? utilizado em opera??es matem?ticas
		 * CEP (RH da empresa) = 00100-009 
		 * 
		 * Na linguagem Java: String (sempre com o S maiusculo)
		 * 
		 * 		
		 * N?mericos (representa um dado que PODE ser utilizado em express?es matem?ticas e/ou ? considerado um dado
		 * critico para o contexto
		 * CEP (aplica??o dos correios)
		 * Funcional entre os colaboradores da empresa
		 * 
		 * Na linguagem Java: 
		 * int: usado para representar n?meros inteiros
		 * double: para n?meros reais (com casas decimais)
		 * 
		 */
		
				
		
		
		
		
		
		
	}
		
	// em uma classe encontramos: m?todos e atributos
	// nossa classe ? publica
	
}
