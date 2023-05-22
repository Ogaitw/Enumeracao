package entities;

public enum tipocliente {
    PESSOA_FISICA(1, "Pessoa Fisica",10.5),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;

    private String nomeRelatorio;
    private double Valor2;
    tipocliente(int valor,String nomeRelatorio, double valor2 ){
        this.valor =valor;
        this.nomeRelatorio = nomeRelatorio;
        this.Valor2=valor2;
    }

    tipocliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;

    }

    public static tipocliente tIpoClientePorNomeRelatorio(String nomeRelatorio) {
        for (tipocliente tipocliente : values()) {
            if (tipocliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipocliente;
            }

        }
        return null;
    }
    public String getNomeRelatorio( ) {
        return nomeRelatorio;
    }
    public  int getValor () {return valor;}

    public double getValor2() {
        return Valor2;
    }
}
