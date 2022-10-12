package java_interpreter;

public class TesteInterpretador {

	public static void main(String[] args) {
		 Operador somar = new Somar(new Numero(1), new Numero(4));
	      System.out.println("O resultado da soma é: " + somar.interpretar());

	}

}
