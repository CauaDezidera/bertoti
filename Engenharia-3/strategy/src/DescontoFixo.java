public class DescontoFixo implements DescontoStrategy {
    private final double valorDesconto;

    public DescontoFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double aplicarDesconto(double preco) {
        return Math.max(0, preco - valorDesconto); 
    }
}
