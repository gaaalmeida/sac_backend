package com.sac.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_usuario")
    private String nomeUsuario;

    @Column(name = "nm_email")
    private String emailUsuario;

    @Column(name = "documento")
    private String documento;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "tp_atestado")
    private int atestado;

    @OneToOne
    @JoinColumn(name = "fk_data_id", unique = true)
    private Datas data;

    public Agendamento(Long id, String nomeUsuario, String emailUsuario, String documento,
            String telefone, int atestado) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.documento = documento;
        this.telefone = telefone;
        this.atestado = atestado;
    }

    public Agendamento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAtestado() {
        return atestado;
    }

    public void setAtestado(int atestado) {
        this.atestado = atestado;
    }
 
    public Datas getData() {
        return this.data;
    }

    public void setData(Datas data) {
        this.data = data;
    }

}
