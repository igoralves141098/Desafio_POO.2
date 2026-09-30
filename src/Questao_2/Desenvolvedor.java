package Questao_2;

public class Desenvolvedor extends Colaborador{

    private final double piso_salarial = 3000.00;

    private String linguagemPrincipal;
    private double salarioBruto;


    public Desenvolvedor(String nome, String cpf, ContratoTrabalho contrato,String linguagemPrincipal,double salarioBruto) throws SalarioAbaixoDoPisoException {
        super(nome, cpf, contrato);

        if (salarioBruto < piso_salarial) {
            throw new SalarioAbaixoDoPisoException("Salario informado está abaixo do piso salarial exigido.",salarioBruto,piso_salarial);
        }
        this.salarioBruto = salarioBruto;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void calcularDescontoInss(){
        double desconto = salarioBruto * 0.14;
        System.out.println("Desenvolvedor: " + nome);
        System.out.println("Desconto do INSS de 14%: " + desconto);
    }
}
