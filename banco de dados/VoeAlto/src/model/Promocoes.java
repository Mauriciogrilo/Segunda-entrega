package model;

public class Promocoes {

	private int id_promocao;
	private Destinos destino;
	private Origens origem;
	private double desconto;
	private double validade;
	public Promocoes(int id_promocao, Destinos destino, Origens origem, double desconto, double validade) {
		super();
		this.id_promocao = id_promocao;
		this.destino = destino;
		this.origem = origem;
		this.desconto = desconto;
		this.validade = validade;
	}
	public int getId_promocao() {
		return id_promocao;
	}
	public void setId_promocao(int id_promocao) {
		this.id_promocao = id_promocao;
	}
	public Destinos getDestino() {
		return destino;
	}
	public void setDestino(Destinos destino) {
		this.destino = destino;
	}
	public Origens getOrigem() {
		return origem;
	}
	public void setOrigem(Origens origem) {
		this.origem = origem;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getValidade() {
		return validade;
	}
	public void setValidade(double validade) {
		this.validade = validade;
	}
	
	
}
