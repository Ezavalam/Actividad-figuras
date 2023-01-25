package actividad4;

public class Circulo {
	public double radio;
	public float circunferencia;
	public float area;
	public float id;

	public Circulo() {
		this(176895);
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	
	public double calcularCircunferencia() {
		double pi = (float) Math.PI;
		double circun = 2*pi*radio;
		return circun;
	}
	public double calcularArea() {
		double pi = (float) Math.PI; 
		double area = pi*radio*radio ;
		return area;
	}
}
