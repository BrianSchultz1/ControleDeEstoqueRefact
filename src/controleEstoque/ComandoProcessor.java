package controleEstoque;

public class ComandoProcessor {

    private Command[] vet;

    public ComandoProcessor() {
        this.vet = new Command[]{ new VendaCommand(), new ReposicaoEstoqueCommand()};
    }

    public void processarComando(int option, Item i) {
            Command command = vet[option];
            command.execute(i);
    }
}
