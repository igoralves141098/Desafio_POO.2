package Questao_5;

public class Main {
    public static void main(String[] args) {

        // ContaBancaria é uma classe Abstrata não pode ser instanciada:

        try {
            ContaInvestimento cc = new ContaInvestimento(7589, "Igor", 1250.0, 12.0);
            cc.depositarValor(1120);
            System.out.println("Saldo atual: " + cc.getSaldo());

            cc.aplicarRendimentoMensal();
            cc.sacarValor(100000.00);
        }catch (SaldoInsuficienteException e){
            System.out.println("Erro: "  + e.getMessage());
            System.out.println("Valor da tentativa: " + e.getValorTentativa());
            System.out.println("saldo atual: " + e.getSaldoAtual());
        }
    }

}
