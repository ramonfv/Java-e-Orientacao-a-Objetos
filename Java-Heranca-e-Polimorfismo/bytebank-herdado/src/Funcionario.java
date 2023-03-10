import java.math.BigDecimal;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    private int senha;


    public Funcionario(String nome, String cpf, double salario, int senha){

//        if (nome == null && cpf == null && salario <= 0) {
//            throw new IllegalArgumentException("Nome, CPF e salário devem ser fornecidos.");
//        }else{

            this.nome = nome;
            this.cpf = cpf;
            this.salario = salario;
            this.senha = senha;

//        }
    }

    public abstract double getBonificacao();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }
}
