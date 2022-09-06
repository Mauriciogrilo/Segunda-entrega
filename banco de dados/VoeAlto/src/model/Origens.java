package model;

public class Origens {

	private int id_origem;
	private Pacotes pacotes;
	private Promocoes promocoes;
	private String cidade;
	
	public Origens(int id_origem, Pacotes pacotes, Promocoes promocoes, String cidade) {
		super();
		this.id_origem = id_origem;
		this.pacotes = pacotes;
		this.promocoes = promocoes;
		this.cidade = cidade;
	}

	public int getId_origem() {
		return id_origem;
	}

	public void setId_origem(int id_origem) {
		this.id_origem = id_origem;
	}

	public Pacotes getPacotes() {
		return pacotes;
	}

	public void setPacotes(Pacotes pacotes) {
		this.pacotes = pacotes;
	}

	public Promocoes getPromocoes() {
		return promocoes;
	}

	public void setPromocoes(Promocoes promocoes) {
		this.promocoes = promocoes;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}

