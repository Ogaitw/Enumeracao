package entities;

public class Cliente{
    private String nome;
    private tipocliente tIpoCliente;

    public Cliente(String nome, tipocliente tipocliente) {
        this.nome = nome;
        this.tIpoCliente = tipocliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public tipocliente gettIpoCliente() {
        return tIpoCliente;
    }

    public void settIpoCliente(tipocliente tipocliente) {
        this.tIpoCliente = tipocliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tIpoCliente +
                '}';
    }
}
