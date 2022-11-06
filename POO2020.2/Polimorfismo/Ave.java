//Eduardo Fonseca Lima 0050014914

public class Ave extends Animal {
 
		public String corPena;
 
		public String fazerNinho() {
			String frase = "Fez um ninho";
			return frase;
		}
 
		@Override
		public String emitirSom() {
			String frase = "Som de ave";
			return frase;
		}
		
		@Override
		public String alimentar() {
			String frase = "Comendo frutas";
			return frase;
		}
		
		@Override
		public String locomover() {
			String frase = "Voando";
			return frase;
		}
 
	}
