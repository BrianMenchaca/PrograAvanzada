package tierraDeFantasia;

public class Detonadora extends Raza{
	
	private int turnosBuff;
	
	public Detonadora() {
		this.salud = 93;
		this.daņoBasico = 72;
		this.turnosBuff = 0;
	}
	
	public int atacar(Raza enemigo) {
		if()
			
		vida += 3;
		return turnosBuff > 0? this.daņoBasico * 3 : this.daņoBasico;
	}
	
	public void descansar() {
		this.turnosBuff = 2;
	}
	
	public void recibirAtaque(int daņoRecibido) {
		this.salud -= daņoRecibido;
	}
	
	public void moverse() {
		
	}
}
