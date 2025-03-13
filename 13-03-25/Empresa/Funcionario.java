package Empresa;
 abstract class Funcionario {
    // Atributo Nome.
    private String Nome;

    public Funcionario (String Nome){
        this.Nome = Nome;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    
    // Método Abstrato
    abstract  Double CalcularSalario();

    

   
 }