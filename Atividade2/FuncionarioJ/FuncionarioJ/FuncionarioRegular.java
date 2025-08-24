package FuncionarioJ;
public class FuncionarioRegular extends Funcionario{

    public FuncionarioRegular(String nome, int id, double salario_base){
        super(nome, id, salario_base);
    }

    @Override
    public double calcularBonus(){
        double salario_base = getSalarioBase();

        if(salario_base <= 5000){
            return salario_base * 0.10;
        } else if (salario_base > 5000 && salario_base <= 10000) {
            return salario_base * 0.15;
        }else
            return 0;
    }
}