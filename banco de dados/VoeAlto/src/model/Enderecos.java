package model;

public class Enderecos
{
	
	private int id_endereco;
	private Clientes clientes;
	private String logadouro;
	private String estado;
	private String cidade;
	
	public Enderecos(int id_endereco, Clientes clientes, String logadouro, String estado, String cidade) {
		super();
		this.id_endereco = id_endereco;
		this.clientes = clientes;
		this.logadouro = logadouro;
		this.estado = estado;
		this.cidade = cidade;
	}

	public int getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}

