package Questao_3;

public class TransacaoFinanceira {

    protected String identificadorTransicao;
    protected double valorBruto;
    protected Cliente cliente;

    public TransacaoFinanceira(String identificadorTransicao, double valorBruto, Cliente cliente) throws ValorTransacaoInvalidaException {
        if(valorBruto <= 0) {
            throw new ValorTransacaoInvalidaException("Valor da transação invalido: dever ser maior quer zero",valorBruto);
        }
        this.identificadorTransicao = identificadorTransicao;
        this.valorBruto = valorBruto;
        this.cliente = cliente;
    }

    public String getIdentificadorTransicao() {
        return identificadorTransicao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
