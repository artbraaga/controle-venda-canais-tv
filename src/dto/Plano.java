package dto;

import java.util.List;

public class Plano {
    
    private int id;
    private String nome;
    private List<Canal> canais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Canal> getCanais() {
        return canais;
    }

    public void setCanais(List<Canal> canais) {
        this.canais = canais;
    }
}
