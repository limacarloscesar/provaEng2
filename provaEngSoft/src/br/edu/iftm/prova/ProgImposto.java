package br.edu.iftm.prova;

public class ProgImposto {

	public static void main(String[] args) {
		Imposto imposto = new Imposto("camisa", 10, 3, 0.40);
		
		System.out.println("Produto = " + imposto.getNomeProduto());
		System.out.println("Valor do Produto = " + imposto.getValorProduto());
		System.out.println("Valor do Dolar = " + imposto.getValorDolar());
		
		imposto.calculaImposto();

	}

}
