// Include the string library
#include <string>
#include <stdio.h>
#include <iostream>

class Produto {
    public:
        std::string nome;
        int preco_unitario;
        int quantidade_estoque;

        Produto(std::string val1, int val2, int val3) {
            nome = val1;
            preco_unitario = val2;
            quantidade_estoque = val3;
        }
        
        void exibir() {
            std::string result = nome + " " + std::to_string(preco_unitario) + " * "+ std::to_string(quantidade_estoque); 
            std::cout << result;
        }
        
        int valor_total_estoque () {
            return quantidade_estoque * preco_unitario;
        }
};

int main() {
    
    Produto agua("agua",10,20);
    Produto arroz("arroz", 10,20);
    Produto notebook("notebook",20,30);
    
    agua.exibir();
    std::cout << "\n"+std::to_string(agua.valor_total_estoque());
    return 0;
}