package br.com.locadora.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoClasse;

    @Column(nullable = false, unique = true)
    private String nomeClasse;

    @Column(nullable = false)
    private double valor;

    @Column
    private Date dataDevolucao;

    public Classe() {
    }

    public Classe(String nomeClasse, double valor, Date dataDevolucao) {
        this.nomeClasse = nomeClasse;
        this.valor = valor;
        this.dataDevolucao = dataDevolucao;
    }

    public Long getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(Long codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
