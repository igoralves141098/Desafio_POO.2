package Questao_8;

public class CapacidadeExcedidaException extends Exception {

    private int vcpusSolicitadas;
    private int limiteMaximo;

    public CapacidadeExcedidaException(String message, int vcpusSolicitadas, int limiteMaximo) {
        super(message);
        this.vcpusSolicitadas = vcpusSolicitadas;
        this.limiteMaximo = limiteMaximo;
    }

    public int getVcpusSolicitadas() {
        return vcpusSolicitadas;
    }

    public int getLimiteMaximo() {
        return limiteMaximo;
    }
}
