package CalculadoraDeArea;

public class Main {
    public static void main(String[] args) {
        // Criando instância de Circulo e Retangulo.
        Forma Circulo = new Circulo(5);
        Forma Retangulo = new Retangulo(7, 8);
    
    // Exibindo as Áreas.
    System.out.println("Área do Circulo: "+Circulo.CalcularArea() );
    System.out.println("Área do Retangulo: "+Retangulo.CalcularArea());
   } 
}
