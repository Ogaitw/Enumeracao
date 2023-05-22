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
        System.out.println(TipoPagamento.credito.calculaDesconto(100));

        TIpoCliente tIpoCliente = TIpoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tIpoCliente.getNomeRelatorio());
        TIpoCliente tIpoCliente2 = TIpoCliente.tIpoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tIpoCliente2);
    }
}