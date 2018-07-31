/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carvalui
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Produtividade.consultarPorDataEId",
            query = "SELECT p.qtdEmail FROM Produtividade p WHERE p.dataProdutividade = :data AND p.idAnalista = :id")
    ,
    @NamedQuery(name = "Produtividade.consultarMes",
            query = "SELECT SUM(p.qtdEmail) FROM Produtividade p WHERE p.dataProdutividade BETWEEN :dataInicial AND :dataFinal AND p.idAnalista = :idAnalista")
})
@SequenceGenerator(name = "produtividade_seq", sequenceName = "produtividade_seq",
        allocationSize = 1, initialValue = 1)
public class Produtividade implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 6188519207315764113L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produtividade_seq")
    private Long id;
    @Column(name = "quantidade_email")
    private int qtdEmail;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_produtividade")
    private Date dataProdutividade;
    @Column(name = "id_analista")
    private Long idAnalista;

    public Produtividade() {
    }

    public Produtividade(int qtdEmails, Date data, Long idAnalista) {
        this.qtdEmail = qtdEmails;
        this.dataProdutividade = data;
        this.idAnalista = idAnalista;
    }

    @Override
    public Long getId() {
        return id;
    }

    public int getQtdEmails() {
        return qtdEmail;
    }

    public Date getData() {
        return dataProdutividade;
    }

    public Long getIdAnalista() {
        return idAnalista;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQtdEmail(int qtdEmail) {
        this.qtdEmail = qtdEmail;
    }

    public void setDataProdutividade(Date dataProdutividade) {
        this.dataProdutividade = dataProdutividade;
    }

    public void setIdAnalista(Long idAnalista) {
        this.idAnalista = idAnalista;
    }

}
