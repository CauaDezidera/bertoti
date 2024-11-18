public class Principal {
    public static void main(String[] args) {
        ItemDeRoupa camisa = new ItemDeRoupa("Camisa", 50, new SemDesconto());
        ItemDeRoupa calca = new ItemDeRoupa("Calca", 100, new DescontoPercentual(20));
        ItemDeRoupa jaqueta = new ItemDeRoupa("Jaqueta", 200, new DescontoFixo(50));

        System.out.println(camisa);
        System.out.println(calca);
        System.out.println(jaqueta);

    
        camisa.setDescontoStrategy(new DescontoPercentual(10));
        System.out.println("Aplicar 10% de desconto na camisa:");
        System.out.println(camisa);
    }
}
