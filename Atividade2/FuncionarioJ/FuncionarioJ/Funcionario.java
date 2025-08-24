package FuncionarioJ;
public abstract class Funcionario{

    private String nome;
    private int id;
    private double salario_base;

    //Constructor
    public Funcionario(String nome, int id, double salario_base){
        this.nome = nome;
        this.id = id;
        this.salario_base = salario_base;
    }

    public abstract double calcularBonus();

    public double calcularSalarioTotal(){
        return salario_base + calcularBonus();
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Salário Base: R$ " + salario_base);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("Salário Total: R$ " + calcularSalarioTotal());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salario_base;
    }

    public void setSalarioBase(double salario_base) {
        this.salario_base = salario_base;
    }
}