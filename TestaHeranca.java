/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
 //
 /**
  *
 * Realize 1 saque na conta poupanca que exceda o saldo.
 * Imprima os dados das contas para conferir se estao corretas.
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */
public class TestaHeranca {

    public static void main(String args[]) {
        Banco banco = new Banco("POO Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("Cliente 1", "1232323");
        Cliente cliente2 = new Cliente("Cliente 2", "8987789");
        Cliente cliente3 = new Cliente("cliente 3", "7654321");
        Cliente cliente4 = new Cliente("cliente 4", "1234567");
        Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
        conta.saque(560);
        conta.imprimeDados();
        System.out.println();
        
        ContaEspecial contaEsp1 = new ContaEspecial(500.00,"001", cliente2, ag1,1000); // 1a. conta especial
        contaEsp1.saque(600);
        contaEsp1.imprimeDados();
        System.out.println();

        ContaEspecial contaEsp2 = new ContaEspecial(600.00, "002", cliente3, ag1, 1000); // 2a. conta especial
        contaEsp2.saque(2000);
        contaEsp2.imprimeDados();

        String strData = new java.util.Date().toString();
        ContaPoupanca contaPoup = new ContaPoupanca(700.00, "003", cliente4, ag1, strData); // conta poupanca
        contaPoup.saque(701);
        contaPoup.imprimeDados();
        
        
    }
}
