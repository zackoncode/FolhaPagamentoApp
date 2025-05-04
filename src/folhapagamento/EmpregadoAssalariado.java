package folhapagamento;

public class EmpregadoAssalariado extends Empregado {
    private double salarioMensal;

    public EmpregadoAssalariado(String nome, int id, double salarioMensal) {
        super(nome, id);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
