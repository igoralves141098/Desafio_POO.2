package Questao_1;

public class PesoInvalidoException extends Exception {

    private double pesoInformado;
    public PesoInvalidoException(String mensagem, double pesoInformado) {
        super(mensagem);
        this.pesoInformado = pesoInformado;
    }

    public double getPesoInformado() {
        return pesoInformado;
    }
}
