package abstracao;

public class Boleto extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " com boleto.");
    }

    @Override
    public void validarPagamento() {
        System.out.println("Validando pagamento com boleto.");
    }
}
