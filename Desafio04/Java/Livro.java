public class Livro {
    public String titulo;
    private int numeroPaginas;

    public Livro(String titulo, int numeroPaginas) {
        this.titulo = titulo;
        setNumeroPaginas(numeroPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0){
            this.numeroPaginas = numeroPaginas;
            System.out.println("Páginas adicionadas com sucesso");

        }else{
            System.out.println("Erro: O número de páginas deve ser maior que zero");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Páginas: " + numeroPaginas;
    }

}
