public class Gestor extends FuncionarioAutenticavel{

    private int senha;

    public Gestor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario, senha);
        this.senha = senha;
    }


//    public boolean autentica(int senha) {
//        if (this.senha == senha) {
//            System.out.println("Autenticação realizada com sucesso!");
//
//            return true;
//        } else {
//            System.out.println("Senha incorreta.");
//            return false;
//        }
//    }

    public double getBonificacao() {

        return super.getSalario();
    }
}
