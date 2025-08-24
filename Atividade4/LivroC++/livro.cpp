#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Livro {
private:
    int numeroPaginas; // atributo privado
public:
    string titulo;     // atributo público

    // Construtor
    Livro(string t, int n) {
        titulo = t;
        setNumeroPaginas(n);
    }

    // Getter
    int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Setter com validação
    void setNumeroPaginas(int n) {
        if (n > 0) {
            numeroPaginas = n;
        } else {
            cout << "Erro: número de páginas deve ser maior que zero!" << endl;
            numeroPaginas = 0;
        }
    }

    // Método para exibir informações
    void exibirInfo() {
        cout << "Título: " << titulo << ", Páginas: " << numeroPaginas << endl;
    }
};

int main() {
    vector<Livro> listaLivros;
    listaLivros.push_back(Livro("Pequeno Principe", 200));

    int opcao;
    do {
        cout << "\nFaça sua escolha:" << endl;
        cout << "1 - Adicione um livro" << endl;
        cout << "2 - Listar os livros" << endl;
        cout << "3 - Sair" << endl;
        cout << "Opção: ";
        cin >> opcao;
        cin.ignore(); // limpa o buffer do Enter

        if (opcao == 1) {
            string titulo;
            int paginas;

            cout << "Digite o nome do título: ";
            getline(cin, titulo);

            cout << "Digite o número de páginas: ";
            cin >> paginas;
            cin.ignore();

            if (paginas > 0) {
                Livro novoLivro(titulo, paginas);
                listaLivros.push_back(novoLivro);
                cout << "Livro adicionado com sucesso!" << endl;
            } else {
                cout << "Erro: número de páginas inválido!" << endl;
            }

        } else if (opcao == 2) {
            if (!listaLivros.empty()) {
                cout << "\nLista de livros:" << endl;
                for (auto &livro : listaLivros) {
                    livro.exibirInfo();
                }
            } else {
                cout << "A lista está vazia." << endl;
            }

        } else if (opcao == 3) {
            cout << "Saindo do programa..." << endl;
        } else {
            cout << "Opção inválida!" << endl;
        }

    } while (opcao != 3);

    return 0;
}
