package CalculadoraDeArea;

public class Retangulo extends Forma{
    // Atributo Largura end Altura.
    private Double Largura;
    private Double Altura;

    // Construtor.
    public Retangulo(Double Largura, Double Altura){
        this.Largura = Largura;
        this.Altura = Altura;
    }

    // Implementação do método CalcularArea.
    @Override
    public Double CalcularArea(){
        return Largura * Altura;
    }

}
