package Questao_7;

public class Main {
    public static void main(String[] args) throws TarifaInvalidaException {

        try {
            NFeExportacao NFe = new NFeExportacao(202601,"01/10/2026","chave123",1250,"França",14.5);
            NFe.calcularCustoFinalComTarifa();
        } catch (TarifaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=====================================");

        try {
            NFeExportacao NFeInvalida = new NFeExportacao(202602,"01/10/2026","chave1234",1400,"Argentina",-55);
        } catch (TarifaInvalidaException e) {
            System.out.println("Erro:" + e.getMessage());
            System.out.println("Tarifa informada: " + e.getTarifaInformada());
        }
    }
}
