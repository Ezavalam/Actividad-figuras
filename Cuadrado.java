package actividad4;

public class Cuadrado {
	public double lado;
	public float diagonal;
	public float perimetro;
	public float id;
		
	public Cuadrado() {
		this(176895);
	}
	
	public Cuadrado(double lado) {
		this.lado = lado;	
	}
	
	public double calculaDiagonal() {
		return Math.sqrt(lado*lado + lado*lado);
	}
	
	public double calculaPerimetro() {
		return lado*4;
	}
	
	public double calculaArea() {
		return lado*lado;
	}
	
}
