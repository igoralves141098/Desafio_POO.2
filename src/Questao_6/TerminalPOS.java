package Questao_6;

public final class TerminalPOS extends DispositivoSeguranca {

    private static final int TAMANHO_MINIMO_CHAVE = 8;

    private String chaveCriptografia;
    private double tarifaPorOperacao;

    public TerminalPOS(String numeroSerie, String fabricante, String chaveCriptografia, double tarifaPorOperacao)
            throws ChaveSegurancaInvalidaException {
        super(numeroSerie, fabricante);
        int tamanhoInformado = (chaveCriptografia == null) ? 0 : chaveCriptografia.length();
        if (chaveCriptografia == null || chaveCriptografia.length() < TAMANHO_MINIMO_CHAVE) {
            throw new ChaveSegurancaInvalidaException(
                    "Chave de seguranca invalida: comprimento menor que o minimo exigido.",
                    tamanhoInformado, TAMANHO_MINIMO_CHAVE);
        }
        this.chaveCriptografia = chaveCriptografia;
        this.tarifaPorOperacao = tarifaPorOperacao;
    }

    public String getChaveCriptografia() {

        return chaveCriptografia;
    }

    public double getTarifaPorOperacao() {

        return tarifaPorOperacao;
    }

    public void autorizarVenda(double valorBruto) {
        double valorLiquido = valorBruto - tarifaPorOperacao;
        System.out.println("Terminal (numero de serie): " + numeroSerie);
        System.out.println("Valor final da venda: " + valorLiquido);
    }
}


