package com.loanofficer.social.domain;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loanofficer.social.domain.CommunityActivityImgMapper;
import java.util.List;
import com.loanofficer.social.domain.CommunityActivityImg;
import com.loanofficer.social.domain.CommunityActivityImgService;

@Service
public class CommunityActivityImgServiceImpl extends ServiceImpl<CommunityActivityImgMapper, CommunityActivityImg> implements CommunityActivityImgService {

    @Override
    public int updateBatch(List<CommunityActivityImg> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CommunityActivityImg> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CommunityActivityImg> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(CommunityActivityImg record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CommunityActivityImg record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

