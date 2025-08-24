class Livro:
    def __init__(self, titulo, numero_paginas):
        self.titulo = titulo
        self.__numero_paginas = 0
        self.set_numero_paginas(numero_paginas)

    def get_numero_paginas(self):
        return self.__numero_paginas
    
    def set_numero_paginas(self, paginas):
        if paginas > 0:
            self.__numero_paginas = paginas
        else:
            print("Erro: número de páginas deve ser maior que zero!")

    def exibir_info(self):
        print(f"Título: {self.titulo}, Páginas: {self.__numero_paginas}")


lista_livros = []

while True:
    print("Faça sua escolha:")
    print("1-Adicione um livro" +
                    "\n2-Listar os livros" +
                    "\n3-Sair")
    opcao = int(input(f'Opção: '))

    if opcao == 1:
        titulo = input("Digite o nome do título: ")
        paginas = int(input("Digite o número do título: "))

        if paginas > 0:
            novoLivro = Livro(titulo, paginas)
            lista_livros.append(novoLivro)
            print("Livro adicionado com sucesso!")
        else: 
            print("Erro: número de páginas inválido!")

    elif opcao == 2:
        if lista_livros:
            print("Lista de livros:")
            for livro in lista_livros:
                livro.exibir_info()
        else:
            print("A lista está vazia.")

    elif opcao == 3: 
        print("Saindo do programa...")
        break

    else:
        print("Opção inválida!")






    
