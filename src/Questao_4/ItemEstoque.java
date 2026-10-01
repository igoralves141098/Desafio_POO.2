package Questao_4;

public class ItemEstoque {

    protected String codigo;
    protected String descricao;
    protected int quantidade;

    public ItemEstoque(String codigo, String descricao, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void darBaixaEstoque(int qtd) throws EstoqueInsuficienteException{
        if(qtd>quantidade){
            throw new EstoqueInsuficienteException("Estoque insuficiente para realizar a baixa solicitade", qtd, quantidade);
        }
        quantidade -= qtd;
    }
}
