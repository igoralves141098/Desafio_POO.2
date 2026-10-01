package Questao_4;

public class EstoqueInsuficienteException extends RuntimeException {

    private final int quantidadeSolicitade;
    private final int quantidadeDisponivel;


    public EstoqueInsuficienteException(String message, int quantidadeSolicitada, int quantidadeDisponivel) {
        super(message);
        this.quantidadeSolicitade = quantidadeSolicitada;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getQuantidadeSolicitade() {
        return quantidadeSolicitade;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}
