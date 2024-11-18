// PortariaObserver.java
import java.util.ArrayList;
import java.util.List;

interface Portador {
    void atualizar(String evento);
}

class ConcretoPortador implements Portador {
    private String nome;
    private String eventoRecebido;

    public ConcretoPortador(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String evento) {
        this.eventoRecebido = evento;
        System.out.println(nome + " foi notificado do evento: " + evento);
    }
}

class Portaria {
    private List<Portador> portadores = new ArrayList<>();
    private String evento;

    // Adiciona um portador à lista
    public void adicionarPortador(Portador portador) {
        portadores.add(portador);
    }

    // Remove um portador da lista
    public void removerPortador(Portador portador) {
        portadores.remove(portador);
    }

    // Notifica todos os portadores sobre o evento
    public void notificarPortadores() {
        for (Portador portador : portadores) {
            portador.atualizar(evento);
        }
    }

    // Define o evento e notifica os portadores
    public void setEvento(String evento) {
        this.evento = evento;
        notificarPortadores();
    }

    public String getEvento() {
        return evento;
    }
}

public class Principal {
    public static void main(String[] args) {
        // Criação da portaria (sujeito)
        Portaria portaria = new Portaria();

        // Criação de portadores (observadores)
        ConcretoPortador portador1 = new ConcretoPortador("Portador 1");
        ConcretoPortador portador2 = new ConcretoPortador("Portador 2");

        // Adicionando portadores à portaria
        portaria.adicionarPortador(portador1);
        portaria.adicionarPortador(portador2);

        // Definindo um evento (chegada de visitante) e notificando os portadores
        portaria.setEvento("Novo visitante chegou");

        // Removendo um portador e alterando o evento novamente
        portaria.removerPortador(portador1);
        portaria.setEvento("Visitante autorizado a entrar");
    }
}
