package com.jenson.ecommerce.service.impl;

import com.jenson.ecommerce.service.UmsMemberLevelService;
import com.jenson.ecommerce.mapper.UmsMemberLevelMapper;
import com.jenson.ecommerce.model.UmsMemberLevel;
import com.jenson.ecommerce.model.UmsMemberLevelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员等级管理Service实现类
 *
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
