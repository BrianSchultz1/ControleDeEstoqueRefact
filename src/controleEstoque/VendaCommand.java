package controleEstoque;

class VendaCommand implements Command {


    @Override
    public void execute(Item item) {
        item.venda();
    }
}