#include <iostream>
using namespace std;

class Executar {
public:
    virtual void executarAcao() = 0;
    virtual ~Executar() {} 
};

class SalvarArquivo : public Executar {
public:
    void executarAcao() override {
        cout << "Arquivo salvo" << endl;
    }
};

class ImprimirDocumento : public Executar {
public:
    void executarAcao() override {
        cout << "Documento enviado" << endl;
    }
};

class EnviarEmail : public Executar {
public:
    void executarAcao() override {
        cout << "E-mail enviado" << endl;
    }
};

int main() {
    Executar* salvar = new SalvarArquivo();
    Executar* imprimir = new ImprimirDocumento();
    Executar* enviar = new EnviarEmail();

    salvar->executarAcao();
    imprimir->executarAcao();
    enviar->executarAcao();
}
