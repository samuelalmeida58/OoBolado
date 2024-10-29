package HerancaComPolimorfismoEObserver;

import java.util.ArrayList;
import java.util.List;

public class Guitarra {

    private String afinacao;
    private String madeira;
    private String cor;
    private String captacao;
    private Integer qtCordas;
    private Integer qtTrastes;
    private String marca;

    private List<Observador> observadores = new ArrayList<>();

    public Guitarra(String afinacao, String madeira, String cor, String captacao, Integer qtCordas, Integer qtTrastes, String marca) {
        this.afinacao = afinacao;
        this.madeira = madeira;
        this.cor = cor;
        this.captacao = captacao;
        this.qtCordas = qtCordas;
        this.qtTrastes = qtTrastes;
        this.marca = marca;
    }

    public String Configurar(String afinacao) {
        this.notificarObservadores("Configuracao 1 foi executada");
       return "HerancaComPolimorfismoEObserver.Guitarra afinada em: " + afinacao;
    }

    public String Configurar(String afinacao, String captacao) {
        this.notificarObservadores("Configuracao 2 foi executada");
        return Configurar(afinacao) + " Com captação: " + captacao;
    }

    public String Configurar(String afinacao, String captacao, String marca, String cor) {
        this.notificarObservadores("Configuracao 3 foi executada");
        return Configurar(afinacao, captacao) + " De marca: " + marca + " e com cor: " + cor;
    }

    public void fazerSom() {
        System.out.println("Bennd");
    }

    public void chorar() {
        System.out.println("A guitarra esta chorando!");
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores(String mensagem) {
        for (Observador obs : observadores) {
            obs.atualizarObservadores(mensagem);
        }
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }

    public String getMadeira() {
        return madeira;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCaptacao() {
        return captacao;
    }

    public void setCaptacao(String captacao) {
        this.captacao = captacao;
    }

    public Integer getQtCordas() {
        return qtCordas;
    }

    public void setQtCordas(Integer qtCordas) {
        this.qtCordas = qtCordas;
    }

    public Integer getQtTrastes() {
        return qtTrastes;
    }

    public void setQtTrastes(Integer qtTrastes) {
        this.qtTrastes = qtTrastes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
