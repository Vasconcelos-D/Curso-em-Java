package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};// Vetor a ser pecorrido
		
		for(int i = 0; i<vect.length; i++) {// Feito a instanciação para pecorrer todas as posições do vetor (comando length)
			System.out.println(vect[i]);//Vai imprimir todos os dados dentro do vetor[i]
		}
		
		System.out.println("----------------------------------");
		// De forma mais simplificado, o for each vai pecorer de formas mais simples, pois é atribuido apelido ao vetor
		for(String vet:vect) {
			//Tipo do (Foi colocado String)
			// Apelido, foi usado vet
			//(:) depois a coleção,( vect ) que foi instanciada acima.
			//Por sim os System.out.println(vect); que fará a impressão na  tela de todos os nomes
			System.out.println(vet);
			
			// Forma de ler
			// Para cada objto contido no vetor vet, FAÇA.
		}
	}
}