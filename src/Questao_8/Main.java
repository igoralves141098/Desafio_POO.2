package Questao_8;

public class Main {
    public static void main(String[] args) {

        try{
            ZonaDisponibilidade zona = new ZonaDisponibilidade("Sudeste","1234");
            ServidorVirtual sev = new ServidorVirtual("1234567","computação",zona,8,2.5);

            sev.alocarProcessamento(16);
            sev.estimarCustoMensal(720);

            sev.alocarProcessamento(50);
        }catch (CapacidadeExcedidaException e){
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Vcpus Solicitadas: " + e.getVcpusSolicitadas());
            System.out.println("Limite maximo: " + e.getLimiteMaximo());
        }
    }
}
