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
 * 社区-动态图片表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "community_activity_img")
public class CommunityActivityImg implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 动态id
     */
    @TableField(value = "activity_id")
    private Long activityId;

    /**
     * 发布者
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 图片url
     */
    @TableField(value = "img_url")
    private String imgUrl;

    /**
     * 图片类型:1thumbnail缩略图;2large大图
     */
    @TableField(value = "img_type")
    private Byte imgType;

    /**
     * 图片的位置1~9
     */
    @TableField(value = "pos")
    private Byte pos;

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