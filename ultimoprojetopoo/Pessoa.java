package com.mycompany.ultimoprojetopoo;


public abstract class Pessoa{
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public Pessoa(String nome, int idade, String sexo, int experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }
    
    public void ganharExp(){
        System.out.println("Ganhou mais Exp");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + 
        ", idade=" + idade + ", sexo=" + sexo + ", "
        + "experiencia=" + experiencia + '}';
    }
}