package com.loanofficer.community.exception;

import com.alibaba.fastjson.JSON;
import com.loanofficer.community.common.result.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.StringUtils;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 *
 *  RestControllerAdvice: 对所有的controller生效
 *  ResponseEntityExceptionHandler
 *
 */
@Slf4j
@RestControllerAdvice
public class ApiExceptionHandler  {



    @ResponseBody
    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<BaseResult> signVerifyFailed(HttpServletRequest req, IllegalAccessException exception) {
        log.error("PARAM ERROR [URL={}\tPARAM={}\tMSG={}]", req.getRequestURL(), req.getQueryString(), exception.getMessage());
        return ResponseEntity.ok(new BaseResult(200,null," error msg",false));
    }

    @ResponseBody
    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<BaseResult> IllegalStateExceptionHandler(HttpServletRequest req, IllegalStateException exception) {
        log.warn("PARAM ERROR [URL={}\tPARAM={}\tMSG={}]", req.getRequestURL(), req.getQueryString(), exception.getMessage());
        return ResponseEntity.ok(new BaseResult(200,null," error msg",false));
    }

    /**
     *  接受json参数时 如果参数不符和条件,防止直接给客户端返回400
     * @param
     * @return
     */
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResponseEntity<BaseResult>  resolveException(HttpMessageNotReadableException   httpMessageNotReadableException) {
        log.error("BAD_REQUEST HttpMessageNotReadableException,ex={}",httpMessageNotReadableException);
        return ResponseEntity.ok(new BaseResult(200,null,"请求参数解析错误",false));
    }


    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<BaseResult> handlerMethodArgumentNotValidException(
            MethodArgumentNotValidException methodArgumentNotValidException) {
        //创建字符串操作对象StringBuilder
        StringBuilder sb = new StringBuilder();
        // 获取所有校验问题,拼接返回
        List<FieldError> fieldErrors = methodArgumentNotValidException.getBindingResult().getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            sb.append(fieldError.getDefaultMessage()+",");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        return ResponseEntity.ok(new BaseResult(200,null,sb.toString(),false));
    }


    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<BaseResult> constraintViolationHandler(HttpServletRequest req, ValidationException exception) {
        // 参数错误
        List<BindingField> bindingFields = new ArrayList<>();
        if (exception instanceof ConstraintViolationException) {
            ConstraintViolationException exs = (ConstraintViolationException) exception;

            Set<ConstraintViolation<?>> violations = exs.getConstraintViolations();
            for (ConstraintViolation<?> item : violations) {
                /**打印验证不通过的信息*/
                log.error(" 字段错误 ={}",item);
                bindingFields.add(new BindingField(item.getPropertyPath().toString(),item.getMessage()));
            }
        }

        return ResponseEntity.ok(new BaseResult(200,null, JSON.toJSONString(bindingFields),false));
    }

    /**
     *  自定义的RuntimeException异常
     * @param req
     * @param exception
     * @return
     */
    @ExceptionHandler(ResponseException.class)
    @ResponseBody
    public ResponseEntity<BaseResult> responseExceptionHandler(HttpServletRequest req, ResponseException exception) {
        // 自定义错误
        log.warn("ResponseException ERROR [URL={}\tPARAM={}\tMSG={}\tSTACK={}]", req.getRequestURL(), req.getQueryString(), exception.getMessage(), exception.getStackTrace());
        exception.printStackTrace();
        return ResponseEntity.ok(new BaseResult(exception.getCode(),null,exception.getMessage(),false));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public ResponseEntity<BaseResult> illegalArgumentExceptionHandler(HttpServletRequest req, IllegalArgumentException exception) {
        // Precondition产生的业务错误
        log.warn("IllegalArgumentException ERROR [URL={}\tPARAM={}\tMSG={}]", req.getRequestURL(), req.getQueryString(), exception.getMessage());
        exception.printStackTrace();
        return ResponseEntity.ok(new BaseResult(200,null,exception.getMessage(),false));
    }

    /**
     * 限流相关的错误
     * 预留
     */



    @ResponseBody
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex) {
        log.error("handleMissingServletRequestParameter ex= {}",ex);
        return ResponseEntity.ok(new BaseResult(200,null,ex.getParameterName() + " " + ex.getMessage(),false));
    }

    @ResponseBody
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<BaseResult> baseThrowableHandler(HttpServletRequest req, Throwable exception) {
        exception.printStackTrace();
        if (StringUtils.isEmpty(exception.getMessage())) {
            log.error("未知错误 ERROR [url={}\tparam={}\tmsg={}\texception={}\tstackTrance={}]", req.getRequestURL(), req.getQueryString(), "Message is null", exception.getClass().getName(), exception.getStackTrace());
            return ResponseEntity.ok(new BaseResult(200,null,exception.getMessage(),false));
        }
        log.error("未知错误 ERROR [url={}\tparam={}\tmsg={}\texception={}\tstackTrance={}]", req.getRequestURL(), exception.getLocalizedMessage(), req.getQueryString(), exception.getClass().getName(), exception.getStackTrace());
        return ResponseEntity.ok(new BaseResult(200,null,exception.getMessage(),false));

    }


}
