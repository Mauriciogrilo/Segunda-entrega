package model;

public class Destinos {

	private int id_destino;
	private Pacotes pacotes;
	private Promocoes promocoes;
	private String cidade;
	
	public Destinos(int id_destino, Pacotes pacotes, Promocoes promocoes, String cidade) {
		super();
		this.id_destino = id_destino;
		this.pacotes = pacotes;
		this.promocoes = promocoes;
		this.cidade = cidade;
	}


	

	public int getId_destino() {
		return id_destino;
	}

	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
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

	public static void add(Destinos destino) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
	