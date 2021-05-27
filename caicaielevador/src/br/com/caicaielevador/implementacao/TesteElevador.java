package br.com.caicaielevador.implementacao;

import br.com.caicaielevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		//1o instanciar o objeto
		Elevador elevador = new Elevador();
		
		//2o preencher os atributos do objeto
		elevador.preencherNome ("Torre A");
		elevador.inicializar(20, 0, 10);
		
		//3o Exibir resultado
		System.out.println(elevador.retornarResumo());
		elevador.subir();
		elevador.subir();
		elevador.entrar(4);
		elevador.entrar(1);
		elevador.subir();
		System.out.println(elevador.retornarResumo());
		
	}
}
