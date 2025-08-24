#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Funcionario {
protected:
    string nome;
    int id;
    double salario_base;

public:
    // Constructor
    Funcionario(string nome, int id, double salario_base) {
        this->nome = nome;
        this->id = id;
        this->salario_base = salario_base;
    }

    // Método abstrato (puro virtual em C++)
    virtual double calcularBonus() = 0;

    double calcularSalarioTotal() {
        return salario_base + calcularBonus();
    }

    void exibirInformacoes() {
        cout << "Nome: " << nome << endl;
        cout << "ID: " << id << endl;
        cout << "Salário Base: R$ " << salario_base << endl;
        cout << "Bônus: R$ " << calcularBonus() << endl;
        cout << "Salário Total: R$ " << calcularSalarioTotal() << endl;
    }

    // Getters e Setters
    string getNome() {
        return nome;
    }

    void setNome(string nome) {
        this->nome = nome;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this->id = id;
    }

    double getSalarioBase() {
        return salario_base;
    }

    void setSalarioBase(double salario_base) {
        this->salario_base = salario_base;
    }

    // Destructor virtual
    virtual ~Funcionario() {}
};

class FuncionarioRegular : public Funcionario {
public:
    FuncionarioRegular(string nome, int id, double salario_base) 
        : Funcionario(nome, id, salario_base) {}

    double calcularBonus() override {
        if(salario_base <= 5000) {
            return salario_base * 0.10;
        } else if (salario_base > 5000 && salario_base <= 10000) {
            return salario_base * 0.15;
        } else {
            return 0;
        }
    }
};

class Gerente : public Funcionario {
public:
    Gerente(string nome, int id, double salario_base) 
        : Funcionario(nome, id, salario_base) {}

    double calcularBonus() override {
        if(salario_base > 10000 && salario_base <= 50000) {
            return salario_base * 0.20;
        } else if (salario_base > 50000) {
            return salario_base * 0.25;
        } else {
            return 0;
        }
    }
};


int main() {
    vector<Funcionario*> funcionarios;
    
    funcionarios.push_back(new FuncionarioRegular("João Silva", 101, 4500.00));
    funcionarios.push_back(new FuncionarioRegular("Maria Santos", 102, 8500.00));
    funcionarios.push_back(new Gerente("Carlos Oliveira", 201, 15000.00));
    funcionarios.push_back(new Gerente("Ana Pereira", 202, 60000.00));
        
    for (Funcionario* func : funcionarios) {
        func->exibirInformacoes();
        cout << "---------------------------" << endl;
    }
    
    for (Funcionario* func : funcionarios) {
        delete func;
    }
    
    return 0;
}