package abstracao;

public class CartaoCredito extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " no cartão de crédito.");
    }

    @Override
    public void validarPagamento() {
        System.out.println("Validando pagamento com cartão de crédito.");
    }
}