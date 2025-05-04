package folhapagamento;

public abstract class Empregado {
    private String nome;
    private int id;

    public Empregado(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}
