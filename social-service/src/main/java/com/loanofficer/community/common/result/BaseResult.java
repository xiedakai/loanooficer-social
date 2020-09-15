package com.loanofficer.community.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Data
@ApiModel(description="基础结果集")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BaseResult<T> implements Result {


    @ApiModelProperty(notes = "状态码")
    private Integer code;


    @ApiModelProperty(notes = "数据")
    private T data;


    @ApiModelProperty(notes = "消息")
    private String msg;

    @ApiModelProperty(notes = "是否成功(默认false)")
    private boolean success = false;

    public BaseResult(boolean success,Integer code){
        this.success = success;
        this.code = code;
    }
}
