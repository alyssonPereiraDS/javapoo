package exercicio2;

import exercicio1.Cliente;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1= new Funcionario("Alysson",21,"josealysson@gmail.com","0054312","zona rural",44,10000,"IT");
        Funcionario funcionario2 = new Funcionario("joão da silva",100,"não tem","024512","pau dos ferros",100,20000,"RH");
        funcionario1.visualizar();
        funcionario2.visualizar();
    }
}
