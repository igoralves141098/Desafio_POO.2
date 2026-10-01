package Questao_6;

public class ChaveSegurancaInvalidaException extends Exception {

    private final int tamanhoChaveInformada;
    private final int tamanhoMinimoExigido;

    public ChaveSegurancaInvalidaException(String message,int tamanhoChaveInformada,int tamanhoMinimoExigido) {
        super(message);
        this.tamanhoChaveInformada = tamanhoChaveInformada;
        this.tamanhoMinimoExigido = tamanhoMinimoExigido;
    }

    public int getTamanhoChaveInformada() {
        return tamanhoChaveInformada;
    }

    public int getTamanhoMinimoExigido() {
        return tamanhoMinimoExigido;
    }
}
