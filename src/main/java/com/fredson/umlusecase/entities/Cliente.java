package com.fredson.umlusecase.entities;

import com.fredson.umlusecase.entities.enums.TipoCliente;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Integer tipoCliente;

    private String CPFOuCNPJ;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "telefones")
    private Set<String> telefones = new HashSet<>();

    public Cliente() {

    }

    public Cliente(Integer id, String nome, Integer tipoCliente, String CPFOuCNPJ) {
        this.id = id;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.CPFOuCNPJ = CPFOuCNPJ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return TipoCliente.toEnum(tipoCliente);
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente.getCod();
    }

    public String getCPFOuCNPJ() {
        return CPFOuCNPJ;
    }

    public void setCPFOuCNPJ(String CPFOuCNPJ) {
        this.CPFOuCNPJ = CPFOuCNPJ;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public Set<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(String telefone) {
        this.telefones.add(telefone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
