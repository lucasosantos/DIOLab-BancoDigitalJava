public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Central");
        banco.addCliente("Lucas Oliveira",212105555,"Simão Dias");
        banco.addCliente("Marcos",212105555,"São Paulo");
        banco.addCliente("Paulo",212105555,"Aracaju");

        banco.clientes.get(0).depositarCorrente(150.00);
        banco.clientes.get(1).depositarCorrente(550.00);
        banco.clientes.get(2).depositarCorrente(250.00);
        banco.clientes.get(2).depositarCorrente(50.00);

        banco.clientes.get(2).depositarPoupanca(250.00);
        banco.clientes.get(0).depositarPoupanca(250.00);

        banco.clientes.get(0).printExtrato();
        banco.clientes.get(1).printExtrato();
        banco.clientes.get(2).printExtrato();

        banco.clientes.get(0).depositarPoupanca(250.00);

        banco.clientes.get(1).transferrirCorrente(100,banco.clientes.get(1).getPoupanca());
        banco.clientes.get(2).transferrirPoupanca(40,banco.clientes.get(0).getPoupanca());

        banco.clientes.get(0).printExtrato();
        banco.clientes.get(1).printExtrato();
        banco.clientes.get(2).printExtrato();
    }
}
