class Produto {

    String nome;
    int preco_unitario;
    int quantidade_estoque;

    public Produto (String nome, int preco_unitario, int quantidade_estoque) {
        this.nome = nome;
        this.preco_unitario = preco_unitario;
        this.quantidade_estoque = quantidade_estoque;
    }

    public void exibir() {
        System.out.println(this.nome+ " " + this.preco_unitario + " " + this.quantidade_estoque);
    }

    public int valor_total_estoque () {
        return preco_unitario*quantidade_estoque;
    }

}

public class desafio1 {
    public static void main(String[] args) {
        Produto agua = new Produto("agua",10,30);
        Produto arroz = new Produto("arroz",4,60);
        Produto notebook = new Produto("notebook",10,30);

        agua.exibir();
        System.out.println(agua.valor_total_estoque());
    }
}
