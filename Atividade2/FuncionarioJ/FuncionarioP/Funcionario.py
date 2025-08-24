from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, nome, id, salario_base):
        #Para montar atributos utiliza-se self.atributo = parametro
        self.nome = nome
        self.id = id
        self.salario_base = salario_base

    @abstractmethod    
    def calcular_bonus(self) -> float:
        pass

    def calcular_salario_total(self) -> float:
        return self.salario_base + self.calcular_bonus()
    
    def exibir_informacoes(self):
        print(f"Nome: {self.nome}")
        print(f"ID: {self.id}")
        print(f"Salário Base: {self.salario_base}")
        print(f"Bônus: {self.calcular_bonus}")
        print(f"Salario Total: {self.calcular_salario_total}")
