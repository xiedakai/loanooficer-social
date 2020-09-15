package com.loanofficer.community.comment.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "添加评论请求参数")
public class CommentParams {

    /**
     * 动态id
     */
    @Min(value = 1L,message = "动态id不能为空")
    @ApiModelProperty(value = "动态id",required = true)
    private Long activityId;

    /**
     * userId
     */
    @Min(value = 1L,message = "userId不能为空")
    @ApiModelProperty(value = "userId",required = true)
    private Long userId;

    /**
     * 内容
     */
    @NotBlank(message = "内容不能为空")
    @ApiModelProperty(value = "内容",required = true)
    private String content;




}
