package FuncionarioJ;
public class Gerente extends Funcionario{

    public Gerente(String nome, int id, double salario_base){
        super(nome, id, salario_base);
    }

    @Override
    public double calcularBonus(){
        double salario_base = getSalarioBase();

        if(salario_base > 10000 && salario_base <= 50000) return salario_base * 0.20;
        if (salario_base > 50000) return salario_base * 0.25;
        return 0;
    }
}