public class TesteDeCadastroDePessoas {

	public static void main(String[] args) {

		
		Pessoa pessoa1 = new Pessoa();

		pessoa1.nome = "Maria Sandra";
		pessoa1.sexo = 'f';
		pessoa1.idade = 25;
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Sexo: " + pessoa1.sexo);
		System.out.println("Idade: " + pessoa1.idade);

		System.out.println();

		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Carlos";
		pessoa2.sexo = 'm';
		pessoa2.idade = 36;

		System.out.println("Nome: " + pessoa2.nome);
		System.out.println("Sexo: " + pessoa2.sexo);
		System.out.println("Idade: " + pessoa2.idade);

		System.out.println();

		Pessoa pessoa3 = new Pessoa();

		pessoa3.nome = "Joana";
		pessoa3.sexo = 'f';
		pessoa3.idade = 45;

		System.out.println("Nome: " + pessoa3.nome);
		System.out.println("Sexo: " + pessoa3.sexo);
		System.out.println("Idade: " + pessoa3.idade);
	}

}
