package poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobreNome, LocalDate dataNasc, Telefone telefones, Email emails) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = dataNasc;
        this.telefones = telefones;
        this.emails = emails;
    }

    public Pessoa(String n, String s, LocalDate d){
        this.nome = n;
        this.sobreNome = s;
        this.dataNasc = d;
    }

    public boolean addTelefone(String r, String n){
        return true;
    }

    public boolean addEmail(String r, String n){
        return true;
    }

    public boolean removeTelefone(String r){
        return true;
    }

    public boolean removeEmail(String r){
        return true;
    }

    public boolean updateTelefone(String r, String n){
        return true;
    }

    public boolean updateEmail(String r, String n){
        return true;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
