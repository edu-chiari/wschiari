package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/* 
		 * Receba o valor do salário bruto, o nome de um colaborador e 
		 * a qtde de faltas.
		 * Se não houver faltas o salario bruto receberá um aumento de 2%.
		 * Calcule o valor do INSS sobre o salário bruto.
		 * Exiba no final o salário bruto, e o salário liquido (retirando
		 * o INSS e 8% do FGTS)
		 *
		 */
		
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase ();
		Float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Salario Bruto: "));
		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Faltas: "));
		float salario = (0);
				
		if (faltas ==0) {
			salarioBruto = salarioBruto * (float) 0.2;
		}
		float inss =0;
		if (salarioBruto<=1100) {
			inss = salarioBruto * (float) 0.07;
		}else if (salarioBruto> 1100 && salarioBruto<=2203.48) {
			inss = salarioBruto * (float) 0.09;
		}else if (salarioBruto> 2203.48 && salarioBruto<=3305.22) {
			inss = salarioBruto * (float) 0.12;
		}else {
			inss = salarioBruto * (float) 0.14;
		}
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Salario Liquido: " + (salarioBruto - inss - salarioBruto*0.08));
		
	}
}
