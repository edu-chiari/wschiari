package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		/*
		 * Miss?o 1
		 * jogador 1 digita um numero inteiro
		 * Jogador 2 deve acertar o numero
		 * quando ele acertar, devera aparecer a mensagem "Parab?ns voc? acertou"
		 * 
		 * Miss?o 2
		 * Acrescente dicas para o jogador 2 informando se o numero ? > ou < o que ele digitou
		 *
		 * Miss?o 3
		 * Acrescente um contador de tentativas que ser? exibido quando o jogador 2 acertar
		 *  A mensagem dever? ser `Parab?ns, voc? acertou com X tentativas"
		 *  Ter? que criar uma variavel para contar
		 *  
		 *  != e => n?o ? igual
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1: Digite um n?mero"));
		int chute=0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2: adivinhe o n?mero"));
			contador=contador+1;
			//contador++;
			//contador+=1
			
			if (chute<numero1) {
				System.out.println("Chutando baixo");
			}else if (chute>numero1) {
				System.out.println("Chutando alto");
			}
		}while (numero1!=chute);
		JOptionPane.showMessageDialog(null, "Parab?ns voc? acertou com " + contador + " tentativas");
					
		//int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2: Tente adivinhar"));
		
			/*
		while (numero1!=numero2) 
			
			
			if (numero1 < numero2) {
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("O N?mero 1 ? menor. Tente novamente"));
			
			}else if (numero1 > numero2) {
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("O N?mero 1 ? maior. Tente novamente"));
		}
		System.out.println("Parab?ns voc? acertou");
		*/
		
	}
}
