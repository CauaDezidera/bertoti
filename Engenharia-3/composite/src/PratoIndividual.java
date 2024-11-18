class PratoIndividual implements ItemMenu {
    private String nome;
    private double preco;

    public PratoIndividual(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void mostrarDescricao() {
        System.out.println(nome + " - R$ " + preco);
    }
}
