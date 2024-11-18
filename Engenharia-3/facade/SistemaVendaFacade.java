class SistemaVendaFacade {
    private ControleEstoque controleEstoque;
    private SistemaPagamento sistemaPagamento;
    private EmbalagemProduto embalagemProduto;

    
    public SistemaVendaFacade() {
        this.controleEstoque = new ControleEstoque();
        this.sistemaPagamento = new SistemaPagamento();
        this.embalagemProduto = new EmbalagemProduto();
    }

    public void realizarVenda(String produto, double valor) {
        if (controleEstoque.verificarDisponibilidade(produto)) {
            if (sistemaPagamento.processarPagamento(valor)) {
                embalagemProduto.embalar(produto);
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Falha no pagamento!");
            }
        } else {
            System.out.println("Produto não disponível em estoque.");
        }
    }
}
