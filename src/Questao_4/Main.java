package Questao_4;

public class Main {
    public static void main(String[] args) {

        ProdutoPerecivel produto = new ProdutoPerecivel("1234","Arroz",4,2026);

        try{
            produto.darBaixaEstoque(10);
            System.out.println("Baixa realizada com sucesso, estoque atual: " + produto.getQuantidade());
        }catch(EstoqueInsuficienteException e){
            System.out.println("Erro:" + e.getMessage());
        }
        produto.verificarDescarte(2027);

        System.out.println("\n =======================================");

       try{
           produto.darBaixaEstoque(1000);
       }catch(EstoqueInsuficienteException e){
           System.out.println("Erro:" + e.getMessage());
           System.out.println("Quantidade solicitada: " + e.getQuantidadeSolicitade());
           System.out.println("Quantidade disponivel: " + e.getQuantidadeDisponivel());
       }

    }
}
