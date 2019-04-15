package poo;

import java.util.HashMap;

public class Email {

    private HashMap<String,String> dados = new HashMap<>();

    public boolean add(String r, String e){
        return true;
    }

    public boolean remove(String r){
        return true;
    }

    public boolean update(String r, String e){
        return true;
    }

    public Email(HashMap<String, String> dados) {
        this.dados = dados;
    }

    @Override
    public String toString() {
        return "Email{" +
                "dados=" + dados +
                '}';
    }
}
