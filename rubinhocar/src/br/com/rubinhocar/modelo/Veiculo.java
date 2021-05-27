package br.com.rubinhocar.modelo;

public class Veiculo {
	
	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	// <modificador (private, public), <tipo do retorno>, <nome do método> (<Tipo do param), <nome do param)>,...){
	
	public String ligar() {
		status=true;
		return "Ligado";
	}
	
	public String desligar() {
		velocidadeAtual=0;
		status=false;
		return "Desligado";
	}
	
	
	public void acelerar(int param) {
		if (status==true) {
			velocidadeAtual+=param;
		}
	}
	
	public void desacelerar (int param) { //DESACELERAR 1
		if (status==true) {
			velocidadeAtual-=param;	
		}
	}
	
	public void desacelerar() { //DESACELERAR 2
		velocidadeAtual=0;
	}
	
	
	public void preencherValor(double param) {
		if (param>0) {
			valor=param;
		}
	}
	
	public double retornarValor() { 
		return valor;
	}
	
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo(String param) {
		if (param.length()<10) {
		modelo = param.toUpperCase();
	}
	}
	
	public String retornarTudo() { //CORRIGIR
		String xpto = "NÃO";
		if (status==true) {
			xpto="SIM";
	}
		return
				"Modelo: " + modelo + "\n" +
				"Valor: " + valor + "\n" +
				"Velocidade: " + velocidadeAtual + "\n" +
				"ligado? : " + xpto;
		}
	
		
	}
