package java_interpreter;

public class Somar implements Operador{

	 private Numero esquerda;
	 private Numero direita;

	 public Somar(Numero esquerda, Numero direita) {
	        this.esquerda = esquerda;
	        this.direita = direita;
	 }
	
	 @Override
	 public int interpretar() {
	        return this.esquerda.interpretar() + this.direita.interpretar();
	    }	
}
