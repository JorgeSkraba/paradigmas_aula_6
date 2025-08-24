from Funcionario import Funcionario #Importando classe do arquivo

class FuncionarioRegular(Funcionario):
    def __init__(self, nome, id, salario_base):
        super().__init__(nome, id, salario_base)

    def calcular_bonus(self) -> float:
        if self.salario_base <= 5000:
            return self.salario_base * 0.10
        elif self.salario_base <= 10000:
            return self.salario_base * 0.15
        else:
            return 0
        
        