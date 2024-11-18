public class SemDesconto implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco; 
    }
}
