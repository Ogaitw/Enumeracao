package entities;

public class Cliente{
    private String nome;
    private TIpoCliente tIpoCliente;

    public Cliente(String nome, TIpoCliente tIpoCliente) {
        this.nome = nome;
        this.tIpoCliente = tIpoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TIpoCliente gettIpoCliente() {
        return tIpoCliente;
    }

    public void settIpoCliente(TIpoCliente tIpoCliente) {
        this.tIpoCliente = tIpoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tIpoCliente=" + tIpoCliente +
                '}';
    }
}
