/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.sp.senac.e169.fabricaaviao;

/**
 *
 * @author patrick.spereira1
 */
public class Fabricaaviao {

    public static void main(String[] args) {
        
        AviaoSenac aviao1 = new AviaoSenac();
        int velocidade = aviao1.acelerar();
        System.out.println("Velocidade: " + velocidade);
        
        
        System.out.println("Cor: " + aviao1.getCor());
        
        
        //outro avião...
        AviaoSenac aviao2 = new AviaoSenac();
        aviao2.acelerar(true);
        //System.out.println("");
        aviao2.decolar();
        
        //Mais um aviao...
        
        AviaoSenac aviao3 = new AviaoSenac("Amarelo","XLS", 4, 2);
        
        System.out.println("Marca: " + AviaoSenac.getMarca());
        
        
        
        
        
        
        
    }
}
