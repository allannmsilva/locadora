package br.com.locadora.model;

import javax.persistence.*;

@Entity
public class Diretor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoDiretor;

    @Column(nullable = false)
    private String nomeDiretor;

    public Diretor() {
    }

    public Long getCodigoDiretor() {
        return codigoDiretor;
    }

    public void setCodigoDiretor(Long codigoDiretor) {
        this.codigoDiretor = codigoDiretor;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
}
