package br.com.dio.desafio.dominio;

public abstract class User {
    protected String nome;
    public abstract void inscreverBootcamp(Bootcamp bootcamp);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
