package teste;

import entities.Cliente;
import entities.TIpoCliente;
import entities.TipoPagamento;

public class teste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("TSUbasa", TIpoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("TSUbasa", TIpoCliente.PESSOA_JURIDICA);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.debito.calculaDesconto(100));
    }
}