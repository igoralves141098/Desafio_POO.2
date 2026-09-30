package Questao_2;

public class Main {
    public static void main(String[] args) {

        try{
            ContratoTrabalho contrato = new ContratoTrabalho("CT-01","TI","Desenvolvedor Back-end");
            Desenvolvedor dev = new Desenvolvedor("Igor","700859764-90",contrato,"Java",6500);
            dev.exibirDadosCadastrais();
            dev.calcularDescontoInss();
        }catch(SalarioAbaixoDoPisoException e){
            System.out.println("Erro: " + e.getMessage());

        }

        System.out.println("\n =======================================");

        try{
            ContratoTrabalho contrato = new ContratoTrabalho("CT-02","TI","Desenvolvedor front-end");
            Desenvolvedor devInvalido = new Desenvolvedor("Lucas","111.222.333-44",contrato,"JavaScript",2000);
            devInvalido.exibirDadosCadastrais();
            devInvalido.calcularDescontoInss();
        }catch(SalarioAbaixoDoPisoException e){
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Salario informado: " + e.getSalarioInformado());
            System.out.println("Piso salario exigido: " + e.getPisoSalarial());
        }
    }
}
