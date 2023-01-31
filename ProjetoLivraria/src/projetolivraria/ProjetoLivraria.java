/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivraria;

import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class ProjetoLivraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Livro l1 = new Livro("Dan brown", "Inferno", 8, "02/08/1994");

        Livro l2 = new Livro("bob", "Inferno", 8, "02/08/1994");
        l1.equals(l2);//para comparar
        
        JOptionPane.showMessageDialog(null, l1.equals(l2));
    }

}
