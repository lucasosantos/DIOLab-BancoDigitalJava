import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    public Banco(String nome) {
        this.nome = nome;
    }

    @Getter
    private String nome;

    @Getter
    List<Cliente> clientes = new ArrayList<>();

    public void addCliente(String nome, int telefone, String cidade) {
        Cliente cliente = new Cliente(nome, telefone, cidade);
        clientes.add(cliente);
        System.out.println("------------------");
        System.out.println("Cliente Adicionado");
        System.out.println("Mome: " + nome);
        System.out.println("------------------");
    }

}
