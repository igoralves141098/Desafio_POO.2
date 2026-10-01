package Questao_7;

public class DocumentoFiscal {

    protected long numeroProtocolo;
    protected String dataEmissao;

    public DocumentoFiscal(long numeroProtocolo, String dataEmissao) {
        this.numeroProtocolo = numeroProtocolo;
        this.dataEmissao = dataEmissao;
    }

    public long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }
}
