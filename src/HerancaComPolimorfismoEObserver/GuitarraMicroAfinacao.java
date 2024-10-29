package HerancaComPolimorfismoEObserver;

public class GuitarraMicroAfinacao extends Guitarra{

   private String tipoPonte;
   private String tipoTrava;

    public GuitarraMicroAfinacao(String afinacao, String madeira, String cor, String captacao, Integer qtCordas, Integer qtTrastes, String marca, String tipoPonte, String tipoTrava) {
        super(afinacao, madeira, cor, captacao, qtCordas, qtTrastes, marca);
        this.tipoPonte = tipoPonte;
        this.tipoTrava = tipoTrava;
    }

    @Override
    public void fazerSom() {
        System.out.println("Microafinacao fazendo som!!");
    }

    public String getTipoPonte() {
        return tipoPonte;
    }

    public void setTipoPonte(String tipoPonte) {
        this.tipoPonte = tipoPonte;
    }

    public String getTipoTrava() {
        return tipoTrava;
    }

    public void setTipoTrava(String tipoTrava) {
        this.tipoTrava = tipoTrava;
    }
}
