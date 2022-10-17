public class CloneFactory {
	
	public Animal getClone(Animal InstanciaPrototipica) {
		
        //Neste caso qualquer qualquer intância prototípica
        //que seja um animal, será intanciada por polimorfismo

		return InstanciaPrototipica.makeCopy();
		
	}
}

