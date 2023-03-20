package Controllers;

import Services.ProdutoService;

public class ProdutoController {
    
    ProdutoService produtoService = new ProdutoService();

    public void addProduto(String nome, String fabricante, double preco) {
        produtoService.addProduto(nome, fabricante, preco);
    }
}
