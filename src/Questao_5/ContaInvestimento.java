package Questao_5;

public class ContaInvestimento extends ContaBancaria{

    private double taxaRendimentoMensal;

    public ContaInvestimento(int numeroConta,String titular,double saldo,double taxaRendimentoMensal){
        super(numeroConta,titular,saldo);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public double getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }

    public void aplicarRendimentoMensal(){
        double rendimento = saldo * (taxaRendimentoMensal/100);
        saldo += rendimento;
        System.out.println("Rendimento aplcado: " + rendimento + " novo saldo: " + saldo);
    }
}
