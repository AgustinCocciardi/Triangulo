package triangle;

import java.util.Scanner;

public class Triangulo {

	private int lado1;
	private int lado2;
	private int lado3;

	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public void indicarQueTrianguloEs() {
		if(this.esEquilatero())
			System.out.println("El triangulo es equilatero");
		else {
			if(this.esUnTriangulo()) {
				if(this.esEscaleno())
					System.out.println("El triangulo es escaleno");
				else
					System.out.println("El triangulo es isosceles");
			}
			else
				System.out.println("No es un triangulo");
		}
		
	}
	
	public boolean esUnTriangulo() {
		if(this.lado1 >= this.lado2 && this.lado1 >= this.lado3 && (this.lado2+this.lado3) > this.lado1)
			return true;
		if(this.lado2 >= this.lado1 && this.lado2 >= this.lado3 && (this.lado1+this.lado3) > this.lado2)
			return true;
		if(this.lado3 >= this.lado1 && this.lado3 >= this.lado2 && (this.lado1+this.lado2) > this.lado3)
			return true;
		return false;
	}
	
	public boolean esEquilatero() {
		return (this.lado1 == this.lado2 && this.lado2 == this.lado3) ? true : false;
	}
	
	public boolean esEscaleno() {
		return (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) ? true : false;
	}
	
	public static void main(String[] args) {
		int lado1 = 0, lado2 = 0, lado3 = 0;
		Scanner entrada;
		try{
			entrada = new Scanner(System.in);
			System.out.println("Ingrese el primer lado: ");
			lado1 = entrada.nextInt();
		}catch(Exception e) {
			System.out.println("Ha introducido un dato no valido para el primer lado o se ha excedido del rango");
			System.exit(1);
		}
		finally {
			if(lado1 <= 0) {
				System.out.println("Debe ingresar un entero positivo en el primer lado");
				System.exit(1);
			}
		}
		try {
			entrada = new Scanner(System.in);
			System.out.println("Ingrese el segundo lado: ");
			lado2 = entrada.nextInt();
		}catch(Exception e) {
			System.out.println("Ha introducido un dato no valido para el segundo lado o se ha excedido del rango");
			System.exit(2);
		}
		finally {
			if(lado2 <= 0) {
				System.out.println("Debe ingresar un entero positivo en el segundo lado");
				System.exit(2);
			}
		}
		try {
			entrada = new Scanner(System.in);
			System.out.println("Ingrese el tercer lado: ");
			lado3 = entrada.nextInt();
		}catch(Exception e) {
			System.out.println("Ha introducido un dato no valido para el tercer lado o se ha excedido del rango");
			System.exit(3);
		}
		finally {
			if(lado3 <= 0) {
				System.out.println("Debe ingresar un entero positivo en el tercer lado");
				System.exit(3);
			}
		}
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		triangulo.indicarQueTrianguloEs();
	}

}
