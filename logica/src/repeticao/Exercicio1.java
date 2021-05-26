package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 * Exercicio 1
		 * Peça para o usuário digitar o valor da tabuada que ele deseja visualizar
		 * Monte um laço para apresentar a tabuada da seguinte forma:
		 * 
		 * numero x 0 = resultado
		 * numero x 1 = resultado
		 * (...) x 100 = resultado
		 * 
		 */
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da tabuada que deseja"));
		int count = 0;
				
		do {
			count = count+1;

			System.out.println(num1 + " x " + count + " = " + (num1 * count));
			
		}while (count==0 || count<=99);
				
		
	}
}
