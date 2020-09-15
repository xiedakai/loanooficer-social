package com.loanofficer.community.activity.result;


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
@ApiModel(value = "最近的点赞的个人")
public class LatelyThumbupsResult {

    /**
     * 点赞的userId
     */
    @ApiModelProperty(value = "点赞的userId")
    private Long userId;

    /**
     * 点赞的头像
     */
    @ApiModelProperty(value = "点赞的头像")
    private String avatar;


}
