package model;

public class Pacotes {

	private int id_pacote;
	private Clientes cliente;
	private Origens origem;
	private Destinos destino;
	
	public Pacotes(int id_pacote, Clientes cliente, Origens origem, Destinos destino) {
		super();
		this.id_pacote = id_pacote;
		this.cliente = cliente;
		this.origem = origem;
		this.destino = destino;
	}

	public int getId_pacote() {
		return id_pacote;
	}

	public void setId_pacote(int id_pacote) {
		this.id_pacote = id_pacote;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Origens getOrigem() {
		return origem;
	}

	public void setOrigem(Origens origem) {
		this.origem = origem;
	}

	public Destinos getDestino() {
		return destino;
	}

	public void setDestino(Destinos destino) {
		this.destino = destino;
	}
	
	

}
