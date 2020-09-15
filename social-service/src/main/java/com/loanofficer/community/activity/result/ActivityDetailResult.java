package com.loanofficer.community.activity.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "动态详情")
public class ActivityDetailResult {

    @ApiModelProperty(value = "动态id")
    private Long activityId;

    /**
     * 发布者
     */
    @ApiModelProperty(value = "发布者")
    private Long userId;

    /**
     * 发布者
     */
    @ApiModelProperty(value = "发布者")
    private String userName;

    /**
     * 发布者头像
     */
    @ApiModelProperty(value = "发布者头像")
    private String avatar;

    /**
     * 是否已关注:true已关注,false未关注
     */
    @ApiModelProperty(value = "是否已关注:true已关注,false未关注")
    private boolean following;

    /**
     * 动态内容
     */
    @ApiModelProperty(value = "动态内容")
    private String content;

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

    /**
     * 刚刚,1分钟前,X分钟前
     */
    @ApiModelProperty(value = "刚刚,1分钟前,X分钟前")
    private String passedTime;


    /**
     *  图片(无或有多张)
     */
    @ApiModelProperty(value = "图片(无或有多张)")
    private List<ActivityImgResult> activityImgs;

    /**
     * 最近的点赞的N个人
     */
    @ApiModelProperty(value = "最近的点赞的N个人")
    private List<LatelyThumbupsResult> latelyThumbups;


    /**
     * 点赞数量
     */
    @ApiModelProperty(value = "点赞数量")
    private Integer thumbupCount;

    /**
     * 评论数量
     */
    @ApiModelProperty(value = "评论数量")
    private Integer commentCount;


}
