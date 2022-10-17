public class Main {
	
	public static void main(String[] args){
		
		CloneFactory animalCloner = new CloneFactory();
		
		Ovelha dolly = new Ovelha();
		Ovelha cloneOvelha = (Ovelha) animalCloner.getClone(dolly);
		
		System.out.println(dolly);
		System.out.println(cloneOvelha);
		
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(dolly)));
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(cloneOvelha)));
	}
	
}

