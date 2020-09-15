package com.loanofficer.social.domain;

import java.util.List;
import com.loanofficer.social.domain.CommunityActivityImg;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CommunityActivityImgService extends IService<CommunityActivityImg> {


    int updateBatch(List<CommunityActivityImg> list);

    int updateBatchSelective(List<CommunityActivityImg> list);

    int batchInsert(List<CommunityActivityImg> list);

    int insertOrUpdate(CommunityActivityImg record);

    int insertOrUpdateSelective(CommunityActivityImg record);

}

