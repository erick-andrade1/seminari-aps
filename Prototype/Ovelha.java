public class Ovelha implements Animal {

	public Ovelha(){
		System.out.println("Ovelha criada!");
	}
	
	public Animal makeCopy() {
		
		System.out.println("Criando ovelha");
		Ovelha sheepObject = null;
		
		try {
			
			sheepObject = (Ovelha) super.clone();
			
		} catch (CloneNotSupportedException e) {
			System.out.println("Clonagem mal-sucedida");
			e.printStackTrace();
		 }
		
		return sheepObject;
	}
	
	public String toString(){
		return "Tem uma ovelha aqui!";		
	}
}


