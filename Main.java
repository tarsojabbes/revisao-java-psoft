import Controllers.ProdutoController;

public class Main {

    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();
        
        produtoController.addProduto("Leite", "Parmalat", 7.5);
    }
}