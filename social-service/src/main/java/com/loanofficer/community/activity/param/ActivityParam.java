package com.loanofficer.community.activity.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "发布动态请求参数")
public class ActivityParam {

    /**
     * 话题id
     */
    @Min(value = 1L,message = "话题id")
    @ApiModelProperty(value = "话题id",required = false)
    private Long topicId;

    /**
     * userId
     */
    @NotNull
    @Positive(message = "userId只能为正数")
    @ApiModelProperty(value = "userId只能为正数",required = true)
    private Long userId;

    /**
     * 内容
     */
    @NotBlank(message = "内容不能为空")
    @ApiModelProperty(value = "内容",required = true)
    private String content;


}
