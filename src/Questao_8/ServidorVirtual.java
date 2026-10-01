package Questao_8;

public class ServidorVirtual extends RecursoNuvem{

    private static final int Limite_Maximo_Vcpus = 64;

    private int quantidadesCPUs;
    private double custoPorHora;

    public ServidorVirtual(String idInstancia,String nomeServico,ZonaDisponibilidade zonaDisponibilidade, int quantidadesCPUs, double custoPorHora) {
        super(idInstancia,nomeServico,zonaDisponibilidade);
        this.quantidadesCPUs = quantidadesCPUs;
        this.custoPorHora = custoPorHora;
    }

    public int getQuantidadesCPUs() {
        return quantidadesCPUs;
    }

    public double getCustoPorHora() {
        return custoPorHora;
    }

    public void alocarProcessamento(int novasVcpus) throws CapacidadeExcedidaException{
        int totalSolicitado = quantidadesCPUs + novasVcpus;
        if(totalSolicitado>Limite_Maximo_Vcpus){
            throw new CapacidadeExcedidaException("Capacidade de Vcpus excedida para o servidor virtual.",totalSolicitado,Limite_Maximo_Vcpus);
        }
        quantidadesCPUs = totalSolicitado;
    }

    public void estimarCustoMensal(int totalHoras){
        double custoMensal = totalHoras*custoPorHora;
        System.out.println("Instância: " + getIdInstancia());
        System.out.println("Zona: " + zonaDisponibilidade.getNomeRegiao() + " ( " + zonaDisponibilidade.getCodigoZona()+ " ) ");
        System.out.println("Custo mensal estimado: " + custoMensal);
    }
}
