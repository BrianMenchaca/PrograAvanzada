package tierraDeFantasia;

public class Detonadora extends Raza{
	
	private int turnosBuff;
	
	public Detonadora() {
		this.salud = 93;
		this.da�oBasico = 72;
		this.turnosBuff = 0;
	}
	
	public int atacar(Raza enemigo) {
		if()
			
		vida += 3;
		return turnosBuff > 0? this.da�oBasico * 3 : this.da�oBasico;
	}
	
	public void descansar() {
		this.turnosBuff = 2;
	}
	
	public void recibirAtaque(int da�oRecibido) {
		this.salud -= da�oRecibido;
	}
	
	public void moverse() {
		
	}
}
