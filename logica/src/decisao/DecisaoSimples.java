package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase ();
		Float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		Float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		float media = (nota1 + nota2 /2);
		
		if (media>= 6) {
			System.out.println("Parab?ns !!!!");
		}
		
		if (media< 4) {
			System.out.println("Reprovado !!!!");
			
		}
	}
	
	
	
	
	
	
}
