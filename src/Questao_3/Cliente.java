package Questao_3;

public class Cliente {
    private String nomeTitular;
    private String cpf;

    public Cliente(String nomeTitular, String cpf) {
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }
}
