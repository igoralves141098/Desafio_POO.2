package Questao_2;

public class ContratoTrabalho {

    private String codigoContrato;
    private String departamento;
    private String cargo;

    public ContratoTrabalho(String codigoContrato, String departamento, String cargo) {
        this.codigoContrato = codigoContrato;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCargo() {
        return cargo;
    }
}
