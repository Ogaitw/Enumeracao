package entities;

import java.awt.*;

public enum TIpoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomeRelatorio;
    TIpoCliente(int valor, String nomeRelatorio){
        this.valor =valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    public static TIpoCliente tIpoClientePorNomeRelatorio(String nomeRelatorio){
        return TIpoCliente;
    }
    public String getNomeRelatorio( ) {
        return nomeRelatorio;
    }
    public  int getValor () {return valor;}

}
