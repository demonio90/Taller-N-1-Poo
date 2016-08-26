import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller1 {
	
	public static void main(String[] args) {
		/*//PUNTO 2.A*************************************************************************

		float radioCirculo;
		double areaCirculo;
		double diametroCirculo;
		double longitudCirculo;
		DecimalFormat decimales = new DecimalFormat("0.00");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Punto 2.a:\n");
		System.out.println("Por favor ingrese el valor del radio de la circunferencia:");
		
		radioCirculo = entrada.nextFloat();
		
		areaCirculo = 3.14 * Math.pow(radioCirculo, 2);
		diametroCirculo = radioCirculo * 2;
		longitudCirculo = 2 * 3.14 * radioCirculo;
		
		System.out.println("\nEl area de la circunferencia es de " + decimales.format(areaCirculo));
		System.out.println("El diametro de la circunferencia es de " + decimales.format(diametroCirculo));
		System.out.println("La longitud de la circunferencia es de " + decimales.format(longitudCirculo));
		
		//PUNTO 2.B*************************************************************************
		
		float baseTriangulo;
		float alturaTriangulo;
		float areaTriangulo;
		Scanner entradaBase = new Scanner(System.in);
		Scanner entradaAltura = new Scanner(System.in);
		
		System.out.println("\nPunto 2.b:\n");
		System.out.println("Por favor ingrese la base del triangulo:");
		baseTriangulo = entradaBase.nextFloat();
		System.out.println("\nPor favor ingrese la altura del triangulo:");
		alturaTriangulo = entradaAltura.nextFloat();
		
		areaTriangulo = baseTriangulo * alturaTriangulo /2;
		
		System.out.println("\nEl area del triangulo es: " + decimales.format(areaTriangulo));
		System.out.println("La grafica del triangulo es: \n" + "    *\n   * *\n  * * *\n * * * *\n* * * * *\n");
		
		//PUNTO 2.C*************************************************************************
		
		int horasDiurnas;
		int horasNocturnas;
		int horasDominicales;
		int horasFestivos;
		Scanner entradaHorasDiurnas = new Scanner(System.in), entradaHorasNocturnas = new Scanner(System.in), 
				entradaHorasDominicales = new Scanner(System.in), entradaHorasFestivo = new Scanner(System.in);
		int valorHorasDiurnas;
		double valorHorasNocturnas;
		double valorHorasDominicales;
		double valorHorasFestivos;
		double totalSalario;
		
		System.out.println("\nPunto 2.c:\n");
		System.out.println("Por favor ingrese las horas diurnas:");
		horasDiurnas = entradaHorasDiurnas.nextInt();
		
		System.out.println("\nPor favor ingrese las horas nocturnas:");
		horasNocturnas = entradaHorasNocturnas.nextInt();
		
		System.out.println("\nPor favor ingrese las horas dominicales:");
		horasDominicales = entradaHorasDominicales.nextInt();
		
		System.out.println("\nPor favor ingrese las horas festivos:");
		horasFestivos = entradaHorasFestivo.nextInt();
		
		valorHorasDiurnas = horasDiurnas * 2500;
		valorHorasNocturnas = (2500 * horasNocturnas * 0.35) + 2500 * horasNocturnas;
		valorHorasDominicales = (2500 * horasDominicales * 0.50) + 2500 * horasDominicales;
		valorHorasFestivos = (2500 * horasFestivos * 0.75) + 2500 * horasFestivos;
		totalSalario = valorHorasDiurnas + valorHorasNocturnas + valorHorasDominicales + valorHorasFestivos;
		
		System.out.println("\nSu salario con base en horas diurnas es de $" + valorHorasDiurnas);
		System.out.println("Su salario con base en horas nocturnas es de $" + Math.round(valorHorasNocturnas));
		System.out.println("Su salario con base en horas dominicales es de $" + Math.round(valorHorasDominicales));
		System.out.println("Su salario con base en horas festivos es de $" + Math.round(valorHorasFestivos));
		System.out.println("Su salario total es de $" + Math.round(totalSalario));
		
		//PUNTO 2.D*************************************************************************
		
		int numero;
		int resultado;
		Scanner entradaNumero = new Scanner(System.in);
		
		System.out.println("\nPunto 2.d:\n");
		System.out.println("Por favor ingrese el numero a multiplicar");
		
		numero = entradaNumero.nextInt();
		System.out.println("\nLa tabla de multiplicar del numero " + numero + " es:\n");
		
		for(int c = 1; c <= 10; c++) {
			resultado = numero * c;
			System.out.println(numero + " x " + c + " = " + resultado);
		}
		
		//PUNTO 2.E*************************************************************************
		
		int valorDolar;
		int cantidadDolar;
		Scanner entradaDolar = new Scanner(System.in), entradaCantidad = new Scanner(System.in);
		int totalDolar;
		
		System.out.println("\nPunto 2.e:\n");
		System.out.println("Por favor ingrese el valor del dolar:");
		
		valorDolar = entradaDolar.nextInt();
		
		System.out.println("\nPor favor ingrese la cantidad de dolares:");
		
		cantidadDolar = entradaCantidad.nextInt();
		totalDolar = valorDolar * cantidadDolar;
		
		System.out.println("\nEl total de dinero en dolares es de: " + totalDolar);
		
		//PUNTO 3.A*************************************************************************
		
		int numeroN;
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("\nPunto 3.a:\n");
		System.out.println("Por favor ingrese un numero:");
		
		numeroN = entradaNum.nextInt();
		
		if(numeroN < 0) {
			System.out.println("\nEl numero " + numeroN + " es negativo.");
		}else {
			System.out.println("\nEl numero " + numeroN + " es positivo.");
		}
		
		//PUNTO 3.B*************************************************************************
		
		int valor;
		int primo = 0;
		Scanner entradaPrimo = new Scanner(System.in);
		
		System.out.println("\nPunto 3.b:\n");
		System.out.println("Por favor ingrese un numero");
		
		valor = entradaPrimo.nextInt();
		
		for(int i = 1; i < valor; i++) {
			if(valor % i == 0) {
				primo++;
			}
		}
		
		if(primo >= 2) {
			System.out.println("\nEl numero " + valor + " no es un numero primo");
		}else {
			System.out.println("\nEl numero " + valor + " es un numero primo");
		}
		
		//PUNTO 3.C*************************************************************************
		
		int numEntero;
		Scanner entradaNumE = new Scanner(System.in);
		
		System.out.println("\nPunto 3.c:\n");
		System.out.println("Por favor ingrese un numero entero:");
		
		numEntero = entradaNumE.nextInt();
		
		if(numEntero % 2 == 0) {
			System.out.println("\nEl numero " + numEntero + " es un numero par");
		}else {
			System.out.println("\nEl numero " + numEntero + " no es un numero par");
		}
		
		//PUNTO 3.D*************************************************************************
		
		int numE;
		double resultadoNum;
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("\nPunto 3.d:\n");
		System.out.println("Por favor ingrese un numero entero");
		
		numE = entradaNum.nextInt();
		
		if(numE % 2 == 0) {
			resultadoNum = Math.pow(numE, 2);
			System.out.println("\nEl resultado de elevar " + numE + " al cuadrado es: " + Math.round(resultadoNum));
		}else {
			resultadoNum = Math.pow(numE, 3);
			System.out.println("\nEl resultado de elevar " + numE + " al cubo es: " + Math.round(resultadoNum));
		}
		
		//PUNTO 3.E*************************************************************************
		
		int num1, num2, num3;
		Scanner entradaNum1 = new Scanner(System.in), entradaNum2 = new Scanner(System.in), entradaNum3 = new Scanner(System.in);
		
		System.out.println("\nPunto 3.e:\n");
		System.out.println("Por favor ingrese tres numeros:");
		
		num1 = entradaNum1.nextInt();
		num2 = entradaNum2.nextInt();
		num3 = entradaNum3.nextInt();
		
		if(num1 > num2 && num2 > num3) {
			System.out.println("El maximo de los tres numero es: " + num1);
		}else if(num1 < num2 && num2 < num3) {
			System.out.println("El maximo de los tres numero es: " + num3);
		}else {
			System.out.println("El maximo de los tres numero es: " + num2);
		}
		
		//PUNTO 3.F*************************************************************************
		
		int numero1, numero2, numero3;
		Scanner entradaNumero1 = new Scanner(System.in), entradaNumero2 = new Scanner(System.in), entradaNumero3 = new Scanner(System.in);
		
		System.out.println("\nPunto 3.f:\n");
		System.out.println("Por favor ingrese tres numeros:");
		
		numero1 = entradaNumero1.nextInt();
		numero2 = entradaNumero2.nextInt();
		numero3 = entradaNumero3.nextInt();
		
		if(numero1 > numero2 && numero2 > numero3) {
			System.out.println("Numeros ordenados: " + numero1 + ", " + numero2 + ", " + numero3);
		}else if(numero1 > numero3 && numero3 > numero2) {
			System.out.println("Numeros ordenados: " + numero1 + ", " + numero3 + ", " + numero2);
		}else if(numero1 < numero2 && numero1 > numero3) {
			System.out.println("Numeros ordenados: " + numero2 + ", " + numero1 + ", " + numero3);
		}else if(numero3 < numero2 && numero1 < numero3) {
			System.out.println("Numeros ordenados: " + numero2 + ", " + numero3 + ", " + numero1);
		}else if(numero1 < numero2 && numero2 < numero3) {
			System.out.println("Numeros ordenados: " + numero3 + ", " + numero2 + ", " + numero1);
		}else if(numero1 < numero3 && numero1 > numero2) {
			System.out.println("Numeros ordenados: " + numero3 + ", " + numero1 + ", " + numero2);
		}
		
		//PUNTO 3.G*************************************************************************
		
		String cadena;
		int cantidad = 0;
		Scanner entradaCadena = new Scanner(System.in);
		
		System.out.println("\nPunto 3.g:\n");
		System.out.println("Por favor ingrese un texto:");
		
		cadena = entradaCadena.nextLine();
		
		for(int f = 1; f <= cadena.length(); f++) {
			cantidad++;
		}
		System.out.println("\nLa cantidad de caracteres contenido en el texto " + cadena + " es: " + cantidad);*/
	}
}
