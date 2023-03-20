package Repository;

import java.util.HashMap;
import java.util.Map;

import Domains.Produto;

public class ProdutoRepository {
    private int quantidadeProdutos = 0;
    private Map<Integer, Produto> produtos = new HashMap<Integer, Produto>();

    public void addProduto(Produto p) {
        produtos.put(p.getId(), p);
        this.quantidadeProdutos++;
    }

    public int getQuantidadeProdutos() {
        return this.quantidadeProdutos;
    }

}
