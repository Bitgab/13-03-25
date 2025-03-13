package Empresa;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel", 1.900);
        Programador programador = new Programador("Gabriel", 4.000, 1.000);
    
        System.out.println("Informações do Gerente");
        System.out.println("Nome: "+gerente.getNome() + "\nSalário: R$"+ String.format("%.3f",gerente.CalcularSalario()) + " reais \n");
        System.out.println("Informações do Programador");
        System.out.printf("Nome: "+programador.getNome() + "\nSalário: R$"+ String.format("%.3f", programador.CalcularSalario())+ " reais \n");
        
    }     
}
