//Eduardo Fonseca Lima 0050014914

public class Reptil extends Animal{
		 
		public String corEscama;
 
		@Override
		public String locomover() {
			String frase = "Rastejando";
			return frase;
		}
 
		@Override
		public String alimentar() {
			String frase = "Comendo vegetal";
			return frase;
		}
 
		@Override
		public String emitirSom() {
			String frase = "Som de reptil";
			return frase;
		}
 
	}
