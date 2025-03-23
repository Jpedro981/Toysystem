
package toysystem1;

import java.util.ArrayList;


public class Sistema {

    private ArrayList<Cliente> clientes;

    public Sistema() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}


