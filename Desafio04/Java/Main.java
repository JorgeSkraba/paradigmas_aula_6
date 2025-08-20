//import java.lang.runtime.TemplateRuntime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> listaLivros = new ArrayList<>();

        while(true) {
            System.out.println("Faça sua escolha:");
            System.out.println("1-Adicione um livro" +
                    "\n2-Listar os livros" +
                    "\n3-Sair" +
                    "\nOpção: ");
            int respEscolha = scanner.nextInt();

            switch (respEscolha) {
                case 1:
                    System.out.println("Digite o nome do título: ");
                    String respTitulo = scanner.next();


                    System.out.println("Digite o número de páginas: ");
                    int respPaginas = scanner.nextInt();

                    if(respPaginas > 0) {
                        Livro novoLivro = new Livro(respTitulo, respPaginas);
                        listaLivros.add(novoLivro);
                        System.out.println("Livro adicionado com sucesso!");
                    }else{
                        System.out.println("Erro: número de páginas inválido!");
                    }
                    break;

                case 2:
                    System.out.println("\nLista de livros:");
                    for (Livro livro : listaLivros) {
                        System.out.println(livro);
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}