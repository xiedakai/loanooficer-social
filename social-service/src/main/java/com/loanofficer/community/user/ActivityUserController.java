package com.loanofficer.community.user;

import com.loanofficer.community.common.result.PageResult;
import com.loanofficer.community.user.result.UserInfoResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.constraints.NotNull;

@Api(value = "社区微服务", tags = "社区用户模块")
@Controller
@RequestMapping("/user")
public class ActivityUserController {


    @ResponseBody
    @ApiOperation("(用户主页)获取某个用户的信息:关注数,粉丝数等")
    @GetMapping("/{userId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "userId", value = "userId", dataType = "Long", required = true),
    })
    public PageResult<UserInfoResult> usersActivities(@PathVariable @NotNull(message = "userId不能为null") Integer userId) {

        return new PageResult<UserInfoResult>();

    }




}
