package Questao_3;

public class ValorTransacaoInvalidaException extends Exception {

    double valorInvalido;

    public ValorTransacaoInvalidaException(String message, double valorInvalido) {

        super(message);
        this.valorInvalido = valorInvalido;
    }
    public double getValorInvalido() {
        return valorInvalido;
    }
}
