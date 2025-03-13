package Empresa;
public class Gerente extends Funcionario {
    // Atributo Sálario Fixo.
    private Double SalariFixo;

        public Gerente (String Nome, Double SalariFixo){
            super(Nome);
            this.SalariFixo = SalariFixo;
        }
        public Double CalcularSalario(){
            return SalariFixo;
        }
}
