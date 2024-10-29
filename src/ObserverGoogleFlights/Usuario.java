package ObserverGoogleFlights;

public class Usuario implements Observador{
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(double novoPreco) {
        System.out.println(nome + ", o preço da passagem que você segue mudou para: R$" + novoPreco);

    }
}
