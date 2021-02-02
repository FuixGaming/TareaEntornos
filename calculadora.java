import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		double num1;
		double num2;
		double resultado;
		String simbolo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¡Calculadora! + para sumar, - restar, * multiplicar, / dividir, ^2 al cuadrado, ^3 al cubo, sqrt raiz cuadrada.");
		System.out.println("Introduce un número: ");
		num1 = teclado.nextDouble();
		System.out.println("Introduce el símbolo de la operación: ");
		simbolo = teclado.next();
		System.out.println("Introduce otro número: ");
		num2 = teclado.nextDouble();
		
		if (simbolo.equals("+")) {
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es: "+resultado);
		}
		else if (simbolo.equals("-")) {
			resultado = num1-num2;
			System.out.println("El resultado de la resta es: "+resultado);
		}
		
		else if (simbolo.equals("*")) {
			resultado = num1*num2;
			System.out.println("El resultado de la multiplicación es: "+resultado);
		}
		
		else if (simbolo.equals("/")) {
			resultado = num1/num2;
			System.out.println("El resultado de la división es: "+resultado);
		}
		
		else if (simbolo.equals("^2")) {
			resultado = num1*num1;
			System.out.println(num1+" al cuadrado es igual a: "+resultado);
		}
		
		else if (simbolo.equals("^3")) {
			resultado = num1*num1*num1;
			System.out.println(num1+" al cubo es igual a: "+resultado);
		}
		
		else if (simbolo.equals("sqrt")) {
			double resultadoRaiz = Math.sqrt(num1);
			System.out.println("La raíz cuadrada de "+num1+" es: "+resultadoRaiz);
		}
		
		teclado.close();

	}

}

//hola
