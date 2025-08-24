#include <iostream>
#include <vector>
#include <string>

class ContaBancaria {
    private:
      int numeroConta;
      double saldo;

    public:
      ContaBancaria(int numeroConta, double saldoInicial = 0){
        this->numeroConta = numeroConta;
        this->saldo = saldoInicial;
      }

    bool depositar(double valor){
        if(valor > 0){
            std::cout << "O valor foi depositado com sucesso!" << std::endl;
            return true;
        } else{
             std::cout << "O valor precisa ser positivo." << std::endl;
             return false;
        }
    }

    bool sacar(double valor){
        if(valor <= 0){
             std::cout << "O valor precisa ser positivo." << std::endl;
             return false;
        }

        if(this->saldo < valor){
             std::cout << "O valor sacado é maior que o saldo!" << std::endl;
             return false;
        }

        std::cout << "O valor foi sacado com sucesso! " << std::endl;
        this->saldo -= valor;
        return true;
    }

    double consultarSaldo(){
        return saldo;
    }

    int getNumeroConta(){
        return numeroConta;
    }

};

class Cliente{
    private:
     int id;
     std::string nome;
     std::vector<ContaBancaria*> contas;

    public:
    Cliente(int id, std::string nome){
        this->id=id;
        this->nome=nome;
    }

    void adicionarConta(ContaBancaria* conta){
        contas.push_back(conta);
    }

    std::vector<ContaBancaria*> getContas(){
        return contas;
    }

    int getId(){
        return id;
    }

    std::string getNome(){
        return nome;
    }


    
   int main() {
    // criando cliente
    Cliente cliente1(1, "João");

    // criando contas
    ContaBancaria conta1(101, 500);
    ContaBancaria conta2(102, 1000);

    // associando contas ao cliente
    cliente1.adicionarConta(&conta1);
    cliente1.adicionarConta(&conta2);

    // operações
    conta1.depositar(200);   // saldo 500 + 200 = 700
    conta1.sacar(100);       // saldo 700 - 100 = 600
    conta2.sacar(2000);      // falha: saldo insuficiente

    // consultando saldos
    std::cout << "Saldo conta1: " << conta1.consultarSaldo() << std::endl;
    std::cout << "Saldo conta2: " << conta2.consultarSaldo() << std::endl;

    return 0;
}
};