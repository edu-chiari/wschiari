package decisao;

import javax.swing.JOptionPane;

public class Exercicio1java {

	public static void main(String[] args) {
		
		/*
		 * Exercicio 1:
		 * Solicite dois valores e um operador matemático (+, -, / ou *)
		 * Dependendendo do operador que foi digitado realize o calculo e exiba o resultado
		 * Dica.: Se utilizar String a comparação de String deve ser:
		 * if (variavel.equals("valorasercomparado")){
		 *  
		 */
		
		Double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor1"));
		Double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor2"));
		char operador = JOptionPane.showInputDialog("Digite um Operador").charAt(0);
		
		if (operador=='*') {
			System.out.println("Resultado: " + (valor1*valor2));
		}else if (operador=='/') {
				if (valor2 !=0) {
					System.out.println("Resultado: " + (valor1/valor2));
				}else {
					System.out.println("Divisão não pode ser realizada!");
				}
		}else if (operador=='+') {
			System.out.println("Resultado: " + (valor1+valor2));
		}
		
		else if (operador=='-') {
			System.out.println("Resultado: " + (valor1-valor2));
		}else {
			System.out.println("Operador invalido");
		}
					
		
		
	}
}
