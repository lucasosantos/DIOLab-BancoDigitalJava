import lombok.*;

public class Cliente {

    public Cliente(String nome, int telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    @Getter
    private String nome;

    @Getter
    @Setter
    private int telefone;

    @Getter
    private String cidade;

    @Getter
    private Conta corrente = new ContaPoupanca();

    @Getter
    private Conta poupanca = new ContaCorrente();

    public void depositarCorrente(double valor) {
        corrente.depositar(valor);
    }

    public void depositarPoupanca(double valor) {
        poupanca.depositar(valor);
    }

    public void transferrirCorrente(double valor, Conta destino) {
        printTranferencia(valor);
        this.corrente.transferir(valor,destino);
    }

    public void transferrirPoupanca(double valor, Conta destino) {
        printTranferencia(valor);
        this.poupanca.transferir(valor,destino);
    }

    public void printTranferencia(double valor) {
        System.out.println("----------------------");
        System.out.println("Transferencia de R$ " + valor + " realizada");
        System.out.println("----------------------");
    }

    public void printExtrato() {
        System.out.println("--- Extrato ---");
        System.out.println("Cliente: " + this.nome);
        System.out.println("----------------------");
        System.out.println("--- Conta Corrente ---");
        this.corrente.printExtrato();
        System.out.println("--- Conta Poupança ---");
        this.poupanca.printExtrato();
        System.out.println("----------------------");
    }

}
