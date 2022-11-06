//Eduardo Fonseca Lima 0050014914
class AnimalTester {
 
		public static void main (String args[]) {
 
			Ave ave = new Ave();
			System.out.println(ave.fazerNinho());
			System.out.println(ave.emitirSom());
			System.out.println(ave.alimentar());
			System.out.println(ave.locomover());
			System.out.println("");
				
			Mamifero mamifero = new Mamifero();
			System.out.println(mamifero.emitirSom());
			System.out.println(mamifero.alimentar());
			System.out.println(mamifero.locomover());
			System.out.println("");
			
			Reptil lagartixa = new Reptil();
			System.out.println(lagartixa.locomover());
			System.out.println(lagartixa.alimentar());
			System.out.println(lagartixa.emitirSom());
			System.out.println("");
 
			Peixe peixe = new Peixe();
			System.out.println(peixe.soltarBolha());
			System.out.println(peixe.locomover());
			System.out.println(peixe.alimentar());
			System.out.println(peixe.emitirSom());
			System.out.println("");
			
			Canguru canguru = new Canguru();
			System.out.println(canguru.locomover());
			System.out.println(canguru.alimentar());
			System.out.println(canguru.emitirSom());
		}
	}
 
