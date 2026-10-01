package Questao_3;

public class TransacaoCartaoCredito  extends TransacaoFinanceira {

    private String numeroCartaoMascarado;
    private int quantidadeParcelas;

    public TransacaoCartaoCredito(String identificadorTransacao, double valorBruto,Cliente cliente, String numeroCartaoMascarado, int quantidadeParcelas) throws ValorTransacaoInvalidaException {
        super(identificadorTransacao, valorBruto, cliente);
        this.numeroCartaoMascarado = numeroCartaoMascarado;
        this.quantidadeParcelas = quantidadeParcelas;
    }
    public String getNumeroCartaoMascarado() {
        return numeroCartaoMascarado;
    }
    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void calcularParcelaMensal() {
        double valorParcela = valorBruto / quantidadeParcelas;
        System.out.println("titular: " + cliente.getNomeTitular());
        System.out.println("Cartão: " + numeroCartaoMascarado);
        System.out.println("Valor de cada parcela: " + valorParcela);
    }
}