package org.example.model;

public class Livros {

    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livros( String titulo, String autor, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public Livros(int id, String titulo, String autor, int ano, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public Livros( String titulo, String autor, int ano ) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public Livros() {
        this.id = 0;
        this.titulo = "";
        this.autor = "";
        this.ano = 0;
        this.disponivel = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
