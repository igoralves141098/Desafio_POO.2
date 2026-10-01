package Questao_7;

public class NotaFiscalEletronica extends DocumentoFiscal{

    protected String chaveAcesso;
    protected double valorTotal;

    public NotaFiscalEletronica(long numeroProtocolo, String dataEmissao,String chaveAcesso, double valorTotal) {
        super(numeroProtocolo, dataEmissao);
        this.chaveAcesso = chaveAcesso;
        this.valorTotal = valorTotal;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
