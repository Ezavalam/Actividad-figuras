package actividad4;

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {

		System.out.println("Que figura quieres que se calcule: cuadrado o circulo. ");
		Scanner fig_scan = new Scanner(System.in);
		String escrito = fig_scan.nextLine();
		
		
		if (escrito.contains("cuadrado")) {

			System.out.println("Cuanto medira el lado del cuadrado: ");
			Scanner lado_scan = new Scanner(System.in);
			String lado = lado_scan.nextLine();
			double double_lado = Double.parseDouble(lado);

			Cuadrado uno = new Cuadrado(double_lado);
			
			System.out.println("Que quieres que se le calcule al cuadrado: la diagonal, el perimetro o el area. ");
			Scanner calc_scan = new Scanner(System.in);
			String calcular = calc_scan.nextLine();

			
			if (calcular.equals("diagonal")) {
				System.out.println("Diagonal del cuadrado: " + uno.calculaDiagonal());
			}
			else if (calcular.equals("perimetro")) {
				System.out.println("Perimetro del cuadrado: " + uno.calculaPerimetro());
			}
			else if (calcular.equals("area")) {
				System.out.println("Area del cuadrado: " + uno.calculaArea());
			}	
		}
		
		if (escrito.equals("circulo")) {
			
		
			System.out.println("Cuanto medira el radio del circulo: ");
			Scanner rad_scan = new Scanner(System.in);
			String radio = rad_scan.nextLine();
			double double_rad = Double.parseDouble(radio);
			
			Circulo dos = new Circulo(double_rad);
			
			System.out.println("Que quieres que se le calcule al cuadrado: la circunferencia o el area. ");
			Scanner calc_scan = new Scanner(System.in);
			String calcular = calc_scan.nextLine();
			
			
			if (calcular.equals("circunferencia")) {
				System.out.println("Circunferencia del circulo:" + dos.calcularCircunferencia());
			}
			else if (calcular.equals("area")) {
				System.out.println("Area del circulo:"+ dos.calcularArea());
			}	
			
		}
}
}
