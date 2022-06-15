package com.fredson.umlusecase.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer status;

    private String mensage;

    private Long timeStamp;

    public StandardError(Integer status, String mensage, Long timeStamp) {
        this.status = status;
        this.mensage = mensage;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
