package com.loanofficer.social.domain;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.loanofficer.social.domain.CommunityActivityImg;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommunityActivityImgMapper extends BaseMapper<CommunityActivityImg> {
    int updateBatch(List<CommunityActivityImg> list);

    int updateBatchSelective(List<CommunityActivityImg> list);

    int batchInsert(@Param("list") List<CommunityActivityImg> list);

    int insertOrUpdate(CommunityActivityImg record);

    int insertOrUpdateSelective(CommunityActivityImg record);
}