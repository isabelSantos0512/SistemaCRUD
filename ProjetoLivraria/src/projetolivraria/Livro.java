/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivraria;

import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class Livro {
    
    private String autor;
    private String nomeDaObra;
    private int volume;
    private String dataDePubli;
    private String editora;
    private int codigo;
    private double preco;
    private int quantidade;
    private double quantidadeDeVendas;
/**
 * int volume,String dataDePubli,String editora, int codigo
 * double preco,int quantidade,double quantidadeDeVendas
 * 
 */
    
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the nomeDaObra
     */
    public String getNomeDaObra() {
        return nomeDaObra;
    }

    /**
     * @param nomeDaObra the nomeDaObra to set
     */
    public void setNomeDaObra(String nomeDaObra) {
        this.nomeDaObra = nomeDaObra;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the dataDePubli
     */
    public String getDataDePubli() {
        return dataDePubli;
    }

    /**
     * @param dataDePubli the dataDePubli to set
     */
    public void setDataDePubli(String dataDePubli) {
        this.dataDePubli = dataDePubli;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getQuantidadeDeVendas(){
        return quantidadeDeVendas;
    }
    public void setQuantidadeDeVendas(double quantidadeDeVendas){
     this.quantidadeDeVendas=quantidadeDeVendas;
    } 
   
    
    
    public void desconto (double d){
        //o valor com desconto.
        if(d>0 && d<=100){
            
          d= d/100;//contersão para decimal
          d=d*this.preco;//multiplicação
          setPreco(getPreco()-d);//subtraindo o desconto do preço total.
          
          JOptionPane.showMessageDialog(null, "O Valor com desconto: "+getPreco());
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor inválido, tentar entre 0 a 100%");
            
        }
             
    }
   
    public boolean equals (Livro l){
        //Comparar
        if(this.nomeDaObra.equalsIgnoreCase(l.getNomeDaObra()) &&
                this.autor.equalsIgnoreCase(l.getAutor()))
            
            return true;
        else
            return false;
         
    }
    public Livro(){
        
    }
    public Livro(String autor,String nomeDaObra,int quantidade, String dataDePubli){
     setAutor(autor); 
     setNomeDaObra(nomeDaObra);
     setQuantidade(quantidade);
     setDataDePubli(dataDePubli);
    }
    public String toString(){
        return "Autor: "+getAutor()+"\nNome da obra: "+getNomeDaObra()+"\nVolume: "+getVolume()+
                "\nData de Publicação: "+getDataDePubli()+"\nEditora"+getEditora()+"\nCódigo: "
                +getCodigo()+"\nPreço: "+getPreco()+"\nQuantidade: "+getQuantidade();
                        
    }
    
    
}
