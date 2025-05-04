package folhapagamento;

public class EmpregadoComissionado extends Empregado {
    private double vendas;
    private double percentualComissao;

    public EmpregadoComissionado(String nome, int id, double vendas, double percentualComissao) {
        super(nome, id);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return vendas * percentualComissao;
    }
}
