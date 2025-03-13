package CalculadoraDeArea;

public class Circulo extends Forma{
    private Double Raio;

    // Construtor.
    public Circulo (Double Raio){
        this.Raio = Raio;
    }
    
    // Implementação do método CalcularArea.
    @Override
    public Double CalcularArea(){
        return Math.PI * Math.pow(Raio,2);
    }
}