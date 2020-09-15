package com.loanofficer.community.exception;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class Error2StringUtils {

    public static String binding2String(BindingResult result) {
        StringBuilder res = new StringBuilder();
        for (FieldError error : result.getFieldErrors()) {
            res.append(error.getField()).append(": ").append(error.getDefaultMessage()).append("\r\n");
        }
        return res.toString();
    }


}
