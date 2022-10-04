package aulasIniciais;
public class TesteDeVetor {

	public static void main(String[] args) {

		int[] numeros = new int[4];
		numeros[0] = 356;
		numeros[1] = 500;
		numeros[2] = 0;
		numeros[3] = 2897;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}

		System.out.println();

		int[] numeros2 = { 800, 2751, 97, 45, 12 }; // uma das formas de construir o cod da maneira escrita acima, porem
													// em apenas 1 linha.

		for (int numero : numeros2) {
			System.out.println("Número: " + numero);

		}

		System.out.println();

		String[] nomes = { "Maria", "João", "Pedro", "Roberta", "Sandra", "Joana" }; // o cod que está com essa ref ***
																						// complementa esse
		// uma das formas de construir o cod da maneira escrita abaixo, porem em apenas
		// 1 linha.

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("nome[" + i + "]=" + nomes[i]); // esse complementa o cod que está com essa ref *****

			// String[] nomes = new String[6];
			// nomes[0] = "Maria";
			// nomes[1] = "João";
			// nomes[2] = "Pedro";
			// nomes[3] = "Roberta";
			// nomes[4] = "Sandra";
			// nomes[5] = "Joana";

			// for(String nome:nomes) {
			// System.out.println("Nome: " + nome);
//	}	

		}
	}

}
