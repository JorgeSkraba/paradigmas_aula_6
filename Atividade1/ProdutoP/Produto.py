class Produto:
    def __init__(self, nome, preco_unitario, quantidade_estoque):
        self.nome = nome
        self.preco_unitario = preco_unitario
        self.quantidade_estoque = quantidade_estoque

    def __str__(self):
        return f"{self.nome}({self.preco_unitario} * {self.quantidade_estoque})"

    def valor_total_estoque(self):
        return self.preco_unitario * self.quantidade_estoque



agua = Produto('agua',10,30)
arroz = Produto('arroz',4,60)
notebook = Produto('notebook',10,30)

print(agua)
print(agua.valor_total_estoque())

