public class DescontoPercentual implements DescontoStrategy {
    private final double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double aplicarDesconto(double preco) {
        return preco - (preco * percentual / 100);
    }
}
