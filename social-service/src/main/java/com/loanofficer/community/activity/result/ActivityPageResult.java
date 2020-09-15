package com.loanofficer.community.activity.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "动态列表")
public class ActivityPageResult implements Serializable {

    /**
     * 动态id
     */
    @ApiModelProperty(value = "动态id")
    private Long activityId;

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
     * 点赞数量
     */
    @ApiModelProperty(value = "点赞数量")
    private Integer thumbupCount;

    /**
     * 评论数量
     */
    @ApiModelProperty(value = "评论数量")
    private Integer commentCount;

    /**
     *  图片(无或有多张)
     */
    @ApiModelProperty(value = "图片(无或有多张)")
    private List<ActivityImgResult> activityImgs;

    /**
     * 自己的评论
     */
    @ApiModelProperty(value = "自己的评论")
    private List<String> selfComments;


    private static final long serialVersionUID = 1L;
}

