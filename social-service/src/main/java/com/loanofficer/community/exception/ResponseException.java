package com.loanofficer.community.exception;

import lombok.Data;

@Data
public class ResponseException extends RuntimeException{
    private Integer code;
    public ResponseException(Integer code,String msg){
        super(msg);
        this.code=code;
    }

}
