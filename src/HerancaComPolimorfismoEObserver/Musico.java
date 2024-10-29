package HerancaComPolimorfismoEObserver;

public class Musico implements Observador {

    private String nome;

    @Override
    public void atualizarObservadores(String mensagem) {
        System.out.println(nome + " recebeu a notificação: " + mensagem);
    }

    public Musico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
