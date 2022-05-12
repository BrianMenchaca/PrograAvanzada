package roadFighter;

public class Obstaculo {

	protected Integer posicionX;
	protected Integer posicionY;
	protected Integer radio;

	public Obstaculo(Integer posicionX, Integer posicionY, double radio) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.radio = radio;
	}

	public void efecto(Auto auto) {
		auto.frenar();
		auto.moverseHorizontal(Math.random());
		// El auto se movera horizontalmente, la clase Auto definira si choca con el
		// borde del mapa o otro auto.

	}

}
