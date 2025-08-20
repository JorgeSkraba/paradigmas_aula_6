package Desafio_5_Java;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial){
       this.numeroConta = numeroConta;
       this.saldo = saldoInicial;
    }

    public boolean depositar(double valor){
        if(valor<=0){
            System.out.println("O valor para depósito precisa ser positivo");
            return false;
        }
        
        this.saldo += valor;
        System.out.println("O valor "+valor+" foi depositado com sucesso!");
        return true;
    }

    public boolean sacar(double valor){
        if(valor<=0){
            System.out.println("O valor para saque precisa ser positivo");
            return false;
        }

        if(this.saldo < valor){
            System.out.println("O valor sacado não pode ser maior que o saldo");
            return false;
        }

        System.out.println("O saque no valor de "+valor+" foi feito com sucesso!");
        this.saldo -= valor;
        return true;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public double getNumeroConta(){
        return this.numeroConta;
    }
}   
