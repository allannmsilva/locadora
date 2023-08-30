package br.com.locadora.model;

import javax.persistence.*;

@Entity
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoAtor;

    @Column(nullable = false, unique = true)
    private String nomeAtor;

    public Ator() {
    }

    public Ator(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public Long getCodigoAtor() {
        return codigoAtor;
    }

    public void setCodigoAtor(Long codigoAtor) {
        this.codigoAtor = codigoAtor;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }
}
