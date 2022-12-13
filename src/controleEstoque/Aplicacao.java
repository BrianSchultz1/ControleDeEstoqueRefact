package controleEstoque;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Item[] vet = new Item[5];

		vet[0] = new RoupaPMG("Calças de vários tamanhos!", 10, 10, 10, 5, 30);
		vet[1] = new RoupaTamanhoUnico("Camisas de tamanho único!", 10, 5, 10);
		vet[2] = new Acessorio("Relógios prateados!", 5, 5, 10);
		vet[3] = new Acessorio("Correntes finas!", 5, 5, 10);
		vet[4] = new Acessorio("Brincos de ouro!", 5, 5, 10);

		Scanner scan = new Scanner(System.in);

		System.out.print(" 0 - Calça tamanho variável\n" + " 1 - Camisa tamanho único\n" + " 2 - Relógio\n"
				+ " 3 - Corrente fina\n" + " 4 - Brinco de Ouro\n" + " 5 - Para sair do sistema\n" + "\n Opção escolhida: ");

		int opc = scan.nextInt();

		do {
			switch (opc) {
			case 0:
				vet[0].venda();
				vet[0].reposicaoEstoque();
				System.out.println("\nAção efetuada!");
				System.out.print("\n0 – Calça tamanho variável\n" + "1 – Camisa tamanho único\n" + "2 – Relógio\n"
						+ "3 – Corrente\n" + "4 – Brinco\n" + "5 – Sair do sistema\n" + "\nOpção escolhida: ");
				opc = scan.nextInt();
				break;
			case 1:
				vet[1].venda();
				vet[1].reposicaoEstoque();
				System.out.println("\nAção efetuada!");
				System.out.print("\n0 – Calça tamanho variável\n" + "1 – Camisa tamanho único\n" + "2 – Relógio\n"
						+ "3 – Corrente\n" + "4 – Brinco\n" + "5 – Sair do sistema\n" + "\nOpção escolhida: ");
				opc = scan.nextInt();
				break;
			case 2:
				vet[2].venda();
				vet[2].reposicaoEstoque();
				System.out.println("\nAção efetuada!");
				System.out.print("\n0 – Calça tamanho variável\n" + "1 – Camisa tamanho único\n" + "2 – Relógio\n"
						+ "3 – Corrente\n" + "4 – Brinco\n" + "5 – Sair do sistema\n" + "\nOpção escolhida: ");
				opc = scan.nextInt();
				break;
			case 3:
				vet[3].venda();
				vet[3].reposicaoEstoque();
				System.out.println("\nAção efetuada!");
				System.out.print("\n0 – Calça tamanho variável\n" + "1 – Camisa tamanho único\n" + "2 – Relógio\n"
						+ "3 – Corrente\n" + "4 – Brinco\n" + "5 – Sair do sistema\n" + "\nOpção escolhida: ");
				opc = scan.nextInt();
				break;
			case 4:
				vet[4].venda();
				vet[4].reposicaoEstoque();
				System.out.println("\nAção efetuada!");
				System.out.print("\n0 – Calça tamanho variável\n" + "1 – Camisa tamanho único\n" + "2 – Relógio\n"
						+ "3 – Corrente\n" + "4 – Brinco\n" + "5 – Sair do sistema\n" + "\nOpção escolhida: ");
				opc = scan.nextInt();
				break;
			case 5:
				System.out.println("\nCalças de tamanho variável: " + vet[0].getQuantidade() +" Unidades");
				System.out.println("Camisas tamanho único: " + vet[1].getQuantidade()+" Unidades");
				System.out.println("Relógios: " + vet[2].getQuantidade()+" Unidades");
				System.out.println("Correntes: " + vet[3].getQuantidade()+" Unidades");
				System.out.println("Brincos: " + vet[4].getQuantidade()+" Unidades");
				System.out.println("\nVocê saiu do sistema!");
				System.exit(0);				
				break;
			default:
				System.out.println("\nEscolha uma opção válida!");
				System.out.print("\n0 – Calça tamanho variável\n" + "1 – Camisa tamanho único\n" + "2 – Relógio\n"
						+ "3 – Corrente\n" + "4 – Brinco\n" + "5 – Sair do sistema\n" + "\nOpção escolhida: ");
				opc = scan.nextInt();
				break;
			}

		} while (opc != 5);

		System.out.println("\nCalças de tamanho variável: " + vet[0].getQuantidade() +" Unidades");
		System.out.println("Camisas tamanho único: " + vet[1].getQuantidade()+" Unidades");
		System.out.println("Relógios: " + vet[2].getQuantidade()+" Unidades");
		System.out.println("Correntes: " + vet[3].getQuantidade()+" Unidades");
		System.out.println("Brincos: " + vet[4].getQuantidade()+" Unidades");

		System.out.println("\nVocê saiu do sistema!");
		scan.close();
	}
}

