package funcao;

public class Funcionario {

    private boolean funciona;

    private String nome;

    private String email;

    private String cargo;

    private double salarioBase;


    public Funcionario(String nome, String email, String cargo, double salarioBase){
        this.funciona = true;
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

    public double getSalarioLiquido() {
        if (this.cargo.equals("DESENVOLVEDOR")){
            if (this.salarioBase >= 3000){
                return salarioBase - (salarioBase*0.2);
            }else{
                return salarioBase - (salarioBase*0.1);
            }
        }else{
            return salarioBase;
        }
    }

    public boolean getFunciona() {
        return funciona;
    }
}

