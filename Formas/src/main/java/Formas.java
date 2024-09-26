/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Agatha
 */
public abstract class Formas {
    double largura;
    double altura;
    double raio;
    double pi;
    
    public Formas(double largura, double altura, double raio){
        this.largura = largura;
        this.altura = altura;
        this.raio = raio;
        this.pi = Math.PI;
    }
    public abstract double calcularArea();
}
