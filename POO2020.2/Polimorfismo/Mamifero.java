//Eduardo Fonseca Lima 0050014914

public class Mamifero extends Animal {
 
		public String corPelo;
 
		@Override
		public String emitirSom() {
			String frase = "Som de mamifero";
			return frase;
		}
		
		@Override
		public String alimentar() {
			String frase = "Mamando";
			return frase;
		}
		
		@Override
		public String locomover() {
			String frase = "Correndo";
			return frase;
		}
 
	}
