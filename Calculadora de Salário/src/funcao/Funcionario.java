package funcao;

public class Funcionario {

    private String nome;

    private String email;

    private String cargo;

    private double salarioBase;


    public Funcionario(String nome, String email, String cargo, double salarioBase){
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Calcula salários liquidos de acordo com as regras passadas.

    public double getSalarioLiquido() {
        if (this.cargo.equals("DESENVOLVEDOR")){
            if (this.salarioBase >= 3000){
                return salarioBase - (salarioBase*0.2);
            }else{
                return salarioBase - (salarioBase*0.1);
            }
        }else if(this.cargo.equals(("DBA")) || this.cargo.equals("TESTADOR")){
            if (this.salarioBase >= 2000){
                return salarioBase - (salarioBase*0.25);
            }else{
                return salarioBase - (salarioBase*0.15);
            }
        }else if(this.cargo.equals("GERENTE")){
            if (this.salarioBase >= 5000){
                return salarioBase - (salarioBase*0.3);
            }else{
                return salarioBase - (salarioBase*0.2);
            }
        }else {return salarioBase;}
    }
}

