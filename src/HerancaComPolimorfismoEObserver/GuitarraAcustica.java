package HerancaComPolimorfismoEObserver;

public class GuitarraAcustica extends Guitarra{

    private String tipoBlend;
    private String tamanhoAbertuda;

    public GuitarraAcustica(String afinacao, String madeira, String cor, String captacao, Integer qtCordas, Integer qtTrastes, String marca, String tipoBlend, String tamanhoAbertuda) {
        super(afinacao, madeira, cor, captacao, qtCordas, qtTrastes, marca);
        this.tipoBlend = tipoBlend;
        this.tamanhoAbertuda = tamanhoAbertuda;
    }

    @Override
    public void chorar() {
        System.out.println("HerancaComPolimorfismoEObserver.Guitarra FILHA acustica esta chorando!");
    }

    public String getTipoBlend() {
        return tipoBlend;
    }

    public void setTipoBlend(String tipoBlend) {
        this.tipoBlend = tipoBlend;
    }

    public String getTamanhoAbertuda() {
        return tamanhoAbertuda;
    }

    public void setTamanhoAbertuda(String tamanhoAbertuda) {
        this.tamanhoAbertuda = tamanhoAbertuda;
    }
}
