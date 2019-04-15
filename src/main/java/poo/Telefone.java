package poo;

import java.util.HashMap;

public class Telefone {

    private HashMap <String,String> dados = new HashMap<>();

    public boolean add(String r, String n){
        return true;
    }

    public boolean remove(String r){
        return true;
    }

    public boolean update(String r, String n){
        return true;
    }

    public Telefone(HashMap<String, String> dados) {
        this.dados = dados;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }
}
