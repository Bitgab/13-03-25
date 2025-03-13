package Empresa;
public class Programador  extends Funcionario{
    // Atributos Sálario Base mais Bônus.
    private Double SalarioBase;
    private Double Bonus;

    public Programador (String Nome, Double SalarioBase, Double Bonus){
        super(Nome);
        this.SalarioBase = SalarioBase;
        this.Bonus = Bonus;
    }
    public Double CalcularSalario(){
        return SalarioBase + Bonus;
    }
}
