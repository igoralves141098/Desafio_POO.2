package Questao_8;

public class ZonaDisponibilidade {

    private String nomeRegiao;
    private String codigoZona;

    public ZonaDisponibilidade(String nomeRegiao, String codigoZona) {
        this.nomeRegiao = nomeRegiao;
        this.codigoZona = codigoZona;
    }

    public String getNomeRegiao() {
        return nomeRegiao;
    }

    public String getCodigoZona() {
        return codigoZona;
    }
}
