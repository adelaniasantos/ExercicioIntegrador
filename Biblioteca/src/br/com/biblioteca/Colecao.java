package br.com.biblioteca;

import br.com.biblioteca.Livro;

import java.util.ArrayList;
import java.util.List;

public class Colecao {
    private List<Livro> listalivros = new ArrayList<>();
    private int codigo;
    private double preco;
    private String descricao;

    public Colecao(List<Livro> listalivros, int codigo, double preco, String descricao) {
        this.listalivros = listalivros;
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public List<Livro> getListalivros() {
        return listalivros;
    }

    public void setListalivros(List<Livro> listalivros) {
        this.listalivros = listalivros;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Colecao: " + descricao + "\n" +
                "Codigo: " + codigo + "\n" +
                "Preco: " + preco + "\n" +
                "lisvros: " + listalivros +


               '}';
    }
}
