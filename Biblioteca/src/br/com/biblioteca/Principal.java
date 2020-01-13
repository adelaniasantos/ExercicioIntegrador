package br.com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Livro livro1 = new Livro(001, "O Pequeno Principe", "Antoine de Saint-Exupery", "1943", "9788998697211", 12, 6.90);
        Livro livro2 = new Livro(002, "O Mundo de Sofia", "Jostein Gaarder", "1991", "9785050048882", 10, 38.32);
        Livro livro3 = new Livro(003, "O Codigo Da Vinci", "Dan Brown", "2000", "9781435288232", 0, 27.98);

        Livro harry1 = new Livro(101, "Herry Potter e a Pedra Filosofal", "J. K. Rowling", "2001", "9788700631625", 10, 21.90);
        Livro harry2 = new Livro(102, "Harry Potter e a Câmara Secretae", "J. K. Rowling", "2002", "9780605928183", 10, 21.90);
        Livro harry3 = new Livro(103, "Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", "2004", "9789994030149", 10, 21.90);
        Livro harry4 = new Livro(104, "Harry Potter e o Calice de Fogo", "J. K. Rowling", "2005", "9781781101544", 10, 21.90);
        Livro harry5 = new Livro(105, "Harry Potter e a Ordem da Fênix", "J. K. Rowling", "2007", "9788498383621", 10, 21.90);
        Livro harry6 = new Livro(106, "Harry Potter e o Enigma do Principe", "J. K. Rowling", "2009", "9788884516374", 10, 21.90);
        Livro harry7 = new Livro(107, "Harry Potter e as Reliquias da Morte", "J. K. Rowling", "2010", "9780605039070", 10, 21.90);

        Livraria livraria = new Livraria();
        livraria.cadastrarLivro(livro1);
        livraria.cadastrarLivro(livro2);
        livraria.cadastrarLivro(livro3);
        livraria.cadastrarLivro(harry1);
        livraria.cadastrarLivro(harry2);
        livraria.cadastrarLivro(harry3);
        livraria.cadastrarLivro(harry4);
        livraria.cadastrarLivro(harry5);
        livraria.cadastrarLivro(harry6);
        livraria.cadastrarLivro(harry7);

        System.out.println("\n-------------------> CONSULTAR------------------------");
        livraria.consultarLivro(001);
        livraria.consultarLivro(002);
        livraria.consultarLivro(003);
        livraria.consultarLivro(004);

        System.out.println("\n-------------------> VENDER------------------------");
        livraria.efetuarVenda(001);
        livraria.consultarLivro(001);
        System.out.println("\n");
        livraria.efetuarVenda(003);
        livraria.consultarLivro(003);

        System.out.println("\n-------------------> COLECAO------------------------");
        List<Livro> listalivros = new ArrayList<>();
        listalivros.add(harry1);
        listalivros.add(harry2);
        listalivros.add(harry3);
        listalivros.add(harry4);
        listalivros.add(harry5);
        listalivros.add(harry6);
        listalivros.add(harry7);

        Colecao colecao1 = new Colecao(listalivros, 1001, 120.90, "Colecao Harry Potter - 7 livros");
        System.out.println("\n------------------->CADASTRAR COLECAO------------------------");
        livraria.cadastrarColecao(colecao1);
        System.out.println("\n------------------->CONSULTAR COLECAO------------------------");
        livraria.consultarColecao(1001);

    }
}
