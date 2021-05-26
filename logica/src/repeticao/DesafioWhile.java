package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		/*
		 * capturar separadamente dia, mes e ano
		 * Para o dia aceito somente quantidade de dias de acordo com o mes (Fev = 29 dias)
		 *  (para o dia de acordo com o mes)
		 
		 * Para o mes somente ate 12 (entre 1 e 12)
		 * 
		 * Para o ano somente entre o intervalo <2003 e >1920
		 * 
		 * Precisa começar pelo ano para depois mes e dia
		 * 
		 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));		
		
		while (ano <1920 || ano >2003) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		}
		
		while (mes<1 || mes>12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
		}
		
		if (mes == 2) { //mes com 29 dias
			while (dia <1 || mes>29) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			}
			
		}else if(mes==4 || mes==6 || mes==9 || mes==11) {
			while (dia<1 || mes>31) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
		}
		}
		System.out.println("Data: " +dia + "/" +mes + "/" + ano);
	}
	}




