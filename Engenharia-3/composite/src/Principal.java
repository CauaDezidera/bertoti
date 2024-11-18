public class Principal {
    public static void main(String[] args) {
      
        PratoIndividual hamburguer = new PratoIndividual("Hambúrguer", 15.00);
        PratoIndividual batataFrita = new PratoIndividual("Batata Frita", 7.50);
        PratoIndividual refrigerante = new PratoIndividual("Refrigerante", 5.00);

        
        MenuCombinado combo1 = new MenuCombinado("Combo 1");
        combo1.adicionarItem(hamburguer);
        combo1.adicionarItem(batataFrita);
        combo1.adicionarItem(refrigerante);

        
        MenuCombinado combo2 = new MenuCombinado("Combo 2");
        combo2.adicionarItem(batataFrita);
        combo2.adicionarItem(refrigerante);

        System.out.println("Menu da Lanchonete:");
        hamburguer.mostrarDescricao();
        batataFrita.mostrarDescricao();
        refrigerante.mostrarDescricao();
        combo1.mostrarDescricao();
        combo2.mostrarDescricao();
    }
}
