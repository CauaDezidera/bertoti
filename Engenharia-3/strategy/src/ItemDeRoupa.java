public class ItemDeRoupa {
    private final String nome;
    private final double preco;
    private DescontoStrategy descontoStrategy;

    public ItemDeRoupa(String nome, double preco, DescontoStrategy descontoStrategy) {
        this.nome = nome;
        this.preco = preco;
        this.descontoStrategy = descontoStrategy;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double getPrecoFinal() {
        return descontoStrategy.aplicarDesconto(preco);
    }

    @Override
    public String toString() {
        return nome + " - Preco Final: R$ " + getPrecoFinal();
    }
}
