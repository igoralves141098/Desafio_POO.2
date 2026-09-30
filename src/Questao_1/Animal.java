package Questao_1;

public class Animal {

    protected String nome;
    protected int idade;
    protected double peso;

    public Animal(String nome, int idade, double peso) throws PesoInvalidoException {
        if(peso <= 0){
            throw new PesoInvalidoException("Peso invalido para o animal: o valor deve ser maior que zero", peso);
        }
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
}
