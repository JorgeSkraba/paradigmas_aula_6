package Desafio_5_Java;

public class Main {
    public static void main(String[] args) {
           // criando cliente
        Cliente cliente1 = new Cliente(1, "João");

        // criando contas
        ContaBancaria conta1 = new ContaBancaria(101, 500);
        ContaBancaria conta2 = new ContaBancaria(102, 1000);

        // associando contas ao cliente
        cliente1.adicionarConta(conta1);
        cliente1.adicionarConta(conta2);

        // operações
        conta1.depositar(200);  // saldo 500 + 200 = 700
        conta1.sacar(100);      // saldo 700 - 100 = 600
        conta2.sacar(2000);     // falha: saldo insuficiente

        // consultando saldos
        System.out.println("Saldo conta1: " + conta1.consultarSaldo());
        System.out.println("Saldo conta2: " + conta2.consultarSaldo());
    }
}
