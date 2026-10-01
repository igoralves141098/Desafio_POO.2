package Questao_4;

public class ProdutoPerecivel extends ItemEstoque{

    private int anoValidade;

    public ProdutoPerecivel(String codigo,String descricao, int quantidade, int anoValidade) {
        super(codigo,descricao,quantidade);
        this.anoValidade = anoValidade;
    }

    public int getAnoValidade() {
        return anoValidade;
    }

    public void verificarDescarte(int anoAtual){
        if(anoAtual>anoValidade){
            System.out.println("ALERTA DE DESCARTE: o produto "+ descricao + " esta vencido");
        }else {
            System.out.println("O produto " + descricao + " está dentro da validade!");
        }
    }
}
