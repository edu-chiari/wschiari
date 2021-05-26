package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	
	/*
	 * Tipos primitivos (Todos aqueles que come�am com a letra minuscula)
	 * boolean = l�gico (True/False)
	 * char = um caracter entre ap�strofos 
	 * byte = -127 / +128
	 * short = -32 mil / + 32 mil
	 * int = -2 trilhoes / + 2 trilhoes
	 * long = (-) quintilhoes / (+) quintilhoes
	 * float = at� 5 casas decimais
	 * double = acima de 5 casas decimais
	 * 
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Capturar:
		 * nome do produto
		 * quantidade do produto
		 * valor unitario
		 * 
		 * exibir no final
		 * nome do produto
		 * valor total
		 * valor total do produto com imposto de 17% sobre o valor total
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o nome do produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
		//double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor unitario do produto"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual valor unitario do produto"));
		//double total = quantidade * valor;
		float total = quantidade * valor;
		//double imposto = (total * 0.17) + total;
		float imposto = total* (float) 0.17 + total;

		
		System.out.println("nome...: " + nome);
		System.out.println("quantidade...: " + quantidade);
		System.out.println("total...:" +total);
		System.out.println("total com imposto...:" + imposto);
		
	}

}
