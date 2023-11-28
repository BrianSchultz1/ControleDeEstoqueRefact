package controleEstoque;

abstract class EstoqueCommand implements Command {
 protected Item item;

 public EstoqueCommand(Item item) {
  this.item = item;
 }

}
