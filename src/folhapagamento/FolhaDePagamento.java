package folhapagamento;

public class FolhaDePagamento {
    public static void main(String[] args) {
        
        Empregado emp1 = new EmpregadoAssalariado("Lucas", 1, 3000.0);
        Empregado emp2 = new EmpregadoComissionado("Iza", 2, 20000.0, 0.1);
        Empregado emp3 = new EmpregadoHorista("Carlos", 3, 160, 20.0);

        
        Empregado[] empregados = new Empregado[3];
        empregados[0] = emp1;
        empregados[1] = emp2;
        empregados[2] = emp3;

        
        for (Empregado e : empregados) {
            System.out.println("Empregado: " + e.getNome());
            System.out.println("ID: " + e.getId());
            System.out.println("Salário: R$ " + e.calcularSalario());
            System.out.println("---------------------------");
        }
    }
} 
