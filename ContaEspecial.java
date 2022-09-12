
/**
 * Tarefas:
 * FEITAS
 */
public class ContaEspecial extends Conta {
    private double limite;
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
        super(saldoInicial, num, tit, ag);
        this.limite = limite;
    }

    public ContaEspecial(String num, Cliente tit, Agencia ag, double limite) {
        super(num, tit, ag);
        this.limite = limite;
    }

    @Override
    public void imprimeDados() {
        System.out.println("================================================");
        System.out.println("Tipo da conta: CONTA ESPECIAL");
        System.out.println("Seu limite é de: " + getLimite());
        System.out.println("================================================");
        super.imprimeDados();
    }

    @Override
    public void saque(double valor) {
        if (valor > 0){
            if (valor <= limite) {
                saldo -= valor;
                acumularCPMF(valor);
                System.out.println("Saque de R$"+ valor + " da conta " +getNumero()+ "feito!!");
            }else if(valor > limite && valor > saldo){
                System.out.println("!!! Saudo e limite da conta alcançado!!!");
            }else{
                System.out.println("!!! Limite da conta alcançado!!!");
            }
        }else {
            System.out.println("!!! Deposite um valor valido na conta !!!");
        }
    }
}


