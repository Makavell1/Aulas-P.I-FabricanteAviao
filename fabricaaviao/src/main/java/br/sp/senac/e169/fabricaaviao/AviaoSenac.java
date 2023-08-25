/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.senac.e169.fabricaaviao;

/**
 *
 * @author patrick.spereira1
 */
public class AviaoSenac {
    //Atributos
    private static String marca = "E169";
    private String cor;
    int velocidade; 
    String modelo;
    int asas;
    int turbinas;
    
    
     //Construtor
    public AviaoSenac(){
    
    cor = "Prata";
    System.out.println("Avião Construído!");
    
    
    }
    
    // Métodos acessores (getters) e modificadores (setters)
    
    public String getCor(){
      return this.cor.toUpperCase();
    
    
    
    }
    
    public void setCor(String novacor){
    this.cor = novacor;
    
    
    }
    
    public int getVelocidade(){
    return this.velocidade;
    
    }
    
    public void setVelocidade(int novaVelocidade){
    this.velocidade = novaVelocidade;
    
    
    }

    public static String getMarca() {
        return marca;
    }
    
    
    
    
    
    //Método Estático
    public static void setMarca(String marca) {
        AviaoSenac.marca = marca;
    }
    
    
    
    
    
    //Alt + Insert

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAsas() {
        return asas;
    }

    public void setAsas(int asas) {
        this.asas = asas;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public AviaoSenac(String cor, String modelo, int asas, int turbinas) {
        this.cor = cor;
        this.modelo = modelo;
        this.asas = asas;
        this.turbinas = turbinas;
    }
    
    
    
    
    
    
    //Ações!
    
    public int acelerar(){
    velocidade += 20;
    
    return velocidade;
    
    
    }
    
    public int acelerar(boolean turbo){
       if(turbo){
       velocidade += 50;
       
       }else{
       velocidade += 20;
       
       
       }
    return velocidade;    
    
    
    
    }
    
    
    
    
    
    
    public void decolar(){
    
    if (velocidade>= 100){
    System.out.println("Decolando...");
       
    } else{
    System.out.println("Abaixo de 100 km/h");
    }
    
    
    
    } 



    
}
