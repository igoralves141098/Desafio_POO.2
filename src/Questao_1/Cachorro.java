package Questao_1;

public class Cachorro extends Animal {

    private boolean temDermatite;
    private Medicamento medicamento;


    public Cachorro(String nome, int idade, double peso, boolean temDermatite,Medicamento medicamento) throws PesoInvalidoException {
        super(nome, idade, peso);
        this.temDermatite = temDermatite;
        this.medicamento = medicamento;
    }

    public boolean isTemDermatite() {
        return temDermatite;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void gerarReceitaMedica() {
        double totalMl = peso * medicamento.getDosagemPorKg();
        System.out.println("Animal: " + nome);
        System.out.println("Medicamento: " + medicamento.getNomeRemedio());
        System.out.println("Total a administrar: " + totalMl);

    }

}
