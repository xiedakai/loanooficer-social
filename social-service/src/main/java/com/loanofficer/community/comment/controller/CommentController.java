package com.loanofficer.community.comment.controller;


import com.loanofficer.community.activity.result.ActivityCommentResult;
import com.loanofficer.community.comment.param.CommentParams;
import com.loanofficer.community.common.result.BaseResult;
import com.loanofficer.community.common.result.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/comment")
@Api(value = "社区微服务", tags = "评论模块")
public class CommentController {


    @ResponseBody
    @ApiOperation("添加评论")
    @PostMapping("{activityId}")
    public BaseResult comment(@RequestBody @Validated CommentParams commentParams) {
        return new BaseResult();
    }

    @ResponseBody
    @ApiOperation("删除评论")
    @DeleteMapping("/{commentId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "commentId", value = "当前用户id", dataType = "Long", required = true)
    })
    public BaseResult deleteComment(@PathVariable @NotNull(message = "评论id不能为null") Integer commentId) {
        return new BaseResult();
    }

    @ResponseBody
    @ApiOperation("举报评论")
    @PostMapping("accusation/{commentId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "commentId", value = "当前用户id", dataType = "Long", required = true)
    })
    public BaseResult accusation(@PathVariable @NotNull(message = "评论id不能为null") Integer commentId) {
        /**
         * 幂等处理
         */
        return new BaseResult();
    }

    @ResponseBody
    @ApiOperation("点赞")
    @PostMapping("thumbup/{commentId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "commentId", value = "当前用户id", dataType = "Long", required = true)
    })
    public BaseResult thumbup(@PathVariable @NotNull(message = "评论id不能为null") Integer commentId) {
        /**
         * 幂等处理
         */
        return new BaseResult();
    }

    @ResponseBody
    @ApiOperation("取消点赞")
    @PostMapping("cancelThumbup/{commentId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "commentId", value = "当前用户id", dataType = "Long", required = true)
    })
    public BaseResult cancelThumbup(@PathVariable @NotNull(message = "评论id不能为null") Integer commentId) {
        /**
         * 幂等处理
         */
        return new BaseResult();
    }

    @ResponseBody
    @ApiOperation("获取某条动态的精彩评论")
    @GetMapping("best/{activityId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "activityId", value = "动态id", dataType = "Long", required = true),
    })
    public PageResult<ActivityCommentResult> best(@Min(value = 1,message = "动态id参数不能为空") @RequestParam Long activityId) {
        return new PageResult<ActivityCommentResult>();
    }


    @ResponseBody
    @ApiOperation("最新的评论")
    @GetMapping("latest")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "activityId", value = "动态id", dataType = "Long", required = true),
    })
    public PageResult<ActivityCommentResult> latest(@Min(value = 1,message = "动态id参数不能为空") @RequestParam Long activityId) {
        return new PageResult<ActivityCommentResult>();
    }





}
