package controleEstoque;

public class VendaCommand implements Command {
 private Item item;

 public VendaCommand(Item item) {
     this.item = item;
 }

 @Override
 public void execute() {
     item.venda();
     item.reposicaoEstoque();
     System.out.println("\nAcao efetuada com sucesso!");
 }
}
