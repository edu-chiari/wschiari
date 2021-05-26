package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {

		// capture o nome e a idade
		// dependendo da idade apresente as mensagens abaixo
		// seu voto é obrigatório
		// seu voto é facultativo
		// voce não pode votar
		
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
		
		if(idade >= 18 && idade <70) {
			System.out.println(nome + " , seu voto é obrigatório");
		}
		
		if(idade < 16) {
			System.out.println(nome + " , você não pode votar");
			
		if(idade == 16 || idade == 18 || idade == 70) {
			System.out.println(nome + " , seu voto é facultativo");
		
		}
		}
	}
}

