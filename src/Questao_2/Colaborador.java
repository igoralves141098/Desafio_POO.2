package Questao_2;


public class Colaborador {

    protected String nome;
    protected String cpf;
    protected ContratoTrabalho contrato;

    public Colaborador(String nome, String cpf, ContratoTrabalho contrato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contrato = contrato;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ContratoTrabalho getContrato() {
        return contrato;
    }

    public void exibirDadosCadastrais() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Contrato: " + contrato.getCodigoContrato() + " | Departamento: " + contrato.getDepartamento() + " | Cargo: " + contrato.getCargo());
    }
}
