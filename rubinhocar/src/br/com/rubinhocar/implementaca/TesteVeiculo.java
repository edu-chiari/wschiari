package br.com.rubinhocar.implementaca;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		
		//1o instanciar o objeto
		Veiculo objeto = new Veiculo(); //instancia do objeto
		
		//2o preencher os atributos do objeto
		objeto.preencherModelo("camaro");
		objeto.preencherValor(200000);
		
		//3o Exibir resultado
		System.out.println(objeto.retornarTudo());
		System.out.println(objeto.ligar());
		objeto.ligar();
		objeto.acelerar(100);
		objeto.acelerar(10);
		objeto.desacelerar(10);
		System.out.println("Depois de ligar: \n" + objeto.retornarTudo());
		objeto.desligar();
		System.out.println("Depois de Desligar: \n" + objeto.retornarTudo());
	}

}
