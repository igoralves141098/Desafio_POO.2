package Questao_7;

public class NFeExportacao extends NotaFiscalEletronica{

    private String paisDestino;
    private double tarifaAduaneira;

    public NFeExportacao(long numeroProtocolo, String dataEmissao, String chaveAcesso, double valorTotal,String paisDestino,double tarifaAduaneira) throws TarifaInvalidaException {
        super(numeroProtocolo, dataEmissao, chaveAcesso, valorTotal);
        if(tarifaAduaneira<0){
            throw new TarifaInvalidaException("Tarifa aduaneira não pode ser negativa!",tarifaAduaneira);
        }
        this.paisDestino = paisDestino;
        this.tarifaAduaneira = tarifaAduaneira;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public double getTarifaAduaneira() {
        return tarifaAduaneira;
    }

    public void calcularCustoFinalComTarifa(){
        double custoFinal = valorTotal + tarifaAduaneira;
        System.out.println("Protocolo: " + numeroProtocolo);
        System.out.println("Pais de Destino: " + paisDestino);
        System.out.println("Custo final com tarifa: " + custoFinal);
    }
}
