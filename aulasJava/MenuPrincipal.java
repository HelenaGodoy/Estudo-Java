package aulasJava;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {

		try (Scanner leitor = new Scanner(System.in)) {
			int opcao;

			do {

				System.out.println("**** MENU PRINCIPAL ****");
				System.out.println("1- Cadastrar");
				System.out.println("2- Mostrar Todos");
				System.out.println("3- Pesquisar pelo nome");
				System.out.println("4- Alterar");
				System.out.println("5- Excluir");
				System.out.println("6- Encerrar programa");
				System.out.print("Opção: ");

				opcao = leitor.nextInt();
				// System.out.println("A opção escolhida:" + opcao);

				switch (opcao) {
				case 1:
					System.out.println("***** CADASTRAR *****");
					break;
				case 2:
					System.out.println("***** MOSTRAR TODOS *****");
					break;
				case 3:
					System.out.println("***** PESQUISAR POR NOME *****");
					break;
				case 4:
					System.out.println("**** ALTERAR ****");
					break;
				case 5:
					System.out.println("**** EXCLUIR ****");
					break;
				case 6:
					System.out.println("****ENCERRAR PROGRAMA ****");
					break;

				}
			} while (opcao != 6);

			// leitor.close();
		}

	}

}
