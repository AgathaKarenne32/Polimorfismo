/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Agatha
 */
class Retangulo extends Formas {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        super(largura, altura, 0);
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
                               
