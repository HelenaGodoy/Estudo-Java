package composicao;

public class Comprador {

	private String nome;
	private int rg;
	

	public Comprador (int i, String nome) {
		this.rg = i;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}
	
	
}
