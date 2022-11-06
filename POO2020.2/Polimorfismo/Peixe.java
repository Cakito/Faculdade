//Eduardo Fonseca Lima 0050014914

public class Peixe extends Animal{
 
		public String corEscama;
 
		public String soltarBolha() {
			String frase = "Soltou uma bolha";
			return frase;
		}
		
		@Override
		public String locomover() {
			String frase = "Nadando";
			return frase;
		}
 
		@Override
		public String alimentar() {
			String frase = "Comendo substancias";
			return frase;
		}
 
		@Override
		public String emitirSom() {
			String frase = "Peixe nao faz som";
			return frase;
		}
}
