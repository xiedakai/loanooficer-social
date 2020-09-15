package com.loanofficer.community.topic;


import com.loanofficer.community.activity.result.ActivityDetailResult;
import com.loanofficer.community.activity.result.ActivityPageResult;
import com.loanofficer.community.common.result.BaseResult;
import com.loanofficer.community.common.result.PageResult;
import com.loanofficer.community.topic.result.TopicPageResult;
import com.loanofficer.community.topic.result.TopicResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;



@Api(value = "社区微服务", tags = "话题模块")
@RestController
@RequestMapping("/topic")
public class TopicContoller {

    @ApiOperation("获取推荐的话题")
    @GetMapping("recommend")
    @ApiImplicitParams({})
    public BaseResult<List<TopicResult>> recommend() {
        return new BaseResult<List<TopicResult>>();
    }

    @ApiOperation("推荐的话题列表")
    @GetMapping("")
    @ApiImplicitParams({
    })
    public PageResult<TopicPageResult> latest() {
        return new PageResult<TopicPageResult>();
    }

    @ApiOperation("话题详情")
    @GetMapping("/{topicId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "topicId", value = "话题id", dataType = "Long", required = true),
    })
    public BaseResult<ActivityDetailResult> detail(@PathVariable @NotNull(message = "话题id不能为null") Integer topicId) {
        return new BaseResult<ActivityDetailResult>();

    }


}
