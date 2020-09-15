package com.loanofficer.community.activity.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "动态图片")
public class ActivityImgResult implements Serializable {


    /**
     * 发布者
     */
    @ApiModelProperty(value = "发布者")
    private Long userId;

    /**
     * 图片url
     */
    @ApiModelProperty(value = "图片url")
    private String imgUrl;

    /**
     * 图片类型:1thumbnail缩略图;2large大图
     */
    @ApiModelProperty(value = "图片类型:1thumbnail缩略图;2large大图")
    private Byte imgType;

    /**
     * 图片的位置1~9
     */
    @ApiModelProperty(value = "图片的位置1~9")
    private Byte pos;


    private static final long serialVersionUID = 1L;
}

