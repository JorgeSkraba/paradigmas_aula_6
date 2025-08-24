from abc import ABC, abstractmethod

class Executar(ABC):
    def executar_acao(self):
        pass
    
class SalvarArquivos(Executar):
    def executar_acao(self):
        print("arquivos salvos!")
            
class ImprimirDocumento(Executar):
    def executar_acao(self):
        print("Documento enviados!")
            
class EnviarEmail(Executar):
    def executar_acao(self):
        print("Email enviado!")
            
def main():
    salvar = SalvarArquivos()
    imprimir = ImprimirDocumento()
    enviar = EnviarEmail()
    
    salvar.executar_acao()
    imprimir.executar_acao()
    enviar.executar_acao()
    
main()
