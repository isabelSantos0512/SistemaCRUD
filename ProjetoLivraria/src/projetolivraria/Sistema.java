/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivraria;

import java.util.List;

/**
 *
 * @author isabe
 */
public class Sistema {

    private double valorDeVendas;
    private Livro produto;

    public double getValorDeVendas() {
        return valorDeVendas;

    }

    public Livro getProduto() {
        return produto;
    }

    public void setValorDeVendas(double vv) {
        valorDeVendas = vv;

    }

    public void setProduto(Livro p) {
        produto = p;

    }

    public Livro cadastrarLivro(String autor, String nomeDaObra, int volume, String dataDePubli, String editora,
            int codigo, double preco, int quantidade, double quantidadeDeVendas) {
        //Contrutor
        Livro a = new Livro();
        a.setAutor(autor);
        a.setNomeDaObra(nomeDaObra);
        a.setVolume(volume);
        a.setDataDePubli(dataDePubli);
        a.setEditora(editora);
        a.setCodigo(codigo);
        a.setPreco(preco);
        a.setQuantidade(quantidade);
        a.setQuantidadeDeVendas(quantidadeDeVendas);
        return a;//retorna livro criado
    }

    public boolean buscarLivro(List<Livro> l, String nome) {
        //uma lista para buscar livros 
        Livro l1 = new Livro();//construtor
        for (int i = 0; i < l.size(); i++) {//percorreu toa a lista
            l1 = l.get(i);//pega de 1 em 1 os livros e coloca dentro da var l1

            if (l1.getNomeDaObra().equalsIgnoreCase(nome)) {//testa se o livro é o mesmo passao pelo parametro
                return true; //se o livro tem o mesmo nome v se naõ f
            }

        }
        return false;

    }
    public Livro buscar (List<Livro> l, String nome) {
        //uma lista para buscar livros 
        Livro l1 = new Livro();//construtor
        for (int i = 0; i < l.size(); i++) {//percorreu toa a lista
            l1 = l.get(i);//pega de 1 em 1 os livros e coloca dentro da var l1

            if (l1.getNomeDaObra().equalsIgnoreCase(nome)) {//testa se o livro é o mesmo passao pelo parametro
                return l1; //se o livro tem o mesmo nome.
            }

        }
        return null;

    }


    public void venderLivro() {

    }

    public void relatorioDiario() {

    }

    public void relatorioSemanal() {

    }

    public void relatorioMensal() {

    }

    public void relatorioAnual() {

    }

}
