package Questao_2;

public class SalarioAbaixoDoPisoException extends Exception {

    private final double salarioInformado;
    private final double pisoSalarial;

    public SalarioAbaixoDoPisoException(String message, double salarioInformado, double pisoSalarial) {
        super(message);
        this.salarioInformado = salarioInformado;
        this.pisoSalarial = pisoSalarial;
    }
    public double getSalarioInformado() {
        return salarioInformado;
    }
    public double getPisoSalarial() {
        return pisoSalarial;
    }
}