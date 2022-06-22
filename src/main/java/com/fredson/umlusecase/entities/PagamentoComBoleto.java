package com.fredson.umlusecase.entities;

import com.fredson.umlusecase.entities.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento {

    private static final long serialVersionUID = 1L;

    private Date dataVencimento;

    private Date dataPagamento;

    public PagamentoComBoleto() {}

    public PagamentoComBoleto(int id, EstadoPagamento estadoPagamento, Pedido pedido, Cliente cliente, Endereco endereco, Date dataVencimento, Date dataPagamento) {
        super(id, estadoPagamento, pedido, cliente, endereco);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
