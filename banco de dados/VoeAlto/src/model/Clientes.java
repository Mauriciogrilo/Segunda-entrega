package model;

public class Clientes {
	
	private int id_cliente;
	private Enderecos endereco;
	private Pacotes pacote;
	private String nome;
	private String nascimento;
	private String email;
	private String sexo;
	private double telefone;
	
	public Clientes(int id_cliente, Enderecos endereco, Pacotes pacote, String nome, String nascimento, String email,
			String sexo, double telefone) {
		super();
		this.id_cliente = id_cliente;
		this.endereco = endereco;
		this.pacote = pacote;
		this.nome = nome;
		this.nascimento = nascimento;
		this.email = email;
		this.sexo = sexo;
		this.telefone = telefone;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Enderecos getEndereco() {
		return endereco;
	}

	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}

	public Pacotes getPacote() {
		return pacote;
	}

	public void setPacote(Pacotes pacote) {
		this.pacote = pacote;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	
	
	}