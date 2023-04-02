package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CocheTest {

	@Test
    public void testCrearCocheVelocidadCero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
	
	@Test
    public void testAcelerarCocheVelocidadAumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
	
	@Test
    public void testDecelerarCocheVelocidadDisminuye(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
	
	@Test
    public void testAlDecelerarCocheVelocidadNoPuedeSerMenorQueCero(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

}
