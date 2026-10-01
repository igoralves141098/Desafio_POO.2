package Questao_7;

public class TarifaInvalidaException extends Exception {

    private double tarifaInformada;

    public TarifaInvalidaException(String message,double tarifaInformada) {
        super(message);
        this.tarifaInformada = tarifaInformada;
    }
    public double getTarifaInformada() {
        return tarifaInformada;
    }
}
