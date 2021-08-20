import lombok.*;
import org.jetbrains.annotations.NotNull;

public abstract class ContaAbstract implements Conta {

    private static final int AGENCIA_PADRAO = 1754;
    private static int SEQUENCIA_DE_CONTAS = 1;

    @Getter
    protected int agencia;

    @Getter
    protected int conta;

    @Getter
    protected double saldo;

    public ContaAbstract(double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.saldo = saldo;
        this.conta = SEQUENCIA_DE_CONTAS++;
    }

    public ContaAbstract() {
        this.agencia = AGENCIA_PADRAO;
        this.saldo = 0.00;
        this.conta = SEQUENCIA_DE_CONTAS++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, @NotNull Conta destino) {
        this.sacar(valor);
        destino.receberValor(valor);
    }

    @Override
    public void receberValor(double valor) {
        this.saldo += valor;
    }

    @Override
    public void printExtrato() {;
        System.out.println("Conta: "+ this.getConta());
        System.out.println("Agencia: "+ this.getAgencia());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("----------------------");
    }
}
