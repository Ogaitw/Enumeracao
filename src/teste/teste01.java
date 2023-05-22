package teste;

import entities.Cliente;
import entities.tipocliente;
import entities.TipoPagamento;

public class teste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("TSUbasa", tipocliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("TSUbasa", tipocliente.PESSOA_JURIDICA);
//        System.out.println(cliente);
//        System.out.println(cliente2);
//        System.out.println(TipoPagamento.debito.calculaDesconto(100));
//        System.out.println(TipoPagamento.credito.calculaDesconto(100));

        tipocliente tIpoCliente = tipocliente.valueOf("PESSOA_FISICA");
        System.out.println(tIpoCliente.getValor2());
//        tipocliente tIpoCliente2 = tipocliente.tIpoClientePorNomeRelatorio("Pessoa Fisica");
//        System.out.println(tIpoCliente2);
    }
}