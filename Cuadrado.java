package cuadrado;

public class Cuadrado {
	
	public int longuitud;
	public float diagonal;
	public float perimetro;
	public float id;
		
	public Cuadrado() {
		this(176895);
	}
	
	public Cuadrado(int longuitud) {
		this.longuitud = longuitud;	
	}
	
	public double calculaDiagonal() {
		return Math.sqrt(longuitud*longuitud + longuitud*longuitud);
	}
	
	public float calculaPerimetro() {
		return longuitud*4;
	}
	
	public float calculaArea() {
		return longuitud*longuitud;
	}
	
}
