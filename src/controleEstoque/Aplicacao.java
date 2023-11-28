package controleEstoque;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Item[] vet = criarItens();
        Scanner scan = new Scanner(System.in);

        ComandoProcessor comandoProcessor = new ComandoProcessor();

        int opc;

        do {
            mostrarOpcoes();
            opc = scan.nextInt();

            comandoProcessor.processarComando(opc, null);

        } while (opc != vet.length);

        mostrarQuantidades(vet);

        System.out.println("\nVocê saiu do sistema!");
        scan.close();
    }

    private static Item[] criarItens() {
        Item[] vet = new Item[6];
        vet[0] = new RoupaPMG("Calcas de varios tamanhos!", 10, 10, 10, 5, 30);
        vet[1] = new RoupaTamanhoUnico("Camisas de tamanho unico!", 10, 5, 30);
        vet[2] = new Acessorio("Relogios prateados!", 5, 5, 30);
        vet[3] = new Acessorio("Correntes finas!", 5, 5, 30);
        vet[4] = new Acessorio("Brincos de ouro!", 5, 5, 30);
        vet[5] = new Acessorio("item!", 5, 5, 30);
        return vet;
    }

    private static void mostrarOpcoes() {
        System.out.print("\n0 - Calca tamanho variavel\n" + "1 - Camisa tamanho unico\n" + "2 - Relogio\n"
                + "3 - Corrente\n" + "4 - Brinco\n" + "5 - item\n" + "6 - Sair do sistema\n" + "\nOpcao escolhida: ");
    }

    private static void mostrarQuantidades(Item[] vet) {
        String[] itemNames = {"Calcas de tamanho variavel", "Camisas tamanho unico", "Relogios", "Correntes", "Brincos", "item"};
        
        for (int i = 0; i < vet.length; i++) {
            System.out.println(itemNames[i] + ": " + vet[i].getQuantidade() + " Unidades");
        }
    }
}
