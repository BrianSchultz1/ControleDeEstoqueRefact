package controleEstoque;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {

	Scanner scan = new Scanner (System.in);
	
	int quantidadeVendida;
	
	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
		
	}

	public void venda() {
		System.out.print("\nDigite a quantidade vendida: ");
		quantidadeVendida = scan.nextInt();
		quantidade -= quantidadeVendida;
		
	}	

	
}
