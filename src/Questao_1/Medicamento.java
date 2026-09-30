package Questao_1;

public class Medicamento {

    private String nomeRemedio;
    private double dosagemPorKg;

    public Medicamento(String nomeRemedio, double dosagemPorKg) {
        this.nomeRemedio = nomeRemedio;
        this.dosagemPorKg = dosagemPorKg;
    }
    public String getNomeRemedio() {
        return nomeRemedio;

    }
    public double getDosagemPorKg() {
        return dosagemPorKg;
    }
}
