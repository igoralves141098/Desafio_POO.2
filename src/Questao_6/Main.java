package Questao_6;

public class Main {
    public static void main(String[] args) {

        try{
            TerminalPOS terminal = new TerminalPOS("SN-2024-001","Ingenico","Chave123",2.5);
            terminal.autorizarVenda(150);
        }catch (ChaveSegurancaInvalidaException e){
            System.out.println("erro: " + e.getMessage());
        }

        System.out.println("\n====================================");

        try{
            TerminalPOS terminalInvalido = new TerminalPOS("SN-2026-002","Gertec","123",3);
            terminalInvalido.autorizarVenda(150);
        } catch (ChaveSegurancaInvalidaException e) {
            System.out.println("erro: " + e.getMessage());
            System.out.println("Tamanho da chave informada: " + e.getTamanhoChaveInformada());
            System.out.println("Tamanho minimo exigido: " + e.getTamanhoMinimoExigido());
        }
    }
}
