package cuadrado;

public class Circulo {

	public int radio;
	public float circunferencia;
	public float area;
	public float id;

	public Circulo() {
		this(176895);
	}

	public Circulo(int radio) {
		this.radio = radio;
	}
	
	public float calcularCircunferencia() {
		float pi = (float) Math.PI;
		float circun = 2*pi*radio;
		return circun;
	}
	public float calcularArea() {
		float pi = (float) Math.PI; 
		float area = pi*radio*radio ;
		return area;
	}
}
