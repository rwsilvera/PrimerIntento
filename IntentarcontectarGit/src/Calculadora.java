
public class Calculadora {

	public static int sumar(int valor1, int valor2) {
		int resultadoSuma= valor1+=valor2;
		System.out.println(resultadoSuma);
		return resultadoSuma;

	}
	public static int multiplicar(int valor1, int valor2) {
		int resultadoMulti=valor1*=valor2;
		System.out.println(resultadoMulti);
		return resultadoMulti;

	}
	public static int dividir(int valor1,int valor2) {
		int resultadoDivi=valor1/=valor2;
		System.out.println(resultadoDivi);
		return resultadoDivi;
	}
	
	public static int resta(int valor1,int valor2) {
		int resultadoResta=valor1-=valor2;
		System.out.println(resultadoResta);
		return resultadoResta;
	}
	

	
	
	
}
