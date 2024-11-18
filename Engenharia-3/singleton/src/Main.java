public class Main {
    public static void main(String[] args) {
       
        Estoque estoque1 = Estoque.getInstance();
        Estoque estoque2 = Estoque.getInstance();

      
        System.out.println("São as mesmas instâncias? " + (estoque1 == estoque2));

        estoque1.adicionarProduto("Camiseta", 50);
        estoque1.adicionarProduto("Calça", 30);

    
        estoque1.exibirEstoque();

        
        estoque2.removerProduto("Camiseta", 10);

        estoque1.exibirEstoque();
    }
}
