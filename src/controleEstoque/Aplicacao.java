package controleEstoque;
import java.util.Scanner;


public class Aplicacao {

    public static void main(String[] args) {
        Item[] vet = new Item[5];
        vet[0] = new RoupaPMG("Calcas de varios tamanhos!", 10, 10, 10, 5, 30);
        vet[1] = new RoupaTamanhoUnico("Camisas de tamanho unico!", 10, 5, 10);
        vet[2] = new Acessorio("Relogios prateados!", 5, 5, 10);
        vet[3] = new Acessorio("Correntes finas!", 5, 5, 10);
        vet[4] = new Acessorio("Brincos de ouro!", 5, 5, 10);

        Scanner scan = new Scanner(System.in);

        System.out.print(" 0 - Calca tamanho variavel\n" + " 1 - Camisa tamanho unico\n" + " 2 - Relogio\n"
                + " 3 - Corrente fina\n" + " 4 - Brinco de Ouro\n" + " 5 - Para sair do sistema\n" + "\n Opcao escolhida: ");

        int opc = scan.nextInt();

        while (opc != 5) {
            if (opc >= 0 && opc < vet.length) {
                Command command = new VendaCommand(vet[opc]);
                command.execute();
            } else {
                System.out.println("\nEscolha uma opção válida!");
            }

            System.out.print("\n0 - Calca tamanho variavel\n" + "1 - Camisa tamanho unico\n" + "2 - Relógio\n"
                    + "3 - Corrente\n" + "4 - Brinco\n" + "5 - Sair do sistema\n" + "\nOpcao escolhida: ");
            opc = scan.nextInt();
        }

        System.out.println("\nCalcas de tamanho variavel: " + vet[0].getQuantidade() + " Unidades");
        System.out.println("Camisas tamanho unico: " + vet[1].getQuantidade() + " Unidades");
        System.out.println("Relogios: " + vet[2].getQuantidade() + " Unidades");
        System.out.println("Correntes: " + vet[3].getQuantidade() + " Unidades");
        System.out.println("Brincos: " + vet[4].getQuantidade() + " Unidades");

        System.out.println("\nVoce saiu do sistema!");
        scan.close();
    }
}