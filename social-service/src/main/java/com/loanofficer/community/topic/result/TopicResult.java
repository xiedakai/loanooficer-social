package com.loanofficer.community.topic.result;

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
@ApiModel(value = "动态列表")
public class TopicResult implements Serializable {


    /**
     * 话题id
     */
    @ApiModelProperty(value = "话题id")
    private Long topicId;

    /**
     * 话题的名称
     */
    @ApiModelProperty(value = "话题的名称")
    private String topicName;

    /**
     * 大图
     */
    @ApiModelProperty(value = "大图")
    private String large;


    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Byte sortNum;



    private static final long serialVersionUID = 1L;
}

