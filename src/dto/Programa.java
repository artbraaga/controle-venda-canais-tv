package dto;

import java.sql.Date;

public class Programa {
    
    private int id;
    private String nome;
    private Date horario;   

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

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
}
