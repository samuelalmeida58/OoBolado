package ObserverGoogleFlights;

import java.util.ArrayList;
import java.util.List;

public class Passagem {
    private List<Observador> observadores = new ArrayList<>();
    private String destino;
    private double preco;

    public Passagem(String destino, double preco) {
        this.destino = destino;
        this.preco = preco;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(preco);
        }
    }

    public String getDestino() {
        return destino;
    }

    public double getPreco() {
        return preco;
    }
}
