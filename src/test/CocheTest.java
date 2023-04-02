package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CocheTest {

	@Test
    public void testCrearCocheVelocidadCeroMiguelPozo(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
	
	@Test
    public void testAcelerarCocheVelocidadAumentaMiguelPozo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
	
	@Test
    public void testDecelerarCocheVelocidadDisminuyeMiguelPozo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
	
	@Test
    public void testAlDecelerarCocheVelocidadNoPuedeSerMenorQueCeroMiguelPozo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

}
