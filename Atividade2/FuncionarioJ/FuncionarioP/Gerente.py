from Funcionario import Funcionario

class Gerente(Funcionario):
    def __init__(self, nome, id, salario_base):
        super().__init__(nome, id, salario_base)

    def calcular_bonus(self) -> float:
        if self.salario_base > 10000 and self.salario_base <= 50000:
            return self.salario_base * 0.10
        elif self.salario_base <= 10000:
            return self.salario_base * 0.15
        else:
            return 0
        