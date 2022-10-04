package composicao;

public class TesteCompisicao {

	public static void main(String[] args) {

		Vendedor vendedor1 = new Vendedor(1234, "Marcelo Almeida");
		Vendedor vendedor2 = new Vendedor(4321, "Maria Santos");
		Vendedor vendedor3 = new Vendedor(9876, "Humberto Costa");
		Vendedor vendedor4 = new Vendedor(6789, "Joana Torres");

		Comprador comprador1 = new Comprador(00, "Carla Maria");
		
		Carro carro1 = new Carro("VW", "Fox", "Azul", 25000, vendedor2, comprador1);

		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Preco: " + carro1.getPreco());
		System.out.println("-----------------");
		System.out.println("Matrícula: " + carro1.getVendedor().getMatricula());
		System.out.println("Nome Vendedor: " + carro1.getVendedor().getNome());
		System.out.println("Comprador: " + carro1.getComprador().getNome());
		System.out.println("RG: " + carro1.getComprador().getRg());

	}

}
