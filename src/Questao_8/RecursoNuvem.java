package Questao_8;

public abstract class RecursoNuvem {

    protected String idInstancia;
    protected String nomeServico;
    protected ZonaDisponibilidade zonaDisponibilidade;

    public RecursoNuvem(String idInstancia, String nomeServico, ZonaDisponibilidade zonaDisponibilidade) {
        this.idInstancia = idInstancia;
        this.nomeServico = nomeServico;
        this.zonaDisponibilidade = zonaDisponibilidade;
    }

    public String getIdInstancia() {
        return idInstancia;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public ZonaDisponibilidade getZonaDisponibilidade() {
        return zonaDisponibilidade;
    }
}
