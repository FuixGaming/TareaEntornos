import java.util.Scanner;

public class calculadora2 {

	public static void main(String[] args) {
		System.out.println("Calculadora 2.0");
		double num1;
		double num2;
		double resultado;
		String simbolo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num1 = teclado.nextDouble();
		System.out.println("Introduce otro número: ");
		num2 = teclado.nextDouble();
		
		resultado = num1+num2;
		System.out.println("el resultado de la suma es: "+resultado);
		resultado = num1-num2;
		System.out.println("el resultado de la resta es: "+resultado);

	}

}
