package br.com.biblioteca;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String anoLancamento;
    private String codigoISBN;
    private int qtdeEstoque;
    private double preco;

    public Livro(int codigo, String titulo, String autor, String anoLancamento, String codigoISBN, int qtdeEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codigoISBN = codigoISBN;
        this.qtdeEstoque = qtdeEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Codigo=" + codigo +
                ", Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Ano de Lancamento='" + anoLancamento + '\'' +
                ", codigo ISBN=" + codigoISBN +
                ", Qantidade em Estoque=" + qtdeEstoque +
                ", Preco=" + preco +
                '}';
    }
}
