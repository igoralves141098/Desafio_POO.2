package Questao_6;

public class DispositivoSeguranca {

    protected String numeroSerie;
    protected String fabricante;

    public DispositivoSeguranca(String numeroSerie, String fabricante) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }
}
