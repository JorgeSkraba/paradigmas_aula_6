interface Executar {
    void executarAcao();
}

class SalvaArquivos implements Executar {

    @Override
    public void executarAcao() {
        System.out.println("Arquivo salvo com sucesso!");
    }
}

class EnviarEmail implements Executar {

    @Override
    public void executarAcao() {
        System.out.println("Email enviado com sucesso!");
    }
}

class ImprimirDocumento implements Executar {

    @Override
    public void executarAcao() {
        System.out.println("Documento enviado para a impressora!");

    }
}

public class Main {
    public static void main(String[] args) {

        Executar salvar = new SalvaArquivos();
        Executar imprimir = new ImprimirDocumento();
        Executar enviar = new EnviarEmail();

        salvar.executarAcao();
        imprimir.executarAcao();
        enviar.executarAcao();


    }
}
