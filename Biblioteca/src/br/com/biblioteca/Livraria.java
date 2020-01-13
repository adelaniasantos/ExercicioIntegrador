package br.com.biblioteca;

import java.util.*;

public class Livraria {
    private List<Livro> listalivros = new ArrayList<>();
    private List<Colecao> listaColecao = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        listalivros.add(livro);
        System.out.println("Livro " + livro.getCodigo() + " - " + livro.getTitulo() + " Cadastrado com sucesso.");
    }

    public boolean consultarLivro(int codigo) {
        for (Livro livro : listalivros) {
            if(livro.getCodigo() == codigo){
                System.out.println(livro.toString());
                return true;
            }
        }

        System.out.println("Livro com codigo : " + codigo + " nao encontrado.") ;
        return false;
    }

    public void efetuarVenda(int codigo) {
        for (Livro livro : listalivros) {
            if(livro.getCodigo() == codigo){
                if(livro.getQtdeEstoque() > 0) {
                    livro.setQtdeEstoque(livro.getQtdeEstoque() - 1);
                    System.out.println("Venda do livro (" + livro.getCodigo() + " - " + livro.getTitulo() + ") efetuada com sucesso.");
                }else{
                    System.out.println("Estoque esgotado para o livro: " + livro.getCodigo() + " - " + livro.getTitulo());
                }
            }
        }
    }

    public void cadastrarColecao(Colecao colecao){
        listaColecao.add(colecao);
        System.out.println("Colecao " + colecao.getCodigo() + " - " + colecao.getDescricao() + " Cadastrada com sucesso.");
    }

    public void consultarColecao(int codigoColcao){
        for (Colecao colecao : listaColecao) {
            if(colecao.getCodigo() == codigoColcao){
                System.out.println(colecao.toString());
            }
        }
    }

}
