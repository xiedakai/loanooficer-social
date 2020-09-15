package com.loanofficer.community.user;

import com.loanofficer.community.common.result.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;


@Api(value = "社区微服务", tags = "社区用户关系模块")
@Controller
@RequestMapping("/relationship")
public class RelationshipController {

    @ResponseBody
    @ApiOperation("关注")
    @PostMapping("following/{followingUserId}/{followedUserId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "followingUserId", value = "当前用户id", dataType = "Long", required = true),
            @ApiImplicitParam(paramType = "path", name = "followedUserId", value = "被关注用户id", dataType = "Long", required = true),
    })
    public BaseResult following(@PathVariable @NotNull(message = "当前用户id不能为null") Integer followingUserId,
                                @PathVariable @NotNull(message = "被关注用户id不能为null") Integer followedUserId) {

        return new BaseResult();

    }

    @ResponseBody
    @ApiOperation("取消关注")
    @PostMapping("followingCancel/{followingUserId}/{followedUserId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "followingUserId", value = "当前用户id", dataType = "Long", required = true),
            @ApiImplicitParam(paramType = "path", name = "followedUserId", value = "被取消关注用户id", dataType = "Long", required = true),
    })
    public BaseResult followingCancel(@PathVariable @NotNull(message = "当前用户id不能为null") Integer followingUserId,
                                      @PathVariable @NotNull(message = "被取消关注用户id不能为null") Integer followedUserId) {
        return new BaseResult();
    }

    @ResponseBody
    @ApiOperation("屏蔽用户")
    @PostMapping("shielded/{userId}/{shieldedUserId}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "userId", value = "当前用户id", dataType = "Long", required = true),
            @ApiImplicitParam(paramType = "path", name = "shieldedUserId", value = "被屏蔽用户用户id", dataType = "Long", required = true),
    })
    public BaseResult shielded(@PathVariable @NotNull(message = "当前用户id不能为null") Integer userId,
                               @PathVariable @NotNull(message = "被屏蔽用户用户id不能为null") Integer shieldedUserId) {
        return new BaseResult();
    }

}
