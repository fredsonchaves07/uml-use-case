package com.fredson.umlusecase.entities;

import com.fredson.umlusecase.entities.enums.EstadoPagamento;

import java.io.Serializable;
import java.util.Objects;

public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private EstadoPagamento estadoPagamento;

    private Pedido pedido;

    private Cliente cliente;

    private Endereco endereco;

    public Pagamento() {}

    public Pagamento(int id, EstadoPagamento estadoPagamento, Pedido pedido, Cliente cliente, Endereco endereco) {
        this.id = id;
        this.estadoPagamento = estadoPagamento;
        this.pedido = pedido;
        this.cliente = cliente;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoPagamento getEstadoPagamento() {
        return estadoPagamento;
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagamento)) return false;
        Pagamento pagamento = (Pagamento) o;
        return id == pagamento.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
