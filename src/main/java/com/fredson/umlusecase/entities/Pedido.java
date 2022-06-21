package com.fredson.umlusecase.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date instante;

    private Pagamento pagamento;

    public Pedido() {}

    public Pedido(Integer id, Date instante, Pagamento pagamento) {
        this.id = id;
        this.instante = instante;
        this.pagamento = pagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido pedido = (Pedido) o;
        return id.equals(pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
