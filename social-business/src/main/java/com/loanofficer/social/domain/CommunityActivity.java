package com.loanofficer.social.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 社区-动态表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "community_activity")
public class CommunityActivity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 话题id
     */
    @TableField(value = "topic_id")
    private Long topicId;

    /**
     * 话题的名称
     */
    @TableField(value = "topic_name")
    private String topicName;

    /**
     * 发布者
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 发布者
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 发布者头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 认证城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 信用分等级
     */
    @TableField(value = "credit_rating_name")
    private String creditRatingName;

    /**
     * 点赞数量
     */
    @TableField(value = "thumbup_count")
    private Integer thumbupCount;

    /**
     * 评论数量
     */
    @TableField(value = "comment_count")
    private Integer commentCount;

    /**
     * 是否举报:0未举报;1已举报
     */
    @TableField(value = "is_accusation")
    private Byte isAccusation;

    /**
     * 是否删除:0未删除;1已删除
     */
    @TableField(value = "is_deleted")
    private Byte isDeleted;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField(value = "creator")
    private Long creator;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @TableField(value = "updater")
    private Long updater;

    private static final long serialVersionUID = 1L;
}