package actividad4;

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Cuadrado");
			System.out.println("2. Circulo");
			System.out.println("3. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Cuanto medira el lado del cuadrado: ");
				Scanner lado_scan = new Scanner(System.in);
				String lado = lado_scan.nextLine();
				double double_lado = Double.parseDouble(lado);

				Cuadrado uno = new Cuadrado(double_lado);
				
				Scanner calc_scan_cuadrado = new Scanner(System.in);
				System.out.println("1. Diagonal");
				System.out.println("2. Perimetro");
				System.out.println("3. Area");
				
				int choice_calc_cuadrado = Integer.parseInt(calc_scan_cuadrado.nextLine());
				switch(choice_calc_cuadrado) {
				case 1:
					System.out.println("Diagonal del cuadrado: " + uno.calculaDiagonal());
					break;
				case 2: 
					System.out.println("Perimetro del cuadrado: " + uno.calculaPerimetro());
					break;
				case 3:
					System.out.println("Area del cuadrado: " + uno.calculaArea());
					break;
				}
				break;
			case 2:
				System.out.println("Cuanto medira el radio del circulo: ");
				Scanner rad_scan = new Scanner(System.in);
				String radio = rad_scan.nextLine();
				double double_rad = Double.parseDouble(radio);
				
				Circulo dos = new Circulo(double_rad);
				
				Scanner calc_scan_circulo = new Scanner(System.in);		
				System.out.println("1. Circunferencia");
				System.out.println("2. Area");
				
				int choice_calc_circulo = Integer.parseInt(calc_scan_circulo.nextLine());				
				switch(choice_calc_circulo) {
				case 1: 
					System.out.println("Circunferencia del circulo:" + dos.calcularCircunferencia());
					break;
				case 2:
					System.out.println("Area del circulo:"+ dos.calcularArea());
					break;
				}
				break;
			case 3: 
				System.exit(0);
				break;
			}
		}
		}
}
