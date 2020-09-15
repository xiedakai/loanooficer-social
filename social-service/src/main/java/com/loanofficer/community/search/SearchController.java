package com.loanofficer.community.search;


import com.loanofficer.community.activity.result.ActivityDetailResult;
import com.loanofficer.community.common.result.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.NotNull;


@RestController
@RequestMapping("/seach")
@Api(value = "社区微服务", tags = "搜索模块")
public class SearchController {


    @ApiOperation("搜索")
    @GetMapping("/{keyWords}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "keyWords", value = "关键字", dataType = "Long", required = true),
    })
    public BaseResult<ActivityDetailResult> detail(@PathVariable @NotNull(message = "关键字不能为null") String keyWords) {
        return new BaseResult<ActivityDetailResult>();

    }


}
