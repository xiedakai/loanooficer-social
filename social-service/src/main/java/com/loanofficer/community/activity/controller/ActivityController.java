package com.loanofficer.community.activity.controller;


import com.loanofficer.community.activity.param.ActivityParam;
import com.loanofficer.community.activity.result.ActivityDetailResult;
import com.loanofficer.community.activity.result.ActivityPageResult;
import com.loanofficer.community.comment.result.ThumbupUserInfo;
import com.loanofficer.community.common.result.BaseResult;
import com.loanofficer.community.common.result.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;


@Validated
@RestController
@RequestMapping("/activity")
@Api(value = "社区微服务", tags = "动态模块")
public class ActivityController {

    @ResponseBody
    @ApiOperation("添加动态")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public BaseResult comment(@RequestBody @Valid ActivityParam activityParam, BindingResult bindingResult) {
        return new BaseResult(true,200);
    }

    @ResponseBody
    @ApiOperation("最新的动态")
    @GetMapping("latest")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "userId", value = "userId", dataType = "Long", required = true),
    })
    public PageResult<ActivityPageResult> latest(@Valid @NotNull(message = "userId参数不能为空")
                                                     @Positive(message = "userId需为正数") @RequestParam Long userId) {
        PageResult<ActivityPageResult> pageResult = new PageResult<ActivityPageResult>();
        List list = new ArrayList<>();
        ActivityPageResult activityPageResult = new ActivityPageResult();
        activityPageResult.setUserId(99887L);
        activityPageResult.setUserName("常凯申");
        list.add(activityPageResult);
        pageResult.setData(list);
        return pageResult;
    }

    @ResponseBody
    @ApiOperation("动态详情")
    @GetMapping("/{activityId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "activityId", value = "动态id", dataType = "Long", required = true),
    })
    public BaseResult<ActivityDetailResult> detail(@PathVariable @NotNull(message = "动态id不能为null") Integer activityId) {
        return new BaseResult<ActivityDetailResult>();

    }

    @ResponseBody
    @ApiOperation("获取某条动态点赞的用户列表")
    @GetMapping("thumbups/{activityId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "activityId", value = "动态id", dataType = "Long", required = true),
    })
    public PageResult<ThumbupUserInfo> thumbupUser(@Min(value = 1,message = "动态id参数不能为空") @RequestParam Long activityId) {
        return new PageResult<ThumbupUserInfo>();
    }

    @ResponseBody
    @ApiOperation("某个用户的动态列表")
    @GetMapping("/user/{userId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "userId", value = "userId", dataType = "Long", required = true),
    })
    public PageResult<ActivityPageResult> usersActivities(@PathVariable @NotNull(message = "userId不能为null") Integer userId) {
        return new PageResult<ActivityPageResult>();

    }

    @ResponseBody
    @ApiOperation("某个话题的动态列表")
    @GetMapping("/user/{topicId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "话题Id", value = "topicId", dataType = "Long", required = true),
    })
    public PageResult<ActivityPageResult> topicActivities(@PathVariable @NotNull(message = "话题Id不能为null") Integer topicId) {
        return new PageResult<ActivityPageResult>();

    }





}
