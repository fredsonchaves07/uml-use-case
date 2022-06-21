package com.fredson.umlusecase.entities;

import com.fredson.umlusecase.entities.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;

    private int numeroDeParcelas;

    public PagamentoComCartao() {

    }

    public PagamentoComCartao(int id, EstadoPagamento estadoPagamento, Pedido pedido, Cliente cliente, Endereco endereco, int numeroDeParcelas) {
        super(id, estadoPagamento, pedido, cliente, endereco);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
