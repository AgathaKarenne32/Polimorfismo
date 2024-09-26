/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Agatha
 */
class Circulo extends Formas {
    private double raio;
    
    public Circulo(double raio) {
        super(0,0,raio);  
    }

    @Override
    public double calcularArea() {
        // Fórmula para calcular a área de um círculo
        return pi * Math.pow(raio, 2); 
    }
}

