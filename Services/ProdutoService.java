package Services;

import Domains.Produto;
import Repository.ProdutoRepository;

public class ProdutoService {
    ProdutoRepository produtoRepository = new ProdutoRepository();

    public void addProduto(String nome, String fabricante, double preco) {
        Produto p = new Produto(produtoRepository.getQuantidadeProdutos(), nome, fabricante, preco);
        produtoRepository.addProduto(p);
    }
}
