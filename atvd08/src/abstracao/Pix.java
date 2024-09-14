package abstracao;

public class Pix extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " com Pix.");
    }

    @Override
    public void validarPagamento() {
        System.out.println("Validando pagamento com Pix.");
    }
}

