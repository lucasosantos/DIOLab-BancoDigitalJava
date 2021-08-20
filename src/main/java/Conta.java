public interface Conta {

    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(double valor, Conta destino);

    public void receberValor(double valor);

    public void printExtrato();

}
