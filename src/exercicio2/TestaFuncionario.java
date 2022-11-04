package exercicio2;

import exercicio1.Cliente;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente funcionario1= new Gerente("Alysson",21,"josealysson@gmail.com","0054312","zona rural",44,10000,"IT",50);
        Gerente funcionario2 = new Gerente("joão da silva",100,"não tem","024512","pau dos ferros",100,20000,"RH",10);
        Vendedor funcionario3= new Vendedor("Carlos",31,"carlosvendedor@gmail.com","0054318547962","SP",44,5000,"Vendas",100);
        Vendedor funcionario4 = new Vendedor("Francisco",57,"francisco14754@gmail.com","02451021452","SC",100,10000,"Vendas",300);
        funcionario1.visualizar();
        funcionario2.visualizar();
        funcionario3.visualizar();
        funcionario4.visualizar();

    }
}
