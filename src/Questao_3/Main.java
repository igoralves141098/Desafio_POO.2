package Questao_3;


public class Main {
    public static void main(String[] args) {

        try {

            Cliente cliente = new Cliente("Igor","700.859.764-90");
            TransacaoCartaoCredito transacao = new TransacaoCartaoCredito("TX=001",1200,cliente,"1234 4567 7890 1234",4);
            transacao.calcularParcelaMensal();

        }catch (ValorTransacaoInvalidaException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("\n============================================");

       try {
           Cliente cliente = new Cliente("Igor Alves","800.959.964-50");
           TransacaoCartaoCredito transacaoInvalida = new TransacaoCartaoCredito("TX-002", 0,cliente,"1111 2222 3333 4444",2);
           transacaoInvalida.calcularParcelaMensal();

       } catch (ValorTransacaoInvalidaException e) {
           System.out.println("Erro: " + e.getMessage());
           System.out.println("Valor invalido: " + e.getValorInvalido());
       }
    }
}
