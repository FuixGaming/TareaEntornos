import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		double num1;
		double num2;
		double resultado;
		String simbolo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("�Calculadora! + para sumar, - restar, * multiplicar, / dividir, ^2 al cuadrado, ^3 al cubo, sqrt raiz cuadrada.");
		System.out.println("Introduce un n�mero: ");
		num1 = teclado.nextDouble();
		System.out.println("Introduce el s�mbolo de la operaci�n: ");
		simbolo = teclado.next();
		System.out.println("Introduce otro n�mero: ");
		num2 = teclado.nextDouble();
		
		if (simbolo == "+") {
			resultado = suma(num1, num2);
			System.out.println("El resultado de la suma es: "+resultado);
		}
		else if (simbolo == "-") {
			resultado = num1-num2;
			System.out.println("El resultado de la resta es: "+resultado);
		}
		
		else if (simbolo == "*") {
			resultado = num1*num2;
			System.out.println("El resultado de la multiplicaci�n es: "+resultado);
		}
		
		else if (simbolo == "/") {
			resultado = num1/num2;
			System.out.println("El resultado de la divisi�n es: "+resultado);
		}
		
		else if (simbolo == "^2") {
			resultado = num1*num1;
			System.out.println(num1+" al cuadrado es igual a: "+resultado);
		}
		
		else if (simbolo == "^3") {
			resultado = num1*num1*num1;
			System.out.println(num1+" al cubo es igual a: "+resultado);
		}
		
		else if (simbolo == "sqrt") {
			double resultadoRaiz = Math.sqrt(num1);
			System.out.println("La ra�z cuadrada de "+num1+" es: "+resultadoRaiz);
		}
		
		teclado.close();

	}
	
	public static double suma (double num1, double num2) {
		return num1 + num2;
	}

}
