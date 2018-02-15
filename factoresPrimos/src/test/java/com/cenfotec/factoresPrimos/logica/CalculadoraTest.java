package com.cenfotec.factoresPrimos.logica;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void testFactorizacion() {
		
		String [][] valoresPruebas = {{"1",""},{"2","2,"},{"3","3,"},{"4","2,2,"},{"5","5,"},
								 	 {"6","2,3,"},{"7","7,"},{"8","2,2,2,"},{"9","3,3,"},{"36","2,2,3,3,"},
								 	 {"42","2,3,7,"},{"4620","2,2,3,5,7,11,"}};
		
		String listaString;
		Calculadora calc = new Calculadora();
		
		for(int i=0; i<valoresPruebas.length; i++) {
			
			listaString = calc.factorizar(Integer.parseInt(valoresPruebas[i][0]));
			assertEquals(listaString,valoresPruebas[i][1]);
        }
	}
}
