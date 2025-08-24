package FuncionarioJ;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioRegular("João Silva", 101, 4500.00));
        funcionarios.add(new FuncionarioRegular("Maria Santos", 102, 8500.00));
        funcionarios.add(new FuncionarioRegular("Pedro Costa", 103, 12000.00));
        funcionarios.add(new Gerente("Carlos Oliveira", 201, 15000.00));
        funcionarios.add(new Gerente("Ana Pereira", 202, 35000.00));
        funcionarios.add(new Gerente("Paula Mendes", 203, 60000.00));

        System.out.println("=== SISTEMA DE FUNCIONÁRIOS ===\n");

        // Exibindo informações de todos os funcionários
        for (Funcionario func : funcionarios) {
            System.out.println("Tipo: " + func.getClass().getSimpleName());
            func.exibirInformacoes();
            System.out.println("---------------------------");
        }

        // Demonstrando polimorfismo
        System.out.println("\n=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        System.out.println("Total de funcionários: " + funcionarios.size());

        double totalFolha = 0;
        for (Funcionario func : funcionarios) {
            totalFolha += func.calcularSalarioTotal();
        }
        System.out.println("Total da folha de pagamento: R$ " + String.format("%.2f", totalFolha));

    }
}