package com.loanofficer.community.comment.result;

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
@ApiModel(value = "动态的评论")
public class ActivityCommentResult implements Serializable {


    /**
     * 评论者id
     */
    @ApiModelProperty(value = "评论者id")
    private Long userId;

    /**
     * 评论者userName
     */
    @ApiModelProperty(value = "评论者userName")
    private String userName;

    /**
     * 评论者头像
     */
    @ApiModelProperty(value = "评论者头像")
    private String avatar;

    /**
     * 认证城市
     */
    @ApiModelProperty(value = "认证城市")
    private String city;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private String content;

    /**
     * 点赞数量
     */
    @ApiModelProperty(value = "点赞数量")
    private Integer thumbupCount;

    /**
     * 回复数
     */
    @ApiModelProperty(value = "回复数")
    private Integer replyCount;

    /**
     * 刚刚,1分钟前,X分钟前
     */
    @ApiModelProperty(value = "刚刚,1分钟前,X分钟前")
    private String passedTime;


    private static final long serialVersionUID = 1L;
}

