package com.loanofficer.social.domain;

import java.util.List;
import com.loanofficer.social.domain.CommunityActivity;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CommunityActivityService extends IService<CommunityActivity>{


    int updateBatch(List<CommunityActivity> list);

    int updateBatchSelective(List<CommunityActivity> list);

    int batchInsert(List<CommunityActivity> list);

    int insertOrUpdate(CommunityActivity record);

    int insertOrUpdateSelective(CommunityActivity record);

}
