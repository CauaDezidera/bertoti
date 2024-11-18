import java.util.HashMap;
import java.util.Map;

class Estoque {
    
    private static Estoque instancia;

    
    private Map<String, Integer> produtos;

    
    private Estoque() {
        produtos = new HashMap<>();
    }

    public static Estoque getInstance() {
        if (instancia == null) {
            instancia = new Estoque();
        }
        return instancia;
    }

    
    public void adicionarProduto(String nome, int quantidade) {
        produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
    }

    
    public void removerProduto(String nome, int quantidade) {
        if (produtos.containsKey(nome) && produtos.get(nome) >= quantidade) {
            produtos.put(nome, produtos.get(nome) - quantidade);
        } else {
            System.out.println("Produto não disponível ou quantidade insuficiente.");
        }
    }

 
    public void exibirEstoque() {
        System.out.println("Estoque da Loja:");
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + " | Quantidade: " + entry.getValue());
        }
    }
}
