package controleEstoque;

import java.util.Scanner;

public class RoupaPMG implements Item {

	Scanner scan = new Scanner(System.in);

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {

		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	protected char item;
	protected String descricao;
	protected int quantidadeP;
	protected int quantidadeM;
	protected int quantidadeG;
	protected int estoqueMinimo;
	protected int estoqueMaximo;

	public void venda() {
		System.out.print("\nEscolha o tamanho: ");
		item = scan.next().charAt(0);
		item = Character.toUpperCase(item);
		if (item == 'P') {
			quantidadeP -= 1;
		}

		if (item == 'M') {
			quantidadeM -= 1;
		}

		if (item == 'G') {
			quantidadeG -= 1;
		}

	}

	public void reposicaoEstoque() {

		if (quantidadeP < estoqueMinimo) {
			quantidadeP = estoqueMaximo;
		}

		if (quantidadeM < estoqueMinimo) {
			quantidadeM = estoqueMaximo;
		}

		if (quantidadeG < estoqueMinimo) {
			quantidadeG = estoqueMaximo;
		}

	}

	public int getQuantidade() {
		return quantidadeP + quantidadeM + quantidadeG;
	}

}
