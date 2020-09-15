package com.loanofficer.community.topic.result;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "动态列表")
public class TopicPageResult {

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
     * 缩略图
     */
    @ApiModelProperty(value = "缩略图")
    private String thumbnail;

    /**
     * 参与人数
     */
    private Integer joinCount;


}
