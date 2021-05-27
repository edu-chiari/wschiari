package br.com.caicaielevador.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;
	
	public String retornarNome() {
		return nome;
	}
	
	public void preencherNome(String param) {
		nome = param;
	}
	
	public void inicializar (int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo=pAndarMax;
		andarMinimo=pAndarMin;
		capacidadePessoas=pCapPessoas;
	}
	
	public String retornarResumo() {
		return
				"Nome: " + nome + "\n" +
				"Andar Atual: " + andarAtual + "\n" +
				"Quantidade de Pessoas: " + qtdePessoas + "\n";
		}
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Subindo";
		}else {
			return "Já está no último andar";
			}
		}
	
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			return "Descendo";
			}
		return "Já está no 1o Andar";
		}
	
	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
			}
		}
	
	public void entrar(int qtd) {
		int resultado = qtdePessoas + qtd;
		if (resultado>capacidadePessoas) {
			qtdePessoas+=qtd;
		}
	}
	
	public void sair(int qtd) {
		int resultado = qtdePessoas = qtd;
		if (resultado>0) {
			qtdePessoas-=qtd;
		}
	}
}
