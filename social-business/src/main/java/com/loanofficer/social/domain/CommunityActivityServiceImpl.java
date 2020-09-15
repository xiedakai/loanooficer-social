package com.loanofficer.social.domain;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.loanofficer.social.domain.CommunityActivityMapper;
import com.loanofficer.social.domain.CommunityActivity;
import com.loanofficer.social.domain.CommunityActivityService;
@Service
public class CommunityActivityServiceImpl extends ServiceImpl<CommunityActivityMapper, CommunityActivity> implements CommunityActivityService{

    @Override
    public int updateBatch(List<CommunityActivity> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<CommunityActivity> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<CommunityActivity> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(CommunityActivity record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(CommunityActivity record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
