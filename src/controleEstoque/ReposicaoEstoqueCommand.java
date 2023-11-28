package controleEstoque;

class ReposicaoEstoqueCommand implements Command {


    @Override
    public void execute(Item item) {
        item.reposicaoEstoque();
    }
}