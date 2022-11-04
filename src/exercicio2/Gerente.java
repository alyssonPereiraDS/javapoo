package exercicio2;

public class Gerente extends Funcionario{
    private int numSubordinados;

    public Gerente(String nome, int idade, String email, String telefone, String endereco, int cargaHoraria, double salario, String setor, int numSubordinados) {
        super(nome, idade, email, telefone, endereco, cargaHoraria, salario, setor);
        this.numSubordinados = numSubordinados;
    }

    public int getNumSubordinados() {
        return numSubordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.numSubordinados = numSubordinados;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Número de subordinados do gerente:"+this.numSubordinados);
        System.out.println("---------------------------------------------");
    }
}
