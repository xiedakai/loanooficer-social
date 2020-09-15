package com.loanofficer.social.domain;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.loanofficer.social.domain.CommunityActivity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommunityActivityMapper extends BaseMapper<CommunityActivity> {
    int updateBatch(List<CommunityActivity> list);

    int updateBatchSelective(List<CommunityActivity> list);

    int batchInsert(@Param("list") List<CommunityActivity> list);

    int insertOrUpdate(CommunityActivity record);

    int insertOrUpdateSelective(CommunityActivity record);
}