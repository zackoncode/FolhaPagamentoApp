package folhapagamento;

public class EmpregadoHorista extends Empregado {
    private double horasTrabalhadas;
    private double valorHora;

    public EmpregadoHorista(String nome, int id, double horasTrabalhadas, double valorHora) {
        super(nome, id);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
