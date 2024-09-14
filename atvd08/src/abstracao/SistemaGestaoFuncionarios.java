package abstracao;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario() + funcionario.calcularBonus();
        }
        return total;
    }

    public void promoverFuncionario(Funcionario funcionario, Funcionario novoFuncionario) {
        funcionarios.remove(funcionario);
        funcionarios.add(novoFuncionario);
    }
}