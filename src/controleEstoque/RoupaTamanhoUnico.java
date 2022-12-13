package controleEstoque;

public class RoupaTamanhoUnico extends Peca implements Item {

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
		
	}

	public void venda() {
		 quantidade = quantidade - 1;
		
	}

}
