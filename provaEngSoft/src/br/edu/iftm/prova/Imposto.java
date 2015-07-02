package br.edu.iftm.prova;

public class Imposto extends Produto {
	
	private double valorDolar;
	private double aliquota = 1.20;
	
	public double getValorDolar() {
		return valorDolar;
	}

	public void setValorDolar(double valorDolar) {
		this.valorDolar = valorDolar;
	}
	
	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

		
	public Imposto(String nomeProduto, double valorProduto, double valorDolar,
			double aliquota) {
		super(nomeProduto, valorProduto);
		this.valorDolar = valorDolar;
		this.aliquota = aliquota;
		
	}



	
	
	public double calculaImposto(){
		double calc = 0 ;
		if (this.aliquota > 0.20 && this.aliquota < 1.20){
			calc = (super.getValorProduto() * this.valorDolar) * this.aliquota;
			System.out.println("Valor do imposto = " + calc);
		}
				
		else{
			System.out.println("Imposto nao calculado - aliquota fora do valor");
		}
		return calc;	
	}


}
