package Questao_1;

public class Main {
    public static void main(String[] args) {

        try {
            Medicamento medicamento = new Medicamento("Amoxicilina",5);
            Cachorro cachorro = new Cachorro("Bob",3,12,false,medicamento);
            cachorro.gerarReceitaMedica();
        }catch (PesoInvalidoException e){
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Peso informado: " + e.getPesoInformado());
        }

        try{
            Medicamento medicamento = new Medicamento("Dipirona",5);
            Cachorro dog = new Cachorro("baruck",4,-5,false,medicamento);
            dog.gerarReceitaMedica();
        }catch (PesoInvalidoException e){
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Peso informado: " + e.getPesoInformado());
        }
    }
}
