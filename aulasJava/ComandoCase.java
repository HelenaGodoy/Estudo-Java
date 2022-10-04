package aulasJava;

public class ComandoCase {

	public static void main(String[] args) {

		char estadoCivil = 'c';

		switch (estadoCivil) {
		case 's':
			System.out.println("SOLTEIRO");
			break;
		case 'd':
			System.out.println("DIVORCIADO");
			break;
		case 'v':
			System.out.println("VIÚVO");
			break;
		case 'c':
			System.out.println("CASADO");
			break;
		default:
			System.out.println("Opção inválida!!!");
			break;
		}

		System.out.println("FIM DO PROGRAMA!");
	}
}
