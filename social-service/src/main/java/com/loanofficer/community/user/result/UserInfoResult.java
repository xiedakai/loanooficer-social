package com.loanofficer.community.user.result;


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
@ApiModel(value = "社区用户")
public class UserInfoResult {

    /**
     * 粉丝数
     */
    @ApiModelProperty(value = "粉丝数")
    private int followedCount;

    /**
     * 关注人数
     */
    @ApiModelProperty(value = "关注人数")
    private int followingCount;

    /**
     * userId
     */
    @ApiModelProperty(value = "userId")
    private Long userId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 是否已关注:true已关注,false未关注
     */
    @ApiModelProperty(value = "是否已关注:true已关注,false未关注")
    private boolean following;

    /**
     * 认证城市
     */
    @ApiModelProperty(value = "认证城市")
    private String city;

    /**
     * 信用分等级
     */
    @ApiModelProperty(value = "信用分等级")
    private String creditRatingName;



}
