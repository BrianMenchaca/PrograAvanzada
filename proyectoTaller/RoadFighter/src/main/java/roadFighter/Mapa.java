package roadFighter;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
	protected double bordeIzquierdo;
	protected double bordeDerecho;

	protected double inicio;
	protected double fin;

	protected List<Obstaculo> obstaculos = null;

	public void generarObstaculos(int cantidadObstaculos) {

		double inicioDeObstaculos = (this.fin - this.inicio) * 0.01;
		int radioMinimo = 5;
		int radioMaximo = 10;

		int posicionX;
		int posicionY;
		int radioObstaculo;
		obstaculos = new ArrayList<Obstaculo>();
		for (int i = 0; i < cantidadObstaculos; i++) {
			posicionX = (int) (Math.random() * (this.fin + 1 - inicioDeObstaculos) + inicioDeObstaculos);
			posicionY = (int) (Math.random() * (this.fin + 1 - inicioDeObstaculos) + inicioDeObstaculos);
			radioObstaculo = (int) (Math.random() * (radioMaximo + 1 - radioMinimo) + radioMinimo);
			obstaculos.add(new Obstaculo(posicionX, posicionY, radioObstaculo));
		}
	}
}
