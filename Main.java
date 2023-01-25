package actividad4;

public class Main {
	public static void main(String[] args) {
			
		Scanner fig_scan = new Scanner(System.in);
		System.out.println("Que figura quieres que se calcule: cuadrado o circulo. ");
		System.out.println("La figura sera: " + fig_scan);
		
		if (fig_scan == "cuadrado") {
			Cuadrado uno = new Cuadrado();
			
			Scanner lado_scan = new Scanner(System.in);
			System.out.println("Cuanto medira el lado del cuadrado: ");
			double double_lado = Double.parseDouble(lado_scan);
			
			Scanner calc_scan = new Scanner(System.in);
			System.out.println("Que quieres que se le calcule al cuadrado: la diagonal, el perimetro o el area. ");
			
			if (calc_scan == "diagonal") {
				System.out.println("Diagonal del cuadrado: " + uno.calculaDiagonal());
			}
			else if (calc_scan == "perimetro") {
				System.out.println("Perimetro del cuadrado: " + uno.calculaPerimetro());
			}
			else if (calc_scan == "area") {
				System.out.println("Area del cuadrado: " + uno.calculaArea());
			}	
		}
		
		if (fig_scan == "circulo") {
			Circulo dos = new Circulo();
		
			Scanner rad_can = new Scanner(System.in);
			System.out.println("Cuanto medira el radio del circulo: ");
			double double_rad = Double.parseDouble(rad_scan);
			
			Scanner calc_scan = new Scanner(System.in);
			System.out.println("Que quieres que se le calcule al cuadrado: la circunferencia o el area. ");
			
			if (calc_scan == "circunferencia") {
				System.out.println("Circunferencia del circulo:" + dos.calcularCircunferencia());
			}
			else if (calc_scan == "area") {
				System.out.println("Area del circulo:"+ dos.calcularArea());
			}	
			
		}
}
}
