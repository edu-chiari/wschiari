package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/*
		 * Exercicio 3
		 * Solicite ao usuário (enquanto ele quiser) o cargo e o salario do cargo
		 * No final, exiba:
		 * Total de salarios
		 * média
		 * o maior valor entre todos os salarios digitados com o cargo
		 * 
		 */
		
		String cargo = "";
		float salario =0;
		float total=0;
		int qtdeCargos=0;
		float maiorSalario=0;
		String maiorCargo="";
		do {
			cargo = JOptionPane.showInputDialog("Cargo");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
			total+=salario; // total = total + salario;
			qtdeCargos++;
			if (salario>maiorSalario) {
				maiorSalario=salario;
				maiorCargo=cargo;
			}	
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println("Total de Salarios: " + total);
		System.out.println("Média: "+ (total/qtdeCargos));
		System.out.println("O cargo " + maiorCargo 
				+ " possui o maior salário com o valor de " + maiorSalario);
		
		
	}

}
