import java.util.ArrayList;
import java.util.List;

class MenuCombinado implements ItemMenu {
    private String nome;
    private List<ItemMenu> itensMenu = new ArrayList<>();

    public MenuCombinado(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(ItemMenu item) {
        itensMenu.add(item);
    }

    public void removerItem(ItemMenu item) {
        itensMenu.remove(item);
    }

    @Override
    public void mostrarDescricao() {
        System.out.println(nome + ":");
        for (ItemMenu item : itensMenu) {
            item.mostrarDescricao();
        }
    }
}
