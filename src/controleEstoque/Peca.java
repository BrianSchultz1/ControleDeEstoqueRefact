package controleEstoque;

public abstract class Peca {

	protected String descricao;
	protected int quantidade;
	protected int estoqueMinimo;
	protected int estoqueMaximo;

	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public abstract void venda();

	public int getQuantidade() {
		return quantidade;
	}

	public void reposicaoEstoque() {
		if (quantidade < estoqueMinimo) {
			quantidade = estoqueMaximo;
		}
	}

}
