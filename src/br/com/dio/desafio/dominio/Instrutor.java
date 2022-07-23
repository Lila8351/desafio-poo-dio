package br.com.dio.desafio.dominio;

public class Instrutor extends User{
    @Override
    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.getInstrutoresInscritos().add(this);
    }

    public Instrutor(String nome) {
        this.nome = nome;
    }
}
