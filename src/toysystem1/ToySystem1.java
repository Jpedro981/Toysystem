
package toysystem1;

import java.util.Scanner;


public class ToySystem1 {

   
    public static void main(String[] args) {
          Sistema sistema = new Sistema();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema do Salão!\n");
        
        // Exemplo de cadastro de cliente
        System.out.println("Cadastro de novo cliente:");
        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, endereco, cpf, telefone, email);
        sistema.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!\n");

        System.out.println("Clientes cadastrados:");
        for (Cliente c : sistema.getClientes()) {
            System.out.println(c);
        }

        scanner.close();
    }
    
}

