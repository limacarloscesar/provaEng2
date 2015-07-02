package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.prova.Imposto;

public class Teste {

	

	@Test
	public void test() {
		Imposto imposto = new Imposto("camisa", 10, 3, 0.40);
		
		double esperado = 12.0;
		double atual = imposto.calculaImposto();
		
		assertEquals(esperado, atual, 0.0);
	}

}
