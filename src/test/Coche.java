package test;

public class Coche {

	public Object velocidad;

	public void acelerarMiguelPozo(int aceleracion) {
		// TODO Auto-generated method stub
		velocidad += aceleracion;
	}

	public void decelerarMiguelPozo(int deceleracion) {
		// TODO Auto-generated method stub
		velocidad -= deceleracion;
		if (velocidad < 0) velocidad = 0;
	}
	

}
