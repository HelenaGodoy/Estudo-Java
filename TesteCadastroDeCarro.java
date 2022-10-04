public class TesteCadastroDeCarro {

	public static void main(String[] args) {

		// Criação do objeto
		Carro carro1 = new Carro();

		// Inserir informações dentro do objeto
		carro1.setMarca("VW");
		carro1.setModelo("Gol");
		carro1.setCor("Azul");
		carro1.setPreco(25000);

		// Pegas as informações do obejto e mostrar em tela
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo:" + carro1.getModelo());
		System.out.println("Cor:" + carro1.getCor());
		System.out.println("Preço Atual: " + carro1.getPreco());
		System.out.println("Preço Reajustado: " + carro1.calcularReajuste());

		System.out.println();

		Carro carro2 = new Carro();
		carro2.setMarca("Fiat");
		carro2.setModelo("Uno");
		carro2.setCor("Branco");
		carro2.setPreco(31000);

		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Modelo:" + carro2.getModelo());
		System.out.println("Cor:" + carro2.getCor());
		System.out.println("Preço Atual: " + carro2.getPreco());
		System.out.println("Preço Reajustado: " + carro2.calcularReajuste());


	}

}
