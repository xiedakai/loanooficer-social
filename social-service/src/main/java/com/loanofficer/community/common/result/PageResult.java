package com.loanofficer.community.common.result;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@ApiModel(description="翻页结果集",parent = BaseResult.class)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PageResult<T> extends BaseResult {

    /**
     * 当前页
     */
    @ApiModelProperty(notes = "当前页")
    private int pageNum;


    @ApiModelProperty(notes = "每页数据条数")
    private int pageSize;


    @ApiModelProperty(notes = "总记录数")
    private long total;


}
