package Questao_5;

public class SaldoInsuficienteException extends Exception {

    private final double valorTentativa;
    private final double saldoAtual;

    public SaldoInsuficienteException(String mensagem,double valorTentativa, double saldoAtual) {
        super(mensagem);
        this.valorTentativa = valorTentativa;
        this.saldoAtual = saldoAtual;

    }

    public double getValorTentativa() {
        return valorTentativa;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
