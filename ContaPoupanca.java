/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/**
 * Academia do Java
 * 
 * Tarefas:
 * FEITAS
 */
public class ContaPoupanca extends Conta {

    private String dtAniversario;

    public String getDtAniversario() {
        return dtAniversario;
    }

    public void setDtAniversario(String dtAniversario) {
        this.dtAniversario = dtAniversario;
    }

    public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, String dtAniversario) {
        super(saldoInicial, num, tit, ag);
        this.dtAniversario = dtAniversario;
    }

    public ContaPoupanca(String num, Cliente tit, Agencia ag, String dtAniversario) {
        super(num, tit, ag);
        this.dtAniversario = dtAniversario;
    }

    @Override
    public void saque(double valor) {
        super.saque(valor);
    }

    @Override
    public void imprimeDados() {
        System.out.println("================================================");
        System.out.println("Tipo da conta: CONTA POUPANÇA");
        System.out.println("Data de aniversario: " + getDtAniversario());
        System.out.println();
        super.imprimeDados();
    }
}
