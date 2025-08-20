class ContaBancaria:
    def __init__(self, numero_conta, saldo_inicial=0):
        self.numero_conta = numero_conta
        self.__saldo = saldo_inicial
    
    def depositar(self, valor):
        if valor >0:
            self.__saldo += valor
            return True
        else:
            print("Depósito inválido, o valor precisa ser positivo")
            return False
        
    def sacar (self, valor):
        if valor <= 0:
            print("Saque inválido. O valor deve ser positivo")
            return False
        if valor > self.__saldo:
            print("Saque inválido. Saldo insuficiente")
            return False
        
        self.__saldo -= valor
        return True
    
    def consultar_saldo(self):
        return self.__saldo


class Cliente:
    def __init__(self, id, nome):
        self.id = id
        self.nome = nome   
        self.contas = []

    def adicionar_conta(self, conta):
        self.contas.append(conta)
        
        
if __name__ == "__main__":
    # Criando um cliente
    cliente1 = Cliente(1, "João")

    # Criando contas
    conta1 = ContaBancaria(101, 500)
    conta2 = ContaBancaria(102, 1000)

    # Associando contas
    cliente1.adicionar_conta(conta1)
    cliente1.adicionar_conta(conta2)

    # Operações
    conta1.depositar(200)
    conta1.sacar(100)
    conta2.sacar(2000)

    # Consultando saldos
    print("Saldo conta1:", conta1.consultar_saldo())
    print("Saldo conta2:", conta2.consultar_saldo())